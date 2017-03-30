package vishali;

import java.util.Scanner;

public class addmatrix {
	public static void main(String agrs[])
	{
		int row,column;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no of rows");
		 row=scan.nextInt();
		System.out.println("enter the no of columns");
		column=scan.nextInt();
		int[][]array= new int[row][column];
		System.out.println("enter the value of"+ row +" x "  + column  );
		{
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					array[i][j]=scan.nextInt();
				}
			}
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					System.out.println(array[i][j]);
				}
			}}
			//int row2,column;
			Scanner scan1=new Scanner(System.in);
			System.out.println("enter the no of rows2");
			 row=scan.nextInt();
			System.out.println("enter the no of columns2");
			column=scan.nextInt();
			int[][]ary= new int[row][column];
			System.out.println("enter the value of"+ row +"  "  + column  );
			
				for(int i=0;i<row;i++)
				{
					for(int j=0;j<column;j++)
					{
						ary[i][j]=scan.nextInt();
					}
				}
				for(int i=0;i<row;i++)
				{
					for(int j=0;j<column;j++)
					{
						System.out.println(ary[i][j]);
					}
				}
			//int count=0;
			System.out.println("sum of rows");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					array[i][j]=array[i][j]+ary[i][j];
					System.out.println(array[i][j]);
					
				}
				
				//System.out.println(count);
				
				//count=0;
			}
		}
	
	}

