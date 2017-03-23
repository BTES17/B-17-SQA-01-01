
public class methodcall
{

	public static void main(String[] args) 
	{
		int a=45;
		int b=40;
		if(a>b)
		{
			System.out.println("A is greater");
		}
		else
		{
			System.out.println("B is greater");
		}
		methodcall object = new methodcall();
		System.out.println(object.method1());
	}
	int method1()
	{
		int a=4;
		int b=3;
		int c;
		c = a + b;
		return c;
	}
	
}
