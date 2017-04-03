package vehicle;

import java.util.Scanner;

public class adder {

	public static void main(String[] args) {
		int row,column;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number of row");
		row=scan.nextInt();
		System.out.println("enter number of column");
		column=scan.nextInt();
		int [][]array=new int[row][column];
		
		System.out.println("enter value of"  + row +" x "+ column);
		{
			int i,j;
			for( i=0;i<row;i++)
			{
				
				for(  j=0;j<column;j++)
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
				int a=0;
				System.out.println("sum of rows");
				for(i=0;i<row;i++)
				{
					for(j=0;j<column;j++)
				
				{
					a=a+array[i][j];
				}
				
					System.out.println(a);
					a=0;
				
			}
		
		
		
		}
		
		
				}
	}
