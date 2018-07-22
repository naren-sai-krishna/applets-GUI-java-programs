package applet;

import java.awt.*;
import java.applet.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class movingcar extends Applet implements MouseListener {
	int x=0;int y=0;
	public void init()
	{addMouseListener(this);
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
	public void paint(Graphics g)
	{

		g.setColor(Color.red);
		g.fillRect(400, 250,160, 50);
		
		g.setColor(Color.blue);
		g.fillRect(439, 198,60, 50);
	}
}

