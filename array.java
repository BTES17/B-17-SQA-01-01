import java.util.Scanner;

public class array {
public static void main(String[] args)
{
	int[] array=new int[10];
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a value");
	for(int i=0; i<=9;i++)
	{
		array [i]=scan.nextInt();
		
	}
	for(int i=0; i<=9;i++)
	{
		
		System.out.println(array[i]);
	}
			
}
}
