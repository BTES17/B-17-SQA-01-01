package vinay;

import java.util.Scanner;

public class exception {

	public static void main(String[] args) {
		System.out.println("enter the any two values");
		Scanner scan =new Scanner(System.in);
		int a= scan.nextInt();
		int b =scan.nextInt();
	
		/*int a=40,b=0;*/
		
		try
		{
			int c=a/b;
		}
		catch(NullPointerException e)
		{
				System.out.println(e);
               
		}
		
	catch(ArithmeticException e)
		{
			System.out.println(e);
			 System.out.println("this number is not divided by zero");
		}
			
			
			catch(Exception e)
		{
				System.out.println(e);
			
		}
		
		
		 finally
		 {
			 System.out.println("Hello everyone");
		 }
		 
		 
	}
	}


