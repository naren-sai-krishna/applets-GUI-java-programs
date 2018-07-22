import java.io.*;
class Exception1
{
public static void main(String args[])
{
int a[]=new int[3],c,d=20,b=0;
try
{
c=d/b;
System.out.println(c);
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