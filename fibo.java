import java.util.Scanner;

public class fibo {
	public static void main(String args[])
	{
		int x,t1=0,t2=1,nt=0;
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
		System.out.println(x);
		for(int i=3;i<x;i++)
		{
			nt=t1+t2;
			t1=t2;
			t2=nt;
			System.out.println(nt);
		}
	}

}
