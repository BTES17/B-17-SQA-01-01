import java.util.Scanner;
public class array {
public static void main(String args[])
{   Scanner scan=new Scanner(System.in);
System.out.println("Enter the values");
	array1 obj= new array1();
	
	int i;

	int a[]=new int[4];
	for(i=0;i<4;i++)
	{
		a[i]=scan.nextInt();
	}
	obj.Myarray(a);
	for(i=0;i<4;i++)
	{
	System.out.println(a[i]);
}}
static void Myarray(int a[])
{   
	
	for(int i=0;i<4;i++)
	{	
		a[i]=a[i]+3;
	
	}
}
}
