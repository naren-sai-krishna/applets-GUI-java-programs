	/*<applet code="Catch"  width=1000 height=600>
		</applet>*/
import java.applet.*;
import java.awt.*;
public class Catch extends Applet implements Runnable{
	int no=0;int j=0;int i=0;int k=0;

	public void init(){
	Thread t=new Thread(this);
	t.start();
	}

	public void run(){
		while(true){
			try{
				Thread.sleep(100);
				repaint();
			}
			catch(InterruptedException e){}
		}	
	}

	public void paint(Graphics g){
		
		
		g.drawLine(0,530,1000,530);		
	
		no+=10;
		g.setColor(Color.red);
		g.fillOval(146,363+50,30,30);
		g.setColor(Color.black);
		g.drawLine(160,390+50,160,420+50);
		g.drawLine(160,400+50,190,410+50-j);
		g.drawLine(160,400+50,130,410+50);
		g.drawLine(160,420+50,175,480+50);
		g.drawLine(160,420+50,145,480+50);
	
		g.setColor(Color.green);
		g.fillOval(846,363+50,30,30);
		g.setColor(Color.black);
		g.drawLine(860,390+50,860,420+50);
		g.drawLine(860,400+50,890,410+50);
		g.drawLine(860,400+50,830,410+50-i);
		g.drawLine(860,420+50,875,480+50);
		g.drawLine(860,420+50,845,480+50);

	if(no>=50){
		i=20;
		if(no>=70)
		throwball(g);
	}
	if(no>=270){
		j=20;
		i=0;
		k=1000;
		
	}
	if(no>=300){
			j=0;
			g.setColor(Color.black);
			Font f=new Font("SansSerif",Font.BOLD,100);
			g.setFont(f);
			g.drawString("Good Catch!!",150,150);
		}
   }
	public void throwball(Graphics g){
		g.setColor(Color.black);
		g.fillOval(810+k,440,10,10);
		k-=30;	
	}
}