import java.util.Scanner;

public class square 
{
	public static void main(String args[])
	{
		int sq ;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the count");
		int count = scan.nextInt();
		System.out.println("The series of natural no.s is");
		for(int i=1;i<=count;i++)
		{
			sq= i*i;
			System.out.println(sq);
		}
	}		
}
