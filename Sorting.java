import java.util.Scanner;
class Sorting
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int i,j,k;
int a[]=new int[5];
System.out.println("enter the elements to be inserted");
for(i=0;i<4;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<4;i++)
{
for(j=i+1;j<4;j++)
{
if(a[i]>a[j])
{
k=a[i];
a[i]=a[j];
a[j]=k;

}

}

}
for(i=0;i<4;i++)
{
System.out.print(a[i]);
}
}

}