import java.util.Scanner;

public class SumOfDiagonal 
{
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the size of array");
		System.out.println("enter the no of rows");
		int row= scan.nextInt();
		System.out.println("enter the no of columns");
		int column = scan.nextInt();
		System.out.println("Enter the elements of" + row + "x " +column+ "matrix");
		int a[][] = new int[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				a[i][j] = scan.nextInt();
			}
		}
		System.out.println("the elements are : ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.println(a[i][j]);
			}
		}
		System.out.println("sum of diagonals is ") ;
		int count = 0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(i==j)
				{
					count = count + a[i][j];
				}
			}
		}
		System.out.println(count);
	}
}
