package shilpa1;
import java.util.Scanner;
public class square {

public static void main(String args[])
{
	int n;
    //int num=10;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter any natural no.");
	n=scan.nextInt();
	int sqaure;
	 for(int i=1;i<=n;i++)
	 {
		 sqaure=i*i;
		 System.out.println(sqaure);
	 }
}
}