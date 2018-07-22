import java.applet.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
	MyFrame(String s){
		super(s);
		setSize(200,200);
		setVisible(true);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
				setVisible(false);
			}	
		});
	}	
}


class MFrame {
	public static void main(String args[]){
		MyFrame f=new MyFrame("Naren");
	}
}
