
/* <applet code = "BannerApplet" width = 1000 height = 600> </applet> */
import java.applet.*;
import java.applet.*;
import java.awt.*;

public class BannerApplet extends Applet implements Runnable{
	String str,str1;
	Thread t;
	char c,c1;

public void init(){
	str="HELLO WORLD...THIS IS ROBO 2.0 :-) ";
	str1="WELCOME TO THE WORLD OF ROBOTS ;-)";
}

public void start(){
	
	t=new Thread(this);
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


 public void paint(Graphics g)
    {
g.setFont(new Font("Monospaced",Font.BOLD,50));
g.setColor(Color.orange);
c=str.charAt(0);
str=str.substring(1,str.length())+c;
g.drawString(str,0,200);
g.setColor(Color.blue);
c1=str1.charAt(0);
str1=str1.substring(1,str1.length())+c1;
g.drawString(str1,0,400);
}}