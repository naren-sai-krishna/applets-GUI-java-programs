import java.util.Scanner;
class Sort{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int i,j,k;
		int a[]=new int[10];
		System.out.println("Enter the total size of array");
		int n=s.nextInt();
		System.out.println("enter the elements to be inserted");
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(a[i]>a[j]){
					k=a[i];
					a[i]=a[j];
					a[j]=k;
				}

			}

		}
		System.out.println("Sorted numbers are:");
		for(i=0;i<n;i++){
		System.out.print(a[i]+"\t");
		}
	}

}