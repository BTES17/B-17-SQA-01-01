package vishali;

import java.util.Scanner;

public class addcr {
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
			}
			int count=0;
			System.out.println("sum of rows");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					count=count+array[i][j];
					
					
				}
				
				System.out.println(count);
				
				count=0;
			}
		}
		
		
	}

}
