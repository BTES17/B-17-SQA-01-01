package vinay;

import java.util.Scanner;

public class Addingsum {

	public static void main(String[] args)
	{
		int row,column,i,j;
		
	   Scanner  scan=new Scanner(System.in);
	   System.out.println("enter the number of row");
	   row= scan.nextInt();
	   System.out.println("enter the number of column");
	   column=scan.nextInt();
	   int a[][]=new int[row][column];
	   System.out.println("enter the element for" + row + "x" +column+ "array");
        for(i=0;i<row;i++)
        {
        	for(j=0;j<column;j++)
        	{
        		a[i][j]=scan.nextInt();
        	}	
        	}
        	System.out.println("the matrix is");
        	for(i=0;i<row;i++)
        	{
        		for(j=0;j<column;j++)
        		{
        			System.out.print(a[i][j]+" ");
        		}
        		System.out.println();
        	}
        	System.out.println("The sum of row is");
        	int count=0;
        	for(i=0;i<row;i++)
        	{
        		for(j=0;j<column;j++)
        		{
        			count=count+a[i][j];
        		}
        		System.out.print(count + " ");
        		System.out.println();
        		
        		count=0;        	
        		}
        }
        
	}


