//Hand-Shake

/* <applet code = "test" width = 300 height = 300> </applet> */
import java.applet.*;
import java.awt.*;
import java.util.Date;
public class test extends Applet implements Runnable
{
String s;
int i,j;
boolean flag=false;
Thread t;
public void start(){
flag=false;
i=0;j=300;
s="Hello";
t=new Thread(this,s);
t.start();
}
public void stop(){
t=null;
flag=true;}

public void run(){
while(!flag){
try{
Thread.sleep(500);
repaint();
}
catch(InterruptedException e){}}
}
 public void paint(Graphics g)
    {


g.setColor(Color.black);
g.fillOval(i,200,20,20);      //face1

g.setColor(Color.black);
g.drawLine(i+10,200,i+10,250); //body1

g.setColor(Color.blue);     //legs1
g.drawLine(i+10,250,i+40,280);

g.setColor(Color.blue);     //legs1
g.drawLine(i+10,250,i-20,280);

g.setColor(Color.black);
g.fillOval(j-20,200,20,20);      //face2

g.setColor(Color.black);
g.drawLine(j-10,200,j-10,250); //body2

g.setColor(Color.blue);     //legs2
g.drawLine(j-10,250,j-40,280);

g.setColor(Color.blue);     //legs2
g.drawLine(j-10,250,j+20,280);
i+=10;
j-=10;
if((i+40)==j){
g.setColor(Color.black);
g.drawLine(i,230,i+30,235);
g.drawLine(j,230,j-30,235);
stop();
try{
Thread.sleep(2000);
}
catch(InterruptedException e){}
}

else{
g.setColor(Color.black);
g.drawLine(i,230,i+20,250);
g.drawLine(i,230,i-20,250);
g.drawLine(j,230,j+20,250);
g.drawLine(j,230,j-20,250);
}     
}
}