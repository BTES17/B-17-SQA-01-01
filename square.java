package abc;
import java.util.Scanner;
public class square {

	public static void main(String[] args) 
	{
		int b;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the natural no of series");
		
		int sq_no = scan.nextInt();
		System.out.println("the series of s of no's");
		for(int i=1;i<=sq_no;i++ )
		{

			 b=i*i;
		  
			System.out.println(b);
		}
		}
			

}
