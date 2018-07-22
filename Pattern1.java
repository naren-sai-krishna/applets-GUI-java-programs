import java.util.Scanner;
class Pattern1{
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
			for(k=end;k>=i;k--)
				System.out.print("\t");
			for(j=1;j<=i;j++){
				no++;
				System.out.print(no);
				System.out.print("\t");
			}
			for(int l=j-2;l>0;l--){
				no++;
				System.out.print(no);
				System.out.print("\t");
			}					
			System.out.print("\n");	
		}
	}	
}
	