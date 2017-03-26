package shilpa;

import java.util.Scanner;
public class AssendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int temp;
		System.out.println("Enter number of elements");
		int n=sc.nextInt();
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
	
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>+a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Array After sorting");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}

}
