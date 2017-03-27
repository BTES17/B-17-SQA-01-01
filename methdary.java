package Vishali;
import java.util.Scanner;

public class methdary {
		public static void main (String arg[])
		{
			int i;
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the values");
			methdary obj= new methdary();
			
			int[] ary=new int[5] ;
			for(i=0;i<5;i++)
			{
				ary[i]=scan.nextInt();
			}
			obj.methd(ary);
			for(i=0;i<5;i++)
			{
				System.out.println(ary[i]);
			}
		}
		 int methd(int ary[])
		{
			 for(int i=0;i<5;i++)
			 {
			ary[i]=ary[i]+3;
			
		}
			 return 0;
		}
	}


