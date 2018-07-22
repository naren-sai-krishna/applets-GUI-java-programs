/*<applet code="Progressbar" height=400 width=1000>
</applet>*/

import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
public class Progressbar extends JApplet implements Runnable,ActionListener,ChangeListener{
	JProgressBar jp;
	JButton ins,del;
	TextArea ta;
	
	Thread t;
	int x=0;int y=0;
	int ele=0;
	
	public void init(){
		setLayout(new BorderLayout());
		JPanel p1=new JPanel();
		p1.setLayout(new BorderLayout());
		
		createInsertDeleteButtons(p1);
		createProgressBar();
		createTextArea(p1);	
		
		add(p1,BorderLayout.WEST);
		
	}
	public void start(){
		Thread t=new Thread(this);
		t.start();
	}
	public void run(){
			while(true){
				try{
					Thread.sleep(3000);
					repaint();
				}
				catch(InterruptedException e){}
				}
	}


	public Insets getInsets(){
		return new Insets(10,20,10,20);
	}
	public void createTextArea(JPanel p1){
		ta=new TextArea(5,3);
		p1.add(ta,BorderLayout.CENTER);
	}
	
	public void createProgressBar(){
		jp=new JProgressBar();
		jp.setMaximum(100);
		jp.setMinimum(0);
		add(jp,BorderLayout.SOUTH);
		jp.setValue(jp.getValue()+5);
	}

			
	public void createInsertDeleteButtons(JPanel p1){
		ins=new JButton("ADD");
		ins.setBackground(Color.red);
		ins.setForeground(Color.white);
		del=new JButton("DELETE");
		p1.add(ins,BorderLayout.NORTH);
		ins.addActionListener(this);
		p1.add(del,BorderLayout.SOUTH);
		del.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("ADD"))
			repaint();	



		jp.setValue(jp.getValue()+5);
		
	}
	public void stateChanged(ChangeEvent e){
		
	}	


	

	
	public void paint(Graphics g){
		node(g);
		
	}
	public void node(Graphics g){
	
		Graphics g1;
		g1=g.create();
		g1.setColor(Color.yellow);
		g1.fill3DRect(660,5,60,30,true);
		g1.setColor(Color.black);
		g1.drawLine(700,5,700,35);
		g1.drawLine(720,20,750,20);
		g1.drawLine(630,20,660,20);
		
		g1.drawLine(630,20,640,25);
		g1.drawLine(630,20,640,15);
		
	}
}		