package vishali;

import java.util.Scanner;

public class matrixdignl {
	public static void main(String args[])
	{
	int row,column;
	System.out.println("enter the values of row");
	Scanner scan=new Scanner (System.in);
	row=scan.nextInt();
	
	System.out.println("Enter the values of column");
	Scanner s= new Scanner(System.in);
	column=scan.nextInt();

	int[][] ary=new int[row][column];
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

//System.out.println("sum of rows");
	 int count=0;
for(int i=0;i<row;i++)
{
	for(int j=i;j<column;j++)
	{
		if (i==j)
	{
		count=count+ary[i][j];
		System.out.println(count);
		
	}
		
		
	}
	}
	}
}


