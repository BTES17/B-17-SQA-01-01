package bebo;
import java.util.Scanner;

public class square
{
	public static void main (String args[])
	{
		int i,x,z,z1=0;
		Scanner in= new Scanner(System.in);
		x=in.nextInt();
		for(i=1;i<x;i++)
		{
			z=i*i;
			z1=z1+z;
			
		}
		System.out.println(z); 
	
	
}}