package bebo;
import java.util.Scanner;

public class qwerty 
{
public static void main(String args[])
{
	int i,fact=1,x;
	System.out.println("Enter the number to check it's factoial");
Scanner in= new Scanner(System.in);
x= in.nextInt();
for (i=1;i<=x;i++)
{
	fact=fact*i;
}
	System.out.println (fact);

}
}