 
 import java.applet.*; 
 import java.awt.*;  
 import java.awt.event.*;  
 import java.util.Random;
 //Package Declarations 
/*<applet code= “BallBounce.class” width=500 height=500>
</applet>*/
 public class BallBounce extends Applet implements Runnable  
 {  
 Random r = new Random(); 
// Generate Random number to fill the ball with random colors at different positions   
 int x = 10, y = 10,dia1 = 0, dia2 = 0, higt = 500 , widt = 500;  
 public void init()  
 {  
 Thread th = new Thread(this); // creates thread for better animation.    th.start();  //starts thread
 }  
 public void run()  
 {  
 while(true)  
 {  
 try  // handle exceptions
 {  
 repaint();  
 Thread.sleep(50);   // the time interval for ball to change its position is 50 milli seconds.   
 // setting ball at different positions of applet screen
if( x < widt - 100)
 x += 5;  
 if( y < higt - 100)  
 y += 5;  
 if( x > widt - 100)  
 x = widt - 100;  
 if( y > higt - 100)  
 y = higt - 100;  
 dia1 += 10;  
 dia2 += 10;  
 }  
 catch(Exception e)  
 {
System.out.println("Ball is out of the screen");
}  
 }  
 }  
 public void paint(Graphics gc)  //To draw the ball on the applet screen
 {  
 Dimension di = getSize();  
 higt = di.height;  
 widt = di.width;  
 gc.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255))); // set the random colors for the ball at the different positions on the screen
 gc.fillArc(x,20,100,100,dia1,90);  
 gc.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));  
 gc.fillArc(x,20,100,100,dia1 + 90,90);  
 gc.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));  
 gc.fillArc(x,20,100,100,dia1 + 180,90);  
 gc.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));  
 gc.fillArc(x,20,100,100,dia1 + 270,90);  
 gc.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));  
 gc.fillArc(10, y, 100, 100, dia2 ,90);  
 gc.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));  
 gc.fillArc(10,y,100,100, dia2 + 90,90);  
 gc.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));  
 gc.fillArc(10,y,100,100,dia2 + 180,90);  
 gc.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));  
 gc.fillArc(10,y,100,100,dia2 + 270,90);  
 }  
 }