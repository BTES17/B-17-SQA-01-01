import java.util.Scanner;

public class gett {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	var obj=new var();
	System.out.println("Enter a string");
	String a=sc.nextLine();
	obj.set(a);
	String b=obj.get();
	System.out.println(b);
	}
}

