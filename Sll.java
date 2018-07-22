/*<applet code="Sll" height=600 width=1300>
</applet>*/

import java.applet.Applet;
import java.awt.*;

public class Sll extends Applet implements Runnable{
	
	Font f;
	String s1="";
	int i=0;
	String s="SINGLY LINK LIST";
	int end,end1,end2,end3,end4;
	Graphics g1;

	public void init(){
		end=end1=end2=end3=end4=1300;
	}
	
	public void start(){
		Thread t=new Thread(this);
		t.start();
	}

	public void run(){
		while(true){
			try{
			if(i<=14)
				Thread.sleep(400);
			else if(i>=25)
				Thread.sleep(600);
			else
				Thread.sleep(1000);
				repaint();
			}
			catch(InterruptedException e){}
				
		}
	}

	public void paint(Graphics g){
		setBackground(new Color(255,0,102));
		displayAll(g);
	}
	
	public void node(Graphics g,int end_all,int rno){
			
		f=new Font("MONOSPACED",Font.BOLD,30);
		g.setFont(f);	
		g.setColor(Color.blue);
		g.fill3DRect(end_all,230,100,70,true);
		g.setColor(Color.green);	
		g.fill3DRect(end_all+100,230,40,70,true);
		g.setColor(Color.black);
		g.drawString(""+rno,end_all+10,265);
		g.setColor(Color.black);
		g.drawString("--> NULL",end_all+145,270);
		
	}	

	public void displayAll(Graphics g){
		if(i<16)
			displaySll(g);
		else if(i>=16&&i<25)
			displayNode(g);
		else if(i>=25)
			displayImplementation(g);
		i++;
	}		
	
	public void displaySll(Graphics g){
		s1=s1+s.charAt(i);
		f=new Font("Monospaced",Font.BOLD,80);
		g.setFont(f);
		g.setColor(Color.blue);
		g.drawString(s1,300,280);	
	}

	public void displayNode(Graphics g){
		g.setColor(new Color(128,0,0));
		f=new Font("MONOSPACED",Font.BOLD,80);
		g.setFont(f);	
		g.drawString("NODE",500,100);
	
		f=new Font("",Font.BOLD,30);
		g.setFont(f);	
		g.setColor(Color.blue);
		g.drawString("Data ",400,200);
		g.fill3DRect(475,230,130,70,true);
		g.setColor(Color.green);	
		g.drawString("Next Pointer",700,200);
		g.fill3DRect(605,230,80,70,true);
		
		f=new Font("MONOSPACED",Font.BOLD,30);
		g.setFont(f);
		g.setColor(Color.black);
		g.drawString("----> NULL",680,270);
		i++;
	}
			
	public void displayImplementation(Graphics g){
		f=new Font("MONOSPACED",Font.BOLD,60);
		g.setFont(f);
		g.setColor(new Color(128,0,0));
		if(i<=67)
			g.drawString("INSERTING NODE",300,100);
		else if(i>67&&i<=100)
			g.drawString("SEARCHING FOR: 1029",300,100);
		else if(i>100&&i<=155)
			g.drawString("DELETING NODE",300,100);
		else{
			f=new Font("MONOSPACED",Font.BOLD,80);
			g.setFont(f);
			g.drawString("-----THE END------",200,300);
		}	
	
		if(i<=100){
			if(end>100){
				end=end-100;
				showStatus("No. of Nodes=0");}
			else{
				g1=g.create();
				end=end;
				f=new Font("PLAIN",Font.BOLD,40);
				g1.setFont(f);
				g1.setColor(Color.blue);
				g1.drawString("Head",95,200);
				if(end1>300){
					end1=end1-100;
					showStatus("No. of Nodes=1");}
				else{
					//end1=end1;
					if(end2>520){
						end2=end2-100;
						showStatus("No. of Nodes=2");}
					else{
						//end2=end2;
						if(end3>740){
							end3=end3-100;
							showStatus("No. of Nodes=3");}
						else{
							//end3=end3;
							if(end4>960){
								end4=end4-100;
								showStatus("No. of Nodes=4");}
							else{
								//end4=end4;
								showStatus("No. of Nodes=5");
							}
						}
					}
				}		
			}
		node(g,end,6061);
		if(end<=220)
			node(g,end1,1267);

		if(end1<=440)
			node(g,end2,1030);
		
		if(end2<=600)
			node(g,end3,9920);
		if(end3<=900)
			node(g,end4,1029);
		}

		if(i>100){
			if(end4<=1500){
					end4=end4+100;
					showStatus("Deleting Node: 5");
			}
				else{
					//end4=end4;
					if(end3<=1500){
						end3=end3+100;
						showStatus("Deleting Node: 4");
					}
					else{
						//end3=end3;
						if(end2<=1500){
							end2=end2+100;
							showStatus("Deleting Node: 3");
						}
						else{
							//end2=end2;
				
							if(end1<=1500){
								end1=end1+100;
								showStatus("Deleting Node: 2");
							}
							else{
								//end1=end1;				
								if(end<=1500){
									end=end+100;
									showStatus("Deleting Node: 1");
								}
								else{
									g1=g.create();
									end=end;
								}
							}
						}
					}
				}
		if(end<=1500)
			node(g,end,6061);
		if(end1<=1500)
			node(g,end1,1267);

		if(end2<=1500)
			node(g,end2,1030);
		
		if(end3<=1500)
			node(g,end3,9920);
		if(end4<=1500)
			node(g,end4,1029);
		}	
	
		if(i<=100){
			f=new Font("MONOSPACED",Font.BOLD,60);
			g.setFont(f);
			g.setColor(Color.red);
		if(i>=72){
			g.drawString("NO",150,350);
			showStatus("Comparing with Node 1:6061 and 1029......");}
		if(i>=77){
			g.drawString("NO",350,350);
			showStatus("Comparing with Node 2:1267 and 1029......");}
		if(i>=82){
			g.drawString("NO",550,350);
			showStatus("Comparing with Node 3:1030 and 1029......");}
		if(i>=87){
			g.drawString("NO",750,350);
			showStatus("Comparing with Node 4:9920 and 1029......");}
		if(i>=92){
			g.setColor(Color.green);
			g.drawString("YES",950,350);
			showStatus("Comparing with Node 5:1029 and 1029......");}	
		}
		
	}
}
