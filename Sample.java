import java.io.*;
class Sample
{
public static void main(String args[])
{
int a[]=new int[3];
try{
System.out.println(20/0);
}
catch(Exception e)
{
System.out.println(e);
}
try
{
System.out.println(a[4]);
}
catch(Exception e)
{
System.out.println(e);
}
}
}