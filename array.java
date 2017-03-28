package vinay;

public class array
{
	static array2 object=new array2();
	public static void main(String[] args) 
	{
int a=15,b=25;
System.out.println(a+""+b);
	object.display();
	}
}
class array2
{
	int a=45;
		int display()
		{
			System.out.println(a);
			return 0;
		}
	}