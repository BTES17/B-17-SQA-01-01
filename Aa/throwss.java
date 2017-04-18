package dee;
import java.util.Scanner;
public class throwss {

		
public static void main(String args[])
{
	throwss obj=new throwss();
	try
	{	
	obj.abc();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}


void abc() throws Exception
{
	Scanner s=new Scanner(System.in);
	System.out.println("first nmbr");
	int a=s.nextInt();
	System.out.println("second nmbr");
	int b=s.nextInt();
	int c=a/b;
	System.out.println(c);
	if(c>2)
	{
		throw new Exception("c not valid");
	}
	else
	{
		System.out.println("valid");
	}
	}
}

