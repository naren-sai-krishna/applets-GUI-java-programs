/*<applet code="App1" width=1000 height=600>
</applet>*/
import java.applet.*;
import java.awt.*;
public class App1 extends Applet implements Runnable{
int i=0;
int k=0;
	public void init(){
		setBackground(Color.black);
	}
	public void start(){
	Thread t=new Thread(this);
	t.start();
	}
	public void run(){
	while(true){
	
	
	try{
	Thread.sleep(1000);
	repaint();
	
	}
	catch(InterruptedException e){}
	} 
	}
	
	
	public void paint(Graphics g){
	
	g.setColor(Color.white);
		g.fill3DRect(400,600-i,200,300,true);
		Font f=new Font("SansSerif",Font.BOLD,50);
		g.setFont(f);
		g.setColor(Color.red);
		g.drawString(Integer.toString(k),490,780-i);
		
		i=i+100;
	   if(i>=900){
	   i=0;
	   k++;
	   }
	    if(i==600){
	    g.drawLine(500,150,500,200);
	    g.drawLine(500,150,470,170);
	    g.drawLine(500,150,530,170);
	}
	}
}

