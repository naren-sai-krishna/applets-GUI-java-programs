//Author ~Naren

/*<applet code="ball"  width=1000 height=600>
</applet>*/
import java.applet.*;
import java.awt.*;
public class ball extends Applet implements Runnable{
	int y,x;
	int i=0;
	int wall,wall1;
	int no=0;
	boolean hit_up=false;
	boolean hit_down=false;
	boolean hit_left=false;
	boolean hit_right=false;


	public void init(){
		setBackground(Color.black);
		Thread t=new Thread(this);
		t.start();
	}





	public void run(){
	y=300;
		while(true){
			try{
				Thread.sleep(100);
				repaint();
			}
			catch(InterruptedException e){}
		}
	}




	public void paint(Graphics g){
		Graphics g1=g.create();

		color(g1);
		move(g1);
	}



	public void color(Graphics g1){
		no+=100;
		if(no<=100)
			g1.setColor(Color.blue);
		if(no>=100&&no<=200)
			g1.setColor(Color.yellow);
		if(no>=200&&no<=300)
			g1.setColor(Color.red);
		if(no>=300&&no<=400)
			g1.setColor(Color.green);
		if(no>=400&&no<=500)
			g1.setColor(Color.cyan);
		if(no>=500&&no<=600)
			g1.setColor(Color.orange);
		if(no==600)
			no=0;

		g1.fillOval(x+wall1,y+wall,80,80);
		g1.drawLine(0,595,1000,595);
	}





	public void move(Graphics g1){
		if(y+wall==0){
			hit_up=true;
			hit_down=false;
			hit_right=false;
			hit_left=false;
		}
		if(y+wall==570){
			hit_down=true;
			hit_up=false;
			hit_right=false;
			hit_left=false;
		}
		if(x+wall1==950){
			hit_right=true;
			hit_up=false;
			hit_down=false;
			hit_left=false;
		}
		if(x+wall1==0){
			hit_up=false;
			hit_right=false;
			hit_down=false;
			hit_left=true;
		}


		if(hit_down==true){
			x=x+wall1;
			y=y-wall;
		}
		if(hit_right==true){
			x=x-wall1;
			y=y-wall;
		}
		if(hit_up==true){
			x=x-wall1;
			y=y+wall;
		}
		if(hit_left==true){
			x=x+wall1;
			y=y+wall;
			
		}
		wall=30;
		wall1=50;
	}


}