package vinay;
import java.util.Scanner;
public class oddno {

	public static void main(String[] args)
	{
		int i;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scan.nextInt();
		  for( i=1;i<=number; i++)
		  {
			  if(i%2!=0)
			  {
				  System.out.print(i +" ");
		

	}
		  }
	}
}