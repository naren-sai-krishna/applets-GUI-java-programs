import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*<applet code="Project.java" width=700 height =800></applet>*/

public class Project extends Applet implements Runnable{
Thread t;
String str="";int count=0;
Font f=new Font("SansSerif",Font.PLAIN+Font.BOLD,30);


public void init(){
setBackground(Color.orange);
setForeground(Color.blue);
setFont(f);
}


public void paint(Graphics g){
Graphics2D g2= (Graphics2D)g;
if(count>21&&count<70){
//nodes postioning..
g.setColor(Color.red);
g.fillOval(300,100,50,50); //1          
g.fillOval(250,200,50,50); //2        
g.fillOval(350,200,50,50); //3         
g.fillOval(200,300,50,50); //4      
g.fillOval(300,300,50,50); //5
g.fillOval(150,400,50,50); //6
g.fillOval(250,400,50,50); //7
g.fillOval(350,400,50,50); //8
g.fillOval(400,500,50,50); //9


/*
borders around nodes..
*/
g.setColor(Color.blue);
g.drawOval(300,100,49,49);
g.drawOval(250,200,49,49);
g.drawOval(350,200,49,49);
g.drawOval(200,300,49,49);
g.drawOval(300,300,49,49);
g.drawOval(150,400,49,49); 
g.drawOval(250,400,49,49); 
g.drawOval(350,400,49,49); 
g.drawOval(400,500,49,49);

//nodes linking..

g.drawLine(325,150,275,200);   //1-2
g.drawLine(325,150,375,200);   //1-3
g.drawLine(275,250,225,300);   //2-4
g.drawLine(275,250,325,300);   //2-5
g.drawLine(225,350,175,400);   //4-6
g.drawLine(225,350,275,400);   //4-7
g.drawLine(335,345,375,400);   //5-8
g.drawLine(385,445,425,500);   //8-9


g.setColor(Color.blue);
g.drawString("A",315,135);
g.drawString("B",265,235);                     //300,125 ,250,125  1
g.drawString("C",365,235);
g.drawString("D",215,335);                    //250,225,200,225   2
g.drawString("E",315,335);                      //4//200,325,150,325 4
g.drawString("F",165,435);
g.drawString("G",265,435);                   
g.drawString("H",365,435);
g.drawString("I",420,535);
if(count>38){           
try{ 
g.drawString(str,300,600);           
 t.sleep(1000); } catch(InterruptedException e){}
  }   }

// arrows left side..
if(count>30&&count<=33)
 g.drawString("-->",240,125);// al
if(count>33&&count<=36)
 g.drawString("-->",190,225);//bl
if(count>36&&count<=39)
 g.drawString("-->",140,325);//dl
if(count>39&&count<=40){
 g.drawString("-->",90,425);//fl
str+="F-"; try{  t.sleep(500); } catch(InterruptedException e){}
}
if(count>40&&count<=41){
  g.drawString("<--",300,425);//gr
str+="G-";try{  t.sleep(500); } catch(InterruptedException e){}
}
if(count>41&&count<=42){
g.drawString("<--",250,325);//dr
str+="D-"; try{  t.sleep(500); } catch(InterruptedException e){}
}
if(count>42&&count<=43){
 g.drawString("<--",350,325);//er
str+="E-"; try{  t.sleep(500); } catch(InterruptedException e){}
}
if(count>43&&count<=44){
 g.drawString("<--",400,425);//hr
str+="H-";try{  t.sleep(500); } catch(InterruptedException e){}
}

if(count>44&&count<=45){
 g.drawString("<--",450,525);//ir
str+="I-"; try{  t.sleep(500); } catch(InterruptedException e){}
}

if(count>45&&count<=46){
g.drawString("<--",310,225);//br
str+="B-"; try{  t.sleep(500); } catch(InterruptedException e){}
}

if(count>46&&count<=47){
 g.drawString("<--",430,225);//cr
str+="C-"; try{  t.sleep(500); } catch(InterruptedException e){}
}

if(count>47&&count<=48){
 g.drawString("<--",350,125);//ar
str+="A"; try{  t.sleep(500); } catch(InterruptedException e){}
}

if(count>=0&&count<=10)    {   
 g.setColor(Color.black);
        g.drawString("BINARY SEARCH TREE",200,150);
        g.drawString("POSTORDER TRAVERSAL",180,180);
        g.setColor(Color.blue);
        new Font("sansSerif",Font.PLAIN,3);
	g.drawString("Case Study By 200,201,203",150,400);
        g.setColor(Color.blue);
       
      try{  t.sleep(200); } catch(InterruptedException e){}
  }
if(count>10&&count<=20){
 g.setColor(Color.blue);
        g.drawString("POSTORDER TRAVERSAL",200,100);
     
        g.setColor(Color.black);
        g.drawString("POSTORDER TRAVEL MEANS ..",10,150);
        g.drawString("LEFTNODE->RIGHTNODE->ROOT",10,180);
        g.drawString("TRAVERSING START FROM LEAF NODES",10,240);
       try{t.sleep(250);}catch(InterruptedException e){}
 }        
if(count>=70)   {
g.drawString("Thank you",250,200);
}
count++;
}


public void start(){ 
   t=new Thread(this);
   t.start();
}


public void run(){
 while(true){  
  try{
     repaint();
     t.sleep(500);
    }
  catch(InterruptedException e){}
}
}
}