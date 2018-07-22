import java.util.Scanner;
class Pattern2{
	public static void main(String args[]){
		int end;
		int k;
		int i;
		int j;
		int no=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number of Lines");
			end=in.nextInt();
		for(i=1;i<=end;i++){
			for(k=end;k>i;k--)
				System.out.print("  ");
			for(j=1;j<=i;j++){
				System.out.print("*");
				System.out.print("   ");
			}
		System.out.print("\n");	
		}
		for(i=1;i<=end;i++){
			for(k=1;k<=i;k++)
				System.out.print("  ");
			for(j=1;j<=(end-i);j++){
				System.out.print("*");
				System.out.print("   ");
			}		
			System.out.print("\n");	
		}
	}	
}
	