package vishali;

import java.util.Scanner;

public class fact {
	
		 public static void main(String args[])
		 {  
			 
			 Scanner s=new Scanner(System.in);
			 System.out.println("enter the number");
			// a=s.nextLine();
			 
		  int i,fact=1;  
		  int a = 1;
		 // int number=5;//It is the number to calculate factorial    
		  for(i=1;i<=a;i++)
		  {    
			  a=s.nextInt();
		      fact=fact*i;    
		  
		  }    
		  System.out.println("Factorial of "+a+" is: "+fact);    
		 }  
		}  

