
public class greatest {
	static public void main(String args[])
	{
		greatest1();
	}
static void greatest1()
{
	int x=9,y=8,z=10;
	if((x>y)&&(x>z))
	{
		System.out.println(x);
	}
	else if((y>x)&&(y>z))
	{
		System.out.println(y);
	}
	else if(( z>x)&&(z>y))
	{
		System.out.println(z);
	}
}
}
