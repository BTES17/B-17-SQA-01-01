
package Ravdeep;
import java.util.Scanner;
public class tryy {
public static void main(String args[])
{ Scanner scan=new Scanner(System.in);
	int a=5;
	int b=scan.nextInt();
	try{
		a=a/b;
	}
catch(Exception e)
{
	System.out.println(e);
}
}}
