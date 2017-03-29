import java.util.Scanner;

public class SumOfSquareOfNos 
{
	public static void main(String args[])
	{
		int sq ;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the count");
		int count = scan.nextInt();
		System.out.println("The series of natural no.s is");
		int count1 =0;
		for(int i=1;i<=count;i++)
		{
			sq= i*i;
			System.out.println(sq);
			count1=count1+sq;
		}
		System.out.println("The sum of count is : " +count1);
		}		
}
