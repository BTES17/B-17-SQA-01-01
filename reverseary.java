package vishali;

import java.util.Scanner;

public class reverseary {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int a=scan.nextInt();
		int[] array=new int[a];
		System.out.println("Enter the values");
		
			for(int i=1;i<=a;i++)
			{
				array[i]= scan.nextInt();
			}
		System.out.println("Elements in array are ");
		for(int i=0;i<a;i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("Reverse of array");
		for(int i = a-1; i >= 0; i--)
		{
			System.out.println(array[i]);
		}
		
	}

}
