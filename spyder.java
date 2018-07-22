import java.awt.*;
import java.applet.Applet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class spyder extends Applet implements MouseListener,Runnable {
	Font f;	
	int x;int y;
	Thread t=new Thread(this);
	public void init()
	{
        int x=0,y=0;
	setBackground(Color.black);
	
         t.start();
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
public void run()
{
while(true){
x+=6;
y+=6;
try
{Thread.sleep(50);
 repaint();
}
catch(InterruptedException e)
{}
}}
public void paint(Graphics g)
{
g.setFont(new Font("Purisa",Font.BOLD,50));
g.setColor(Color.red);
g.drawString("BOOM BOOM",x,y);
g.setFont(new Font("Purisa",Font.BOLD,50));
g.setColor(Color.blue);
g.drawString("BAAM BAAM",975-x,700-y);
}
}
