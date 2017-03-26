package vishali;
import java.util.Scanner;

public class great 
	{
		public static void main(String args[])
		{
			int i;
			Scanner scan1 = new Scanner(System.in);
			int ary[]= new int[10];
			System.out.println("Enter the values");
			for( i=0;i<=9;i++)
			{
				ary[i]= scan1.nextInt();
			}
			for( i=0;i<=9;i++)
			{
				System.out.println(ary[i]);
			}
			int max = ary[i];
			for(i=0;i<=9;i++)
				{
					if(max < ary[i])
					{
						max = ary[i];
						i++;
					}
					else
					{
						i++;
				    }
				}
				System.out.println("greatest number is" +max  );
				
			
		}

	}


