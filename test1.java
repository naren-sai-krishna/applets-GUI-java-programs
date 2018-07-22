import java.util.Scanner;
class test1{
      static String i=new String();
      static String f=new String();
      static char ci;
      static char cf;
    public static void main(String args[]){
     int resa=0;int resb=0;
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for (int l = 0; l < N; l++) {
            Scanner s1=new Scanner(System.in);
            i=s1.nextLine();
            f=s1.nextLine();
            
            for(int j=0;j<f.length();j++){
                cf=f.charAt(j);
                if(cf=='A'){
                 swapA(j);
                }
                if(cf=='B')
                swapB(j);
            }
            
            
        }
        if(i.equals(f))
        System.out.println("Yes");
        else
        System.out.println("No");
    }
   public static void swapA(int pos){
        int k=0;
            for(int j=0;j<i.length();j++){
              ci=i.charAt(j);
                if(ci=='A'){
                    k=j-1;
                while(i.charAt(k)=='#'){
                    if(pos==k){
                    	 char temp=i.charAt(k);
                       
			 temp='A';
                        ci='#';
                    }
                    k=k-1;
                    if(i.charAt(k)=='B')
                    break;
                    
                }
            }
        }
    }
    public static void swapB(int pos){
        int k=0;
            for(int j=0;j<i.length();j++){
              ci=i.charAt(j);
                if(ci=='B'){
                    k=j+1;
                while(i.charAt(k)=='#'){
                    if(pos==k){
                    	 char temp=i.charAt(k);
			     temp='B';
                        ci='#';
                    }
                    k=k-1;
                    if(i.charAt(k)=='A')
                    break;
                    
                }
            }
        }
    }
    
}
