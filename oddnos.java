import java.util.Scanner;

public class oddnos 
{
	public static void main(String args[])
	{
		int a;
		Scanner scan= new Scanner(System.in);
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
