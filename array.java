package vishali;

import java.util.Scanner;

public class array {
public static void main(String args[]) 
{
	Scanner scan= new Scanner(System.in);
	int a,i;
	int[] arr = new int[10];
	//Scanner scan= new Scanner(System.in);
	System.out.println("enter the values");
	//a= scan.nextInt();
	//System.out.println(a);
	for(i=0;i<10;i++)
	{
		//System.out.println("enter the values");
		arr[i]= scan.nextInt();
		System.out.println(arr[i]);   
		//System.out.println(a);
	}
}
}
