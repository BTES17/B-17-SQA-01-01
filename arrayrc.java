package Vishali;
import java.util.Scanner;
public class matrix {
	public static void main(String args[])
{
		int[][] array=new int[5][5];
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the values of matrix");
	
		
		{
			for(int c=0;c<5;c++)
			{
				for(int r=0;r<5;r++)
				{
				array[c][r]=scan.nextInt();
				}
			}

				for(int c=0;c<5;c++)
				{
					for(int r=0;r<5;r++)
					{
				
				System.out.println(array[c][r]);
				}
			}
		}
}
}
