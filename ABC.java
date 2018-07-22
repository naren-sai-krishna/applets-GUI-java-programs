/*<applet code="ABC"  width=1000 height=600>
</applet>*/
import java.applet.*;
import java.awt.*;
public class ABC extends Applet implements Runnable{
int i=0;
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
g.setColor(Color.gray);
g.fill3DRect(i-390,260,50,50,true);
g.setColor(Color.red);
g.fill3DRect(i-420,300,150,50,true);
g.setColor(Color.black);
g.fillOval(i-325,345,30,30);
g.fillOval(i-400,345,30,30);
g.drawLine(0,375,1000,375);
i+=10;

g.setColor(Color.gray);
g.fill3DRect(i-390,260,50,50,true);
g.setColor(Color.red);
g.fill3DRect(i-420,300,150,50,true);
g.setColor(Color.black);
g.fillOval(i-325,345,30,30);
g.fillOval(i-400,345,30,30);
g.drawLine(0,375,1000,375);
j-=10;

}
}