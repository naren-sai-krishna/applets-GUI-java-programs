import java.util.Scanner;
class ISBN{
	public static void main(String args[]){
		long no;
		System.out.println("Enter the ISBN Number");
		Scanner in=new Scanner(System.in);
			no=in.nextLong();
		
		if(checkIsbn(no))
			System.out.println("VALID");
		else
			System.out.println("INVALID");
	}
	
	
	
	public static boolean checkIsbn(long no){		
		int k=12;
		int sum=0;
		int digit;
		int csum=0;
		csum=(int)(no%10);no=no/10;
		while(no>0){
			digit=(int)(no%10);
			if(k%2==0)
				digit*=3;
			k--;
			sum=sum+digit;
			no=no/10;
		}

		if(k!=0)
			return false;
		
		sum=Math.abs(10-sum%10);
		if(sum==10)
			sum=0;
	
		if(csum==sum)
			return true;
		else
			return false;
		
	}


}