/*<applet code="F" width=1000 height=500>
</applet> */
import java.awt.*;
import java.applet.*;

public class F extends Applet implements Runnable{
	Thread t;Font f;
	int i;
	public void init(){
		setBackground(Color.black);
	}
	public void start(){	
		t=new Thread(this);
		t.start();
	}
	public void run(){
		while(true){
			try{
				Thread.sleep(1000);		
			}
			catch(Exception e){}
			repaint();
		}
	}
	public void font1(Graphics g){
		f=new Font("Serif",Font.BOLD,60);
		g.setColor(Color.blue);
		g.setFont(f);
		setBackground(Color.red);
	}
	public void font2(Graphics g){
		f=new Font("Monospaced",Font.BOLD,70);
		g.setColor(Color.pink);
		g.setFont(f);
		setBackground(Color.green);
	}
	public void font3(Graphics g){
		f=new Font("SansSerif",Font.BOLD,60);
		g.setColor(Color.yellow);
		g.setFont(f);
		setBackground(Color.cyan);
	}


	public void paint(Graphics g){
		if(i<=10)
			font1(g);
		if(i>10&&i<=20)
			font2(g);
		if(i>20)
			font3(g);
		

		g.drawString("HELLO",450,230);
		i+=3;
		if(i>30)
			i=0;
	}
}	