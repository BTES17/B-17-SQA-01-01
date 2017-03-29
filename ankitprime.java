package bebo;
import java.util.Scanner;

public class prime
{
	public static void main(String args[])
	{
		int x,i;
		System.out.println("Enter the number for checking whether it is prime or not");
		Scanner in = new Scanner(System.in);
		x= in.nextInt();
		System.out.println("Print the number from 1 to " +x);
		for (i=2;i<x;i++)
		{
			if(x%i==0 )
			{
				System.out.println("not a prime number");
			break;
			}
			else 
			{
				System.out.println("a prime number");	
				break;
			}
			
		}}
}