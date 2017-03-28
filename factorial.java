import java.util.Scanner;

public class factorial
{
	public static void main(String args[])
	{
		int n,fact = 1;
		System.out.println("Print the no of which you want factorial");
		Scanner scan= new Scanner(System.in);
		n = scan.nextInt();
		
		for(int i=n;i>=1;i--)
		{
			fact= fact*i;
			
		}
		System.out.println(fact);
	}
}
