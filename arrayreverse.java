package vinay;

import java.util.Scanner;

public class arrayreverse 
{

	public static void main(String[] args) 
	{
     
      Scanner object=new Scanner(System.in);
      System.out.println("enter the size of array");
     int length=object.nextInt();
     
     int array[]=new int[length];
     System.out.println("enter the element of array");
     
        for(int i=0;i<length;i++)
        {
        	array[i]=object.nextInt();
        }
     System.out.println("Enter the element of array");
     
     for(int i=0;i<length;i++)
     {
    	 System.out.println(array[i]);
     }
     System.out.println("Array in reverse order");
         for(int i=length-1;i>=0;i--)
         {
        	 System.out.println(array[i]);	 
         }
     }

    	 
	}      
      


