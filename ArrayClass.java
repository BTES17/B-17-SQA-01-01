/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javad;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ArrayClass

{
public static void main(String args[])

{
   
     Scanner s = new Scanner(System.in);
    System.out.println("Enter No.of Rows");
    int row=s.nextInt();
    System.out.println("Enter No.of column");
    int column=s.nextInt();   
    
    int [][]arr = new int[row][column];
   for(int i=0;i<row;i++)
   {
   for(int j=0;j<column;j++)
   {
       System.out.println("Enter Row"+i+"column"+j+":");
       arr[i][j]=s.nextInt();
   
   }
   }
   for(int i=0;i<row;i++)
   {
       for(int j=0;j<column;j++)
       {
           System.out.print(arr[i][j]+" ");
       
       }
  System.out.println(""); 
   
   }     
        
    
  
}

    
}
