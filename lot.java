import java.util.Scanner;
class lottery{
	static int no;
	static int lot;
	static int countdup;
	public static void main(String args[]){
		int i;
		no=generate();
		System.out.println(no);
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a 3 digit no.");
			lot=in.nextInt();
		if(lot>=100&&lot<=999){
			for(i=0;i<1;i++){
				if(full_match(lot,no)==true)
					break;
				else if(pattern_match_2(lot,no)==true)
					break;
				else if(pattern_match_1(lot,no)==true)
					break;
				else if(digit_match_samepos(lot,no)==true)
					break;
//else if(digit_match_diffpos(lot,no)==true)
//break;
else{
System.out.println("SORRY! Try Again!!");
break;}
}
}
else
System.out.println("Check the number");
}
public static int generate(){
int num;
num=(int)((Math.random())*1000);
if(num>=100&&num<=999)
return num;
else
return generate();
}
public static boolean full_match(int l,int l1){
if(l==l1){
System.out.println("Congratulations!!!!!!");
System.out.println("FULL MATCH");
System.out.println("You have won Rs.1,00,000");
return true;
}
return false;
}

public static boolean pattern_match_1(int gno,int rno){
while(gno>9){
if(gno%100==rno%100){
System.out.println("Congratulations!!!!!!");
System.out.println("TWO DIGIT PATTERN MATCH");
System.out.println("You have won Rs.50,000");return true;}
gno=gno/10;
rno=rno/10;

}
return false;
}
public static boolean pattern_match_2(int gno,int rno){
 while(gno>99){
if(gno%1000==rno%1000){
System.out.println("Congratulations!!!!!!");
System.out.println("THREE DIGIT PATTERN MATCH");
System.out.println("You have won Rs.75,000");
return true;}
gno=gno/10;
rno=rno/10;

}
return false;
}
    
/*public static boolean digit_match_diffpos(int gno,int rno1){
int count=0;int rno=0;int d=0;int k;
rno=rno1;
while(gno>0){
rno1=rno;
d=gno%10;
k=check(d);
if(k<=1){
while(rno>0){
if(d==rno%10)
count++;
rno=rno/10;
}
rno=rno1;
gno=gno/10;
k++;
}
else
continue;
k++;}
if(count>=1){
System.out.println("Congratulations!!!!!!");
System.out.println(count+" Digit Match in DIFFERENT positions");
System.out.println("You Won Rs.10,000");
return true;
}
return false;
}*/

public static boolean digit_match_samepos(int l,int l1){
int d=0;int count=0;
while(l>0){
if(l%10==l1%10)
count++;
l=l/10;
l1=l1/10;
}
if(count>=1){
System.out.println("Congratulations!!!!!!");
System.out.println(count+" Digit Match in SAME position");
System.out.println("You Won Rs.10,000");
return true;
}
return false;
}
}




