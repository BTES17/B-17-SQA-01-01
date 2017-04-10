package mypackage;
import static java.lang.System.out;
public class my_class {
	private int a=5;
public static void main(String args[])
{
	//out.println(a);
	my_class obj=new my_class();
	obj.display();
}
void display()
{
	out.println(a);
	
}
}
