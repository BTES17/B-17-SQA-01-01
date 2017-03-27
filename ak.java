import java.util.Scanner;
//import java.lang.*;


public class ak {

	public static void main(String args[]) 
	{
		
		Scanner s=new Scanner(System.in);
		 int[] num=new int[5];

		 System.out.println("enter the value");
		 ak obj=new ak();
		 //obj.method(number);
		 
		 for(int i=0;i<5;i++)
		 {
			 num[i]=s.nextInt();
			 
			// System.out.println(i);
			 
		 }
		 obj.method(num);
		 for(int i =0;i<5;i++)
		 {
			 System.out.println(num[i]);
		 }
	}
	
int method(int num[])
{
	for (int i=0;i<5;i++)
	{
	num[i]=num[i]+3;
	}
	return 0;
}		 
		
}
		 
		
		 
				 

