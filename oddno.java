import java.util.Scanner;
public class oddno {
	
public static void main(String args[])
		{
			int a;
			Scanner scan= new Scanner(System.in);
			System.out.println("enter the no.");
			a = scan.nextInt();
			for(int i=1;i<=a;i++)
			{
				if(i%2 != 0)
				{
					System.out.print(i + " ");
				}
			}
			
		}
	}
