/*<applet code="Dig" width=900 height=300>
</applet>*/
import java.awt.*;
import java.applet.*;
import java.util.Calendar;

public class Dig extends Applet implements Runnable{
	Thread t;

	public void init(){
		setBackground(Color.black);
		t=new Thread(this);	
	}
	
	public void start(){
		t.start();
	}
	
	public void run(){
		while(true){
			try{Thread.sleep(1000);}
			catch(InterruptedException e){}
			repaint();
		}
	}
		
	public void paint(Graphics g){
		Calendar c=Calendar.getInstance();
		g.setColor(Color.white);
		g.setFont(new Font("SansSerif",Font.BOLD,200));
		g.drawString(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND),100,200);

	}
}