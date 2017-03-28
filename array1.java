import java.util.Scanner;

public class array1 {
	public static void main(String[] args)
	{
		
		array1 object=new array1();
		System.out.println("Enter size of array");
		Scanner scan=new Scanner (System.in);
		int size=scan.nextInt();
		int[] array=new int[size];
		System.out.println("Enter all the elements");
		
		for(int i=0;i<size;i++)
		{
			
			array[i]=scan.nextInt();
		}
		
		object.myarray(array,size);
		
		for(int i=0;i<size;i++)
		{
			
			
			System.out.println(array[i]);
		}
		
		//System.out.println(array[4]);
	}
			
	       int myarray(int b[],int size)
			{
	    	   
				
	    	   for(int i=0;i<size;i++)
				{
					
	    		   b[i]=b[i]+3;
	    		  System.out.println(b[i] + ",");
				}
				
	    	   System.out.println("updated array");
				
	    	   return 0;
			}
	}



	
	
	


