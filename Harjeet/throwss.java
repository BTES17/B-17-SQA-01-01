import java.util.Scanner;
public class throwss {
	static Scanner scan=new Scanner(System.in);
static	public void add()throws Exception
	
	{
		System.out.println("Enter the age");
		 int a=scan.nextInt();
		 if (a<18)
		 {
			 throw new Exception("Age is not valid");
		 }
		
	}
	public static void main(String args[])
	{
		try{
			add();
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("please enter valid age");
		}
	}

}
