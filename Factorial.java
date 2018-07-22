import java.util.Scanner;
class Factorial{  
	public static int factorial(int n){    
		if (n >= 2)    
			return(n * factorial(n-1));    
		else    
			return 1;  
	 }    
	public static void main(String args[]){  
		int fact=1;  
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=in.nextInt();
		fact = factorial(number);   
		System.out.println("Factorial of "+number+" is: "+fact);    
 	}  
}  