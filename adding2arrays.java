import java.util.Scanner;

public class adding2arrays
{
	public static void main(String args[])
	{
		int row,column;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. of rows for 1st array");
		row = scan.nextInt();
		System.out.println("Enter the no. of columns for 2nd array");
		column = scan.nextInt();
		int a[][] = new int[row][column];
		System.out.println("Enter the elements for" + row + "x" +column + "array");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				a[i][j] = scan.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(a[i][j] + " " );
			}
			System.out.println();
		}
		//int row1,column1;
		//Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. of rows for 2nd matrix");
		row = scan.nextInt();
		System.out.println("Enter the no. of columns for 2nd matrix");
		column = scan.nextInt();
		int a1[][] = new int[row][column];
		System.out.println("Enter the elements for" + row + "x" +column + "array");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				a1[i][j] = scan.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(a1[i][j] + " " );
			}
			System.out.println();
		}
		System.out.println("Sum of arrays");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				a[i][j]= a[i][j]+a1[i][j];
				System.out.print(a[i][j] + "   ");
			}
			System.out.println();
		
		}
	}
}
