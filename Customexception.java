import java.util.Scanner;
class InvalidAtmpinnumberException extends Exception
{
Long pin;
int n=0;
void checkpin(Long pin) throws InvalidAtmpinnumberException
{
this.pin=pin;
while(pin>0)
{
pin=pin/10;
n++;
}
if(n!=4)
{
throw new InvalidAtmpinnumberException();
}
else
{
System.out.println("valid pin number");
}
}
}
class CustomException
{
public static void main(String args[])
{
Long pin;
System.out.println("enter pin number");
Scanner s=new Scanner(System.in);
pin=s.nextLong();
InvalidAtmpinnumberException i=new InvalidAtmpinnumberException();
try
{
i.checkpin(pin);
}
catch(InvalidAtmpinnumberException e)
{
System.out.println(e);
}
}
}