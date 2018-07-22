/*<applet code="Smiley" width=1000 height=500>
</applet>*/
import java.applet.*;
import java.awt.*;
public class Smiley extends Applet{
	int x[]={500,460,540};
	int y[]={200,300,300};
	public void init(){
	}
	public void paint(Graphics g){
		g.setColor(Color.yellow);
		g.fillOval(300,50,400,400);
		g.setColor(Color.white);
		g.fillOval(340,150,120,40);
		g.fillOval(540,150,120,40);
		g.setColor(Color.black);
		g.fillPolygon(x,y,3);
		g.fillOval(380,150,35,40);
		g.fillOval(580,150,35,40);
		g.drawArc(330,130,150,60,0,180);
		g.drawArc(530,130,150,60,0,180);
		g.setColor(Color.red);
		g.fillArc(405,300,200,100,0,-180);
		//g.drawArc(405,300,200,100,0,-180);
	}
}