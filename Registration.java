import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.applet.Applet;

/*<applet code="Registration" height=800 width=800>
</applet>*/
public class Registration extends Applet implements ActionListener,ItemListener{

String str="";
String s="";
String msg="";
Label l1,l2,l3,List,Choice;
TextField tf1,tf2;
Button Reset,Submit;
Checkbox male,female;
Choice qual;

public void init(){
l1=new Label("student name");
l2=new Label("Roll no");
tf1=new TextField(30);
tf2=new TextField(30);
l3=new Label("Gender");
male=new Checkbox("Male");
female=new Checkbox("Female");
Choice =new Label("Qualification");
qual=new Choice();
qual.add("B.tech");
qual.add("BE");
qual.add("Bsc");
/*List=new Label("Branch");
branch.add("cse");
branch.add("it");
branch.add("ece");*/
Submit=new Button("Submit");
Reset=new Button("reset");
//setLayout(null);
add(l1);
add(tf1);
add(l2);
add(tf2);
add(l3);
add(male);
add(female);
add(Choice);
add(qual);
add(Submit);
add(Reset);
//add(List);
//add(branch);
Submit.addActionListener(this);
Reset.addActionListener(this);
male.addItemListener(this);
female.addItemListener(this);
//branch.addItemListener(this);
qual.addItemListener(this);
}//close of init
public void actionPerformed(ActionEvent ae){
String str=ae.getActionCommand();
if(str.equals("Submit")){
showStatus("APPLICATION SUBMITTED");
}//close of if
else if(str.equals("reset")){
tf1.setText(" ");
tf2.setText(" ");
showStatus("RESETED");
}
}//ap
public void itemStateChanged(ItemEvent ie){
str=ie.getItem().toString();
if(str.equals("Male")){
str+=" "+male.getState();
repaint();
}
else if(str.equals("Female")){
str+=" "+female.getState();
repaint();
}
msg=" "+qual.getSelectedItem();
//s="  "+branch.getSelectedItem();
repaint();
}//it
public void paint(Graphics g){
g.drawString(str,600,600);
g.drawString(s,700,700);
g.drawString(msg,800,800);
}
}

