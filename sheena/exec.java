package sheena;

import java.util.Scanner;

public class exec {
public static void main(String args[])
{
	Scanner scan1=new Scanner(System.in);
	int a=4;
	int b=scan1.nextInt();
	try{
		a=a/b;
		
	}

catch(Exception e)
	{
	System.out.println(e);}
	}
}
