package bebo;

public class variables {
	static int a;
	public static void main(String args[])
	{
a=7;
	
	variables obj= new variables( );
	variables obj1= new variables( );
	obj.demo( );
	a=5;
	obj.mydemo( );
	obj1.mydemo( );
	System.out.println(a);
}	
	
	void demo( )
		{

	
		System.out.println(a);
		}
	
	void mydemo( )
	{
		System.out.println(a);
	}
}
