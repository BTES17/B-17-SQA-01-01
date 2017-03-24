import java.util.Scanner;

public class array1 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int a1[]= new int[10];
		System.out.println("Enter the values");
		for( int i=0;i<10;i++)
		{
			a1[i]=scan.nextInt();
		}		
		for( int i=0;i<10;i++)
		{
			System.out.println(a1[i]);
		}		
	}

}
