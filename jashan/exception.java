import java.util.Scanner;

public class exception {
	//static int a=10;
	//static int b=10;

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter a");
	int a = scan.nextInt();
	System.out.println("enter b");
	int b = scan.nextInt();
	try
			{
				//int c =a/b;
			//	System.out.println(c);
				
			try
			{
			int r=a%b;
			System.out.println(r);
			}
			catch(Exception t)
			{
			System.out.println("value of b is wrong");	
			
			
			}
			}
			catch(Exception e1)
			{
				System.out.println("last one");
			}
			
	
			finally
			{
				
				System.out.println("bye bye");
			}
	}

}
