import java.util.Scanner;

public class squarenn {
	public static void main(String args[])
	{
		int i,x,z1,z2=0;
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
		for(i=1;i<x;i++)
		{
			z1=i*i;
			z2=z1+z2;
			System.out.println(z2);
		}
	}

}
