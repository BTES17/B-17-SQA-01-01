import java.util.Scanner;

public class reverseArray 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int len = scan.nextInt();
		int arr[]= new int[len];
		System.out.println("Enter the elements");
		for(int i=0;i<len;i++)
		{
			arr[i]= scan.nextInt();
		}
		System.out.println("The elements in array are : ");
		for(int i=0;i<len;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Array in reverse order");
		for(int i = len-1; i >= 0; i--)
		{
			System.out.println(arr[i]);
		}
	}
}
