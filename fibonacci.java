package bebo;
import java.util.Scanner;

public class fibonacci 
{
	public static void main (String args[])
	 {
	int t1=0,t2=1,nextterm=0,x;
	Scanner in=new Scanner(System.in);
	x=in.nextInt();
	System.out.println(x);
	for(int i=3;i<x;i++){
		nextterm=t1+t2;
		t1=t2;
		t2=nextterm;
		
		
		System.out.println(nextterm);
	}
}}
