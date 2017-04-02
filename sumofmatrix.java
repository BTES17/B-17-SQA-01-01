package vinay;

import java.util.Scanner;

public class sumofmatrix {

	public static void main(String args[])
	{
		int row,column,i,j,aray;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of row");
		row=scan.nextInt();
		System.out.println("enter the number of column");
		column=scan.nextInt();
		int[][]array= new int[row][column];
		System.out.println("enter the value of "+ row + " x " + column);
		{
			for(i=0; i<row;i++)
			{
				for(j=0;j<column;j++)
				{
					array[i][j]=scan.nextInt();
				}
			}
			for(i=0;i<row;i++)
			{
				for(j=0;j<column;j++)
				{
					System.out.println(array[i][j]);
				}
			}
		}
		
		
		//int row2,column;
		Scanner scan11=new Scanner(System.in);
		System.out.println("enter the number of row2");
		row=scan.nextInt();
		System.out.println("enter the number of column2");
		column=scan.nextInt();
		int[][]aray2= new int[row][column];
		System.out.println("enter the value of "+ row + " x " + column);
		
			for(i=0; i<row;i++)
			{
				for(j=0;j<column;j++)
				{
					aray2[i][j]=scan.nextInt();
				}
			}
			for(i=0;i<row;i++)
			{
				for(j=0;j<column;j++)
				{
					System.out.println(aray2[i][j]);
				}
			}
			//int count=0;
			System.out.println("sum of row");
			for(i=0;i<row;i++)
			{
				for(j=0;j<column;j++)
				{
					array[i][j]=array[i][j]+array[i][j];
					System.out.println(array[i][j]);
				}
				
				//System.out.println(count);
				//count=0;
				
			}
	} 
}
	
		
		

