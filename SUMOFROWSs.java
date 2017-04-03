package bebo;
import java.util.Scanner;
public class SUMOFROWS {


		public static void main(String args[])
		{
			int row,column;
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the no. of rows");
			row = scan.nextInt();
			System.out.println("Enter the no. of columns");
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
			System.out.println("The matrix is:");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					System.out.print(a[i][j] + " " );
				}
				System.out.println();
			}
			System.out.println("The sum of rows is:");
			int count=0;
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					count = count + a[i][j]; 
					
					
				}
				System.out.print(count + " " );

				System.out.println();
				count=0;
			}	
		}
	}

