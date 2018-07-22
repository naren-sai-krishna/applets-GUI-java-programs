
/* <applet code = "RepublicDay" width = 1000 height = 600> </applet> */
import java.applet.*;
import java.awt.*;
import java.util.Calendar;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class RepublicDay extends Applet implements Runnable,MouseListener{
	AudioClip a;
	AudioClip jan;
	int x=0;int y=0;
	int move=0;
	int move3=0;
	String str;
	boolean mouse=false;
	boolean click=false;
	int i,j,k,l,m;
	int count=0;
	String str1;
	boolean song=false;
	boolean song1=true;
	boolean move1=false;	
	boolean flag=false;
		Thread t;
		int full=0;
		int color=0;

public void init(){
	str="Happy Republic Day-";
	str1="Naren";
	a=getAudioClip(getDocumentBase(),"siren.au");
	jan=getAudioClip(getDocumentBase(),"jana_gana.au");
addMouseListener(this);
       }



public void mouseExited(MouseEvent m){}
public void mouseEntered(MouseEvent m){}
public void mouseReleased(MouseEvent m){}
public void mousePressed(MouseEvent m){}
public void mouseClicked(MouseEvent m){
			x=m.getX();
			y=m.getY();
			showStatus("Happy Republic day");
			if((y>=370&&y<=380)||(x>=500&&x<=515)){
			click=true;
			
		}
repaint();
	       }


public void start(){
	a.play();
	flag=false;
	k=l=m=0;i=0;j=0;
	t=new Thread(this);
	t.start();
}


public void stop(){
t=null;
flag=true;
System.exit(0);
}



public void run(){
	while(!flag){
	try{
	Thread.sleep(100);
	repaint();
	}
	catch(InterruptedException e){}

}

}


 public void paint(Graphics g)
    {

Graphics g1,g2,g3,g4,g5,g6,g7,g8,g9,g10,g11,g12,g13,g14,g15,g16,g17,g18;
g1=g2=g3=g4=g5=g6=g7=g8=g9=g10=g11=g12=g13=g14=g15=g16=g17=g18=g.create();


g.setColor(new Color(51,204,255));
g.fill3DRect(0,0,1000,300,false);      //sky



g1.setColor(new Color(153,0,0));
g1.fill3DRect(0,300,1000,100,false); //building
g1.fill3DRect(100,250,250,250,false); //building
g1.fill3DRect(650,250,250,250,false); //building
g1.fill3DRect(350,150,50,300,true); //building
g1.fill3DRect(600,150,50,300,true); //building
g1.fillRoundRect(375,250,250,20,200,50); //building
showStatus("RED FORT,New Delhi,India");

g2.setColor(Color.black);     //door
g2.fill3DRect(485,350,30,50,true);

g3.setColor(new Color(51,51,51));     //road
g3.fill3DRect(0,400,1000,150,true);

g4.setColor(Color.green);     //grass
g4.fill3DRect(0,550,1000,600,true);

g5.setColor(Color.white);       //rooftop
g5.fillArc(350,120,50,65,0,180);
g5.fillOval(372,100,10,20);
g5.fillArc(600,120,50,65,0,180);
g5.fillOval(622,100,10,20);

g5.fill3DRect(-100,468,130,14,true);  //roadlines
g5.fill3DRect(100,468,130,14,true);
g5.fill3DRect(300,468,130,14,true);
g5.fill3DRect(500,468,130,14,true);
g5.fill3DRect(700,468,130,14,true);
g5.fill3DRect(900,468,130,14,true);

g5.fill3DRect(425,240,150,10,false);
g5.fill3DRect(450,230,100,10,false);
g5.fill3DRect(475,220,50,10,false);
g5.fill3DRect(500,100,4,120,true);
//g10.fill3DRect(900,468,130,14,true);

g6.setColor(new Color(255,102,0));          //flag
g6.fill3DRect(504,100,5+full,20,true);
g7.setColor(Color.white);
g7.fill3DRect(504,120,5+full,20,true);
g8.setColor(Color.green);
g8.fill3DRect(504,140,5+full,20,true);

if(full==85){
g9.setColor(Color.blue);                  //full flag
g9.drawOval(539,120,20,20);
g9.drawLine(539,130,559,130);
g9.drawLine(549,120,549,140);
g9.drawLine(542,122,555,138);
g9.drawLine(542,138,555,122);}
else{ 
g9.setColor(Color.black);            //flag String
g9.drawArc(490,160,30,450,0,90);

}



g10.setColor(Color.blue);             //car 1
g10.fill3DRect(i,430,150,80,false);
g10.fill3DRect(140+i,470,60,40,false);



//g4.fillOval(150+i,460,50,30);
g11.setColor(Color.black);
g11.fillOval(i+30,505,30,30);
g11.fillOval(i+120,505,30,30);
g10.fillOval(i-17,480,20,30);
g11.drawLine(i+90,430,i+40,400);
g11.fill3DRect(i+20,440,40,30,false);
g11.fill3DRect(i+100,440,40,30,false);
g12.setColor(new Color(255,0,0));
g12.fill3DRect(i+115,410,15,21,true);
i+=30;

if(i>=800){                                          //car 2
g10.setColor(Color.blue); 
g10.fill3DRect(j,430,150,80,false);
g10.fill3DRect(140+j,470,60,40,false);
g11.setColor(Color.black);
g11.fillOval(j+30,505,30,30);
g11.fillOval(j+120,505,30,30);
g11.fillOval(j-17,480,20,30);
g11.drawLine(j+90,430,j+40,400);
g11.fill3DRect(j+20,440,40,30,false);
g11.fill3DRect(j+100,440,40,30,false);
g12.setColor(new Color(255,0,0));
g12.fill3DRect(j+115,410,15,21,true);
j+=30;}
i+=30;




if(j>=1000){
count++;
if(count<3){
i=0;
j=0;
}
}
if(count>=3){

g10.setColor(Color.blue);             //main car left
g10.fill3DRect(l,430,150,80,false);
g10.fill3DRect(140+l,470,60,40,false);
g11.setColor(Color.black);
g11.fillOval(l+30,505,30,30);
g11.fillOval(l+120,505,30,30);
g11.fillOval(l-17,480,20,30);
//g4.fillOval(i-20,430,50,80);
g11.drawLine(l+90,430,l+40,400);
g11.fill3DRect(l+20,440,40,30,false);
g11.fill3DRect(l+100,440,40,30,false);
g12.setColor(new Color(255,0,0));
g12.fill3DRect(l+115,410,15,21,true);
if(m<=180||move1==true){
l+=20;
}

if(l>=300){                                              //main car
g10.setColor(Color.black); 
g10.fill3DRect(k,430,150,80,true);
g10.fill3DRect(140+k,470,60,40,true);

g11.setColor(Color.black);
g11.fillOval(k+30,505,30,30);
g11.fillOval(k+120,505,30,30);
//g11.fill3DRect(k-17,480,20,30,true);
g11.drawLine(k+90,430,k+40,400);
g13.setColor(Color.yellow);
g13.fill3DRect(k+20,440,40,30,true);
g13.fill3DRect(k+100,440,40,30,true);
g12.setColor(new Color(255,0,0));
g12.fill3DRect(k+115,410,15,21,true);
if(m<=180||move1==true)
k+=20;
}
if(k>=300){
g10.setColor(Color.blue);                           //main car right
g10.fill3DRect(m,430,150,80,false);
g10.fill3DRect(140+m,470,60,40,false);

g11.setColor(Color.black);
g11.fillOval(m+30,505,30,30);
g11.fillOval(m-17,480,20,30);
g11.fillOval(m+120,505,30,30);
g11.drawLine(m+90,430,m+40,400);

g11.fill3DRect(m+20,440,40,30,false);
g11.fill3DRect(m+100,440,40,30,false);
g12.setColor(new Color(255,0,0));
g12.fill3DRect(m+115,410,15,21,true);
if(m<=180||move1==true)
m+=20;
}
char c;boolean count1=false;int count2=0;
if(m>=180){
a.stop();


 //main person  
int move2=move-20;
g16.setColor(Color.black);
g16.fillOval(500,350+move2,20,20);
//g15.setColor(new Color(102,0,153));
g15.setColor(Color.magenta);
g15.drawLine(510,370+move2,510,400+move2);
g15.drawLine(510,380+move2,520,370+move2+move3);
showStatus("Click on the hand to hoist the flag");
if(full==85)
g15.drawLine(510,350+move2,520,380+move2);
g15.drawLine(510,380+move2,500,390+move2);
g15.drawLine(510,400+move2,525,420+move2);
g15.drawLine(510,400+move2,495,420+move2);



g16.setColor(Color.white);
g16.fillOval(530,370+move,20,20); 
g15.setColor(Color.black); //person l1
g15.drawLine(540,390+move,540,420+move);
g15.drawLine(540,400+move,550,410+move-move3);
if(full==85)
g15.drawLine(540,370+move,550,410+move-move3);
g15.drawLine(540,400+move,530,410+move);
g15.drawLine(540,420+move,555,440+move);
g15.drawLine(540,420+move,525,440+move);

g16.setColor(Color.white);
g16.fillOval(470,370+move,20,20);
g15.setColor(Color.black); //person r1
g15.drawLine(480,390+move,480,420+move);
g15.drawLine(480,400+move,490,410+move-move3);
if(full==85)
g15.drawLine(480,370+move,490,410+move-move3);
g15.drawLine(480,400+move,470,410+move);
g15.drawLine(480,420+move,495,440+move);
g15.drawLine(480,420+move,465,440+move);

g16.setColor(Color.white);
g16.fillOval(570,330+move,20,20); 
g15.setColor(Color.black); //person l2
g15.drawLine(580,350+move,580,380+move);
g15.drawLine(580,360+move,590,370+move-move3);
if(full==85)
g15.drawLine(580,330+move,590,370+move-move3);
g15.drawLine(580,360+move,570,370+move);
g15.drawLine(580,380+move,595,400+move);
g15.drawLine(580,380+move,565,400+move);

g16.setColor(Color.white);
g16.fillOval(430,330+move,20,20);
g15.setColor(Color.black); //person r2
g15.drawLine(440,350+move,440,380+move);
g15.drawLine(440,360+move,450,370+move-move3);
if(full==85)
g15.drawLine(440,330+move,450,370+move-move3);
g15.drawLine(440,360+move,430,370+move);
g15.drawLine(440,380+move,455,400+move);
g15.drawLine(440,380+move,425,400+move);
if(move1==true&&m>800&&click==true){
full=85;
move=80;
move3=10;
g17.setColor(Color.orange);
c=str.charAt(0);
str=str.substring(1,str.length());
color++;
if(color>6&&color<=15)
g17.setColor(Color.white);
else if(color<=6)
g17.setColor(new Color(255,102,0));
else if(color>15&&color<=18)
g17.setColor(Color.green);
else
color=0;
str=str+c;
g17.setFont(new Font("SansSerif",Font.BOLD,50));
        g17.drawString(str,250,80);
song=true;
}


           if(move1==false){
		try{
		Thread.sleep(3000);
		}
		catch(InterruptedException e){}
          }
	move1=true;
	if(song==true&&song1==true){
	jan.play();
	song1=false;
		}
	         }
	}
/*Calendar c=Calendar.getInstance();
	g18.setColor(Color.black);
	g18.setFont(new Font("Serif",Font.BOLD,30));
	g18.drawString(str1,750,580);
	g18.drawString(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND),440,300);
            */}
}