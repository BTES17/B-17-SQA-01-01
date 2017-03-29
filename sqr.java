package vishali;

import java.util.Scanner;

 public class sqr
 {
	 public static void main(String args[])
	 {
 Scanner scan=new Scanner(System.in);
 System.out.println("enter the values");
 int a=scan.nextInt();
 System.out.println("squaer of the number ");
 int count=0;
 
	 
 for(int i=1;i<=a;i++)
 {
	 
	int b=i*i;
	System.out.println(b);
	count=count+b;
 }
 System.out.println("sum of the series is" + count);
	 }

}
