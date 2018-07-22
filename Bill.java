package hotel;
public class Bill
{
int opt,bill=0;
public Bill(int opt)
{
System.out.println("\t Simhadri hotrl Bill receipt\n");
System.out.println("31\4\56\t 9:30\n");
System.out.println("------\n");
if(opt==1)
{
System.out.println("tiffins\t\t rs.20\n");
bill=bill+20;
}
else if(opt==2)
{
System.out.println("meals\t\t rs.40\n");
bill=bill+40;
}
else if(opt==3)
{
System.out.println("snacks\t\t rs.50\n");
bill=bill+50;
}
else
{
System.out.println("no item is there");
}
System.out.println("total amount\t\t rs."+bill);
System.out.println("always welcome@@@");
}
}
