import java.util.Scanner;
//import java.util.function.IntBinaryOperator;

public class demo1 {

	public static void main(String[] args) {
	
		
		int[][] i=new int [5][4];
		
	
		
		Scanner demo1=new Scanner (System.in);
		
		
			
		 
		for(int row=0;row<=4;row++)
		 {		  
			   
		   
		  for(int col=0;col<=3;col++)
			  
		   {	   
			   i[row][col]=demo1.nextInt();
			   
			   			   
		   
			 }
			  
	  
		  }
	
		 for(int row=0;row<=4;row++)
		 {		  
			   
		   
		   for(int col=0;col<=3;col++)
			  
		   {	   
			  System.out.print( i[row][col]+" ");
			   
			   			   
		   }
		   System.out.println();
			  
	  
		   }
	}}
	
		   

