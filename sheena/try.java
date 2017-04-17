import java.util.Scanner;
public class tryyy {
public static void main(String args[])
{ Scanner scan=new Scanner(System.in);
	int a=5;
	int b=scan.nextInt();
	int c=scan.nextInt();
	try{
		a=a/b;
	      try {
	    	  		a=a/c;
	      	}
	      	catch(ArithmeticException e )
	      	{
	      		System.out.println(e);
	      	}
	      
	      System.out.println("Hi");
	 }
	catch(Exception e)
	{
		System.out.println(e);

	}
	
	 System.out.println("Hello");
	
}
}
