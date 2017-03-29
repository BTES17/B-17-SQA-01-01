package vishali;

import java.util.Scanner;

public class arrayrc
{
	public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the values of matrix");
	
		int[][] array=new int[5][6];
		{
			for(int c=1;c<=5;c++)
			{
				for(int r=1;r<=6;r++)
				{
				array[c][r]=scan.nextInt();
				System.out.println(array[c][r]);
				}
			}
		}
		
		
}

}
