package dee;
import java.util.Scanner;
public class trycatch {

public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("first nmbr");
int a=s.nextInt();
System.out.println("second nmbr");
int b=s.nextInt();
System.out.println("third nmbr");
int q=s.nextInt();
System.out.println("fourth nmbr");
int r=s.nextInt();

try 
{
	  			int c=a/b;

                try
                {
                	int p=q/r;
                	System.out.println("hello");
                	}

                catch(ArithmeticException e)
                {
                	System.out.println("bye");
                }
}
		catch(NullPointerException e)
		{
		System.out.println("no errror");
		}
		catch(ArithmeticException d)
		{
		System.out.println("arithmetic error");
		}
		catch(Exception e)
			{
			System.out.println("exception");
			}
finally
		{
		System.out.println("successful");
		}
}}

