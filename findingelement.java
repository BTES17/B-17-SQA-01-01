import java.util.Scanner;

public class findingelement 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of rows in array");
		int row = scan.nextInt();
		System.out.println("Enter the no of columns in array");
		int column = scan.nextInt();
		int arr[][] = new int[row][column];
		System.out.println("Enter the elements for " + row + "  x  " + column + " matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.println("The elements in array are : ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print( arr[i][j] + "  ");
			}
			System.out.println(  );
		}
		System.out.println("Enter the element you want to search : ");
		int a = scan.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if (a== arr[i][j])
				{
					System.out.println("The no exists in array at " + i +j );
				}
			}

		
		}
	}
}