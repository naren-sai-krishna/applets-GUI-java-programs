/*<applet code="Registration_Form" width=1000 height=500>
</applet>*/

import java.awt.*;
import java.applet.*;

public class Registration_Form{
	TextField name,roll;
	Choice qualification,branch;
	Checkbox gender;
	Button submit,reset;
	Panel p;

	public void init(){
		setLayout(new BorderLayout());
		p=new Panel(BorderLayout.CENTER);
		
		name=new TextField(20);
		roll=new TextField(5);
		
		qualification=new Choice();
		branch=new Choice();

		submit=new Button("SUBMIT");
		reset=new Button("RESET");

		gender=new Checkbox();
		p.add(name);
		p.add(roll);
		p.add(qualification);
		p.add(branch);
		p.add(gender);
		add(submit,BorderLayout.SOUTH);
		add(reset,BorderLayout.SOUTH);
		
	}
}