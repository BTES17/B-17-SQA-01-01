package abc;
import java.util.Scanner;
public class assending {
	

		public static void main(String args[])
		{
			int i,j;
			Scanner scan1 = new Scanner(System.in);
			int arr1[]= new int[5];
			System.out.println("Enter values");
			for( i=0;i<5;i++)
			{
				arr1[i]=scan1.nextInt();
			}
			for( i=0;i<4;i++)
			{
				System.out.print( arr1[i] + ",");
			}
			System.out.println(arr1[4]);
			for( i=0;i<5;i++)
			{
				for( j=i+1;j<5;j++)
				{
					if(arr1[i]>arr1[j])
					{
						int temp=arr1[i];
						arr1[i]=arr1[j];
						arr1[j]=temp;
					}
				
				}
				
					
			}
				
				System.out.println("Ascending Order");
				for( i=0;i<4;i++)
				{
					System.out.print( arr1[i] + ",");
				}
				System.out.println(arr1[4]);
			}
	}
