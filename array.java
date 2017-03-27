import java.util.Scanner;
public class array {
public static void main(String args[])
{
	int i;
	Scanner scan =new Scanner(System.in);
	int arr1[]=new int[10];
	System.out.println("enter the values of array");
	for(i=0;i<=9;i++)
	{arr1[i]=scan.nextInt();
	}
	for(i=0;i<=9;i++)
	{System.out.println(arr1[i]);
	}
	int max=arr1[0];
	for(i=0;i<=9;i++)
	{if(max<arr1[i])
	{
		max=arr1[i];
		i++;
	}
	System.out.println( "highest value of array is"+max);
	
	}}}
