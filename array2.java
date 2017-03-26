import java.util.Scanner;

public class array2 
{
	public static void main(String args[])
	{
		int i;
		Scanner scan1 = new Scanner(System.in);
		int arr1[]= new int[10];
		System.out.println("Enter values");
		for( i=0;i<=9;i++)
		{
			arr1[i]= scan1.nextInt();
		}
		for( i=0;i<=9;i++)
		{
			System.out.println(arr1[i]);
		}
		int max = arr1[0];
		for(i=0;i<=9;i++)
			{
				if(max < arr1[i])
				{
					max = arr1[i];
					i++;
				}
				//else
				//{
					//i++;
				//}
			}
			System.out.println("Highest no in array is" +max  );
			
		
	}

}
