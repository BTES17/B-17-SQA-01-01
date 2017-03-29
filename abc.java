package inder;

import java.util.Scanner;

public class abc {
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);

int x=in.nextInt();
int i;
int fact=1;
for(i=1;i<=x;i++)
{
	fact=fact*i;
	
}
System.out.println(fact);
}
}
