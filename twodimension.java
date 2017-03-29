package vinay;

import java.util.Scanner;

public class twodimension {

	public static void main(String[] args) {
		int row,column,i,j;
		int[][] array=new int[15][15];
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of row in array");
		 row=scan.nextInt();
		System.out.println("enter the number of column in array");
		 column=scan.nextInt();
		 System.out.println("enter" + (row*column)+ " Element ");
		for(i=0; i<row; i++)
		{
			for(j=0; j<column; j++)
			{
				array [i][j]=scan.nextInt();
			}
		}
		System.out.println("The array is");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print(array[i][j]+ "  ");
			}
			System.out.println();
				
			}
		}
	}
