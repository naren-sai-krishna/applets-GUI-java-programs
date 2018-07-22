
import java.awt.event.*;  
import javax.swing.*;    
public class ButtonExample {  
public static void main(String[] args) {  
    JFrame f=new JFrame("Button Example");  
    final JTextField tf=new JTextField();  
    tf.setBounds(50,50, 150,20);  
    JButton b=new JButton("Click Here");  
  b.setBounds(50,100,95,30);  
    b.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
          tf.setText("Welcome to Javatpoint.");  
        }  
    });  
    f.add(b);f.add(tf);  
   f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}



/*<applet code="Progressbar" height=200 width=1000>
</applet>*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
public class Progressbar extends JApplet implements ItemListener,ActionListener,ChangeListener{
	JProgressBar jp;
	JButton b;
	TextField tf;
	List insert,delete;
	
	public void init(){
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		createInsertButton(c);
		createProgressBar(c);
		createInsertList(c);		
		
		tf=new TextField(5);
		c.add(tf);
		
		
	}
	
	public void createProgressBar(Container c){
		jp=new JProgressBar();
		jp.setMaximum(100);
		jp.setMinimum(0);
		c.add(jp);
		jp.setValue(jp.getValue()+5);
	}

	
	public void createInsertList(Container c){
		insert=new List(3,true);
		
		insert.add("First");
		insert.add("Last");
		insert.add("Any Other Position");
		c.add(insert);
		
	}
			
	public void createInsertButton(Container c){
		b=new JButton("CLICK");
		c.add(b);
		b.addActionListener(this);
		
	}



	public void itemStateChanged(ItemEvent e){
		int index=insert.getSelectedIndex();
		String name=insert.getItem(index);
		if(name.equals("First")){
			tf.setVisible(true);
			
		}
	}

	public void actionPerformed(ActionEvent e){
		jp.setValue(jp.getValue()+5);
		insert.setVisible(true);
	}
	public void stateChanged(ChangeEvent e){
		
	}	

	
}