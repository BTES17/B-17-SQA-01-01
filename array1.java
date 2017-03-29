package bebo;
import java.util.Scanner;

	public class array
	{
	   public static void main (String args[])
	    {
	        int[] a= new int[5];
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Please enter numbers...");
	        for(int j=0;j<5;j++)
	        {
	            a[j]=sc.nextInt();
	        }
	        for(int j=0;j<5;j++){
	        System.out.println(a[j]);}
	     }
	} 

