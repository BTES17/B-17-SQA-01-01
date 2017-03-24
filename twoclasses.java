package vehicle;

public class twoclasses 
{
	static twoclasses1 obj= new twoclasses1();
	public static void main(String[] args)
	{
		int a=4,b=6;
		System.out.println(a + "" + b);
		obj.display();
	}

}
class twoclasses1
{
	int a=9;

int display()
{
	System.out.println(a);
	return 0;
}
}

