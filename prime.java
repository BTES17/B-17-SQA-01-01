package vishali;

import java.util.Scanner;

public class prime {
public static void main(String args[])
{
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the number");
	int n=scan.nextInt();
	int i=2;
		while ( i<=(n-1))
		{
			if (n%i==0)
			{
				System.out.println("No. is not prime");
				break;
			}
			else
			{
				System.out.println("No. is prime");
				break;
			}
			
		}
		i++;
}
}
