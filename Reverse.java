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
public class Reverse 
        
        {
public static void main(String args[])

{
   
     Scanner s = new Scanner(System.in);
    System.out.println("Enter No.of array");
    int row=s.nextInt();
      
      System.out.println("Enter elements");
    int []arr = new int[row];
   for(int i=0;i<arr.length;i++)
   {
   
     
       arr[i]=s.nextInt();
  }
   for(int i=arr.length-1;i>=0;i--)
   {
      
           System.out.print(arr[i]+" ");
   }    
  System.out.println(""); 
   
   }     
        
    
  
}

    
}
