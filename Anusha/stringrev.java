import java.util.Scanner;

public class stringrev 
{
	public static void main(String args[])
	{
		String str = "Hello Java";
		String new_str ="";
		String my="";
		import1 obj=new import1();
		obj.demo();
		int a = str.length();
		Scanner scan = new Scanner(System.in);
		
		String a2 = scan.nextLine();
	
	
		for(int i=a-1;i>=0;i--)
		{
			if (i==0)
			{
				my=my+str.charAt(i);
				my=my.toLowerCase();
				System.out.println (my);
				
			}
			else if (i==a-1)
			{
				my=my+str.charAt(i);
				my=my.toUpperCase();
				
			
			}
			else if (str.charAt(i)==' ')
			{
				my=my+str.charAt(i-1);
				my.toUpperCase();
				
			}
			
			new_str = new_str + my;
			my="";
		}
		
		
		
		System.out.println(new_str);
		

	}
}
