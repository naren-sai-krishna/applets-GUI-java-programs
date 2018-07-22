/*<applet code="MyEvent" width=1000 height=600>
</applet>*/

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class MyEvent extends Applet implements MouseListener,MouseMotionListener,KeyListener{
	int x=0;
	int y=0;
	String msg="";
	Font f;
	public void init(){
		setBackground(Color.blue);
		addMouseListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
		 f=new Font("Serif",Font.BOLD,40);
	}
	public void mouseEntered(MouseEvent me){
		showStatus("MouseEntered");
		repaint();
	}
	public void mouseExited(MouseEvent me){
		showStatus("Mouse Exited");
		repaint();
	}
	public void mousePressed(MouseEvent me){
		x=me.getX();
		y=me.getY();
		msg="The Mouse is Pressed at:"+x+","+y;
		showStatus("Mouse Pressed");
		repaint();
	} 
	public void mouseReleased(MouseEvent me){
		showStatus("Mouse Released");
		repaint();
	} 
	public void mouseMoved(MouseEvent me){
		showStatus("Mouse Moved");
		repaint();
	} 
	public void mouseDragged(MouseEvent me){
		showStatus("Mouse Dragged");
		repaint();
	}  
	public void mouseClicked(MouseEvent me){
		showStatus("Mouse Clicked");
		repaint();
	} 
	
	public void keyTyped(KeyEvent k){
		msg=msg+k.getKeyChar();
		repaint();
	}
	public void keyPressed(KeyEvent k){
		int key=k.getKeyCode();
		switch(key){
		case KeyEvent.VK_UP:
			msg="Pressed UP";
			repaint();
			break;
		case KeyEvent.VK_DOWN:
			msg="Pressed Down";
			repaint();
			break;
		case KeyEvent.VK_SHIFT:
			msg="Pressed Shift";
			repaint();
			break;
		}
	}
	public void keyReleased(KeyEvent k){
		showStatus("Key is Released");
	}
	
	public void paint(Graphics g){
		g.setFont(f);
		g.drawString(msg,x,y);
	}
}