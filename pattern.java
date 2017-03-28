package shilpa1;
import java.util.Scanner;
public class pattern {

	public pattern() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("how many rows do want to print");
	int rows= sc.nextInt();
	//System.out.println("here is your pattern!!!");
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
	}
	}
	}



