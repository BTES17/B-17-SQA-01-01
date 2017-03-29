import java.util.Scanner;

public class squrenatural {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the values");
		int values=scan.nextInt();
		int count =0;
		for(int i=1;i<=values; i++)
		{
			int a=i*i;
			System.out.println(a);
			count=count+a;
		}
		System.out.println("sum of squre is: "  +count);
		
	}

}
