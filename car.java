/*<applet code="car"  width=1000 height=600>
</applet>*/
import java.applet.*;
import java.awt.*;
public class car extends Applet implements Runnable{
int k=1000;int j=0;
public void init(){
Thread t=new Thread(this);
t.start();}

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
before(g);
}
public void before(Graphics g){
g.setColor(Color.black); 
g.drawLine(0,530,1000,530);
g.setColor(Color.yellow); 
g.fill3DRect(j-20,470,220,40,true);
g.fill3DRect(j,430,150,80,true);
g.setColor(Color.yellow);
g.fillOval(j+30,505,30,30);
g.fillOval(j+120,505,30,30);
g.fill3DRect(j+20,440,40,30,true);
g.fill3DRect(j+100,440,40,30,true);

j+=30;
}
}