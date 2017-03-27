package soniyajoshi;
import java.util.Scanner;
public class task2 
{
	public static void main(String[] args)
	{
		

	Scanner scan=new Scanner(System.in); 
	int[] myarray= new int[5];
	System.out.println("Enter the value");
	task2 obj=new task2();
	
	int i;
	for(i=0;i<5;i++)
	{
		myarray[i]=scan.nextInt();
	}
	obj.method(myarray);
	for(i=0;i<5;i++)
	{
		System.out.println(myarray[i]);
		
	}
	}
	int method(int myarray[])
	{
		for(int i=0;i<5;i++)
		{
			myarray[i]=myarray[i]+3;
		}
		return 0;
		}
	}


