
package vehicle;
import java.util.Scanner;

public class method1 
{
		public static void main(String args[])
		{
			method1 obj= new method1();
			
			
			  System.out.println("Enter size of array:");
			  Scanner s = new Scanner(System.in);
			int size=s.nextInt();
			int a[] = new int[size];
	        System.out.println("Enter all the elements:");
	        for (int i = 0; i < size; i++) 
	        {
	        	
	            a[i] = s.nextInt();
	        }
	        obj.myarray(a,size);
	        for(int i=0;i<size;i++)
	        {
	        	
	        	System.out.print(a[i] + ",");
	        }
	        System.out.print(a[4]);
		}

		int myarray(int b[],int size) 
		{
			
	        int n;
	        for (int i = 0; i < size; i++)
	        {
	            b[i]= b[i] + 3;
	            //System.out.println(a[i] + ",");
	            
	        }
	        System.out.println("Updated Array");
	      
			return 0;
		}

	}
