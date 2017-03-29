package vinay;

import java.util.Scanner;

public class squarenumber
{

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("enter the value");
		int value=obj.nextInt();
		int count=0,i;
		for(i=1;i<=value;i++)
		{
		int a=i*i;
		System.out.print(a);
		count=count+a;
		}
		System.out.println("sum of square is "+ count );
		
		}
		
		

	}


