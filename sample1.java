import java.awt.*;
import java.applet.Applet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class sample1 extends Applet  implements MouseListener,Runnable {
	int x,y;
Thread t;
	public void init()
	{
	t=new Thread(this);
         int x=0,y=0;
         addMouseListener(this);
	setBackground(Color.gray);
	}
	
	public void mousePressed(MouseEvent m) {
		
		showStatus(Integer.toString(m.getX())+"  "+Integer.toString(m.getY()));
		repaint();
	}
	//public void MsouseDragged(MouseEvent m) {
	//showStatus(Integer.toString(m.getX())+"  "+Integer.toString(m.getY()));
	//repaint();
	//}
	public void mouseEntered(MouseEvent m) {
		showStatus(Integer.toString(m.getX())+"  "+Integer.toString(m.getY()));
		repaint();
	}
	public void mouseClicked(MouseEvent m) {
		showStatus(Integer.toString(m.getX())+"  "+Integer.toString(m.getY()));
		repaint();
	}
	public void mouseExited(MouseEvent m) {
		showStatus(Integer.toString(m.getX())+"  "+Integer.toString(m.getY()));
		repaint();
	}
	public void mouseReleased(MouseEvent m) {
	showStatus(Integer.toString(m.getX())+"  "+Integer.toString(m.getY()));
	repaint();
	}



public void start()
{
t.start();
}

public void run()
{
while(Thread.currentThread()==t)
{
x+=10;
y+=10;
try{
repaint();
t.sleep(500);

}
catch(InterruptedException e){}

}
}
public void paint(Graphics g)
{
g.setColor(Color.red);
while(x<514&&y<514)
{
g.drawLine(0,0,x,y);
}
while(x>=514&&y>=514)
{
g.drawLine(514,514,x,y);
}
}
}

