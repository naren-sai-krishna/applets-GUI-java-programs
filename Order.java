import hotel.Bill;
import java.util.Scanner;
class Order
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int d;
System.out.println("choose 1.tiffins 2.meals 3.snacks");
d=s.nextInt();
Bill o=new Bill(d);
}
}