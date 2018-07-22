/*<applet code="Clock" width=1100 height=400>
</applet>*/
import java.awt.*;
import java.applet.*;
import java.util.Calendar;

public class Clock extends Applet implements Runnable{
	Thread t;
	String hour_str,min_str,sec_str;
	int width,height;
	int sec,min,hrs;
	int xcoord,ycoord;
	public void init(){
		setBackground(Color.black);
		width=300;
		height=300;
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
		
	void secHand(double angle, int radius, Graphics g){
	        angle-=0.5*Math.PI;
	        xcoord=(int)(radius*Math.cos(angle));
	        ycoord=(int)(radius*Math.sin(angle));
	        g.drawLine(width/2,height/2,width/2+xcoord,height/2+ycoord);
        }

	void hourHand(double angle, int radius, Graphics g){
	        angle-=0.5*Math.PI;
	        xcoord=(int)(radius*Math.cos(angle));
	        ycoord=(int)(radius*Math.sin(angle));
	        g.drawLine(width/2,height/2,width/2+xcoord,height/2+ycoord);
        }

	void minHand(double angle, int radius, Graphics g){
       		angle-=0.5*Math.PI;
        	xcoord=(int)(radius*Math.cos(angle));
        	ycoord=(int)(radius*Math.sin(angle));
        	g.drawLine(width/2,height/2,width/2+xcoord,height/2+ycoord);
        }


	public void paint(Graphics g){
		g.setColor(Color.pink);
		g.setFont(new Font("Serief",Font.BOLD,50));
		g.drawString("ANALOG",50,350);
		g.drawString("DIGITAL",600,350);

		
	 	Calendar c=Calendar.getInstance();
                hrs=c.get(Calendar.HOUR_OF_DAY);
                if(hrs>12)hrs-=12;
                min=c.get(Calendar.MINUTE);
                sec=c.get(Calendar.SECOND);
      		
		g.setColor(Color.blue);
		g.fillOval(0,0,width,height);
		//g.setColor(Color.green);
		//g.fillRect(350,50,700,200);
		
		g.setColor(Color.green);
 		g.fillOval(width/2-5,width/2-5,10,10);
	        hourHand(2*Math.PI*hrs/12,width-215,g);
  	        minHand(2*Math.PI*min/60,width-185,g);
	        secHand(2*Math.PI*sec/60,width-160,g);
		

		hour_str=""+c.get(Calendar.HOUR);	
		min_str=""+c.get(Calendar.MINUTE);	
		sec_str=""+c.get(Calendar.SECOND);

		g.setColor(Color.red);
		g.setFont(new Font("Sans_Serief",Font.BOLD,150));
		if(c.get(Calendar.HOUR)>=0&&c.get(Calendar.HOUR)<=9)
		hour_str="0"+c.get(Calendar.HOUR);
		if(c.get(Calendar.MINUTE)>=0&&c.get(Calendar.MINUTE)<=9)
		min_str="0"+c.get(Calendar.MINUTE);
		if(c.get(Calendar.SECOND)>=0&&c.get(Calendar.SECOND)<=9)
		sec_str="0"+sec_str;
		
		g.drawString(hour_str+":"+min_str+":"+sec_str,400,200);
			
	}	
	
}
