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
public class SumArray {
    public static void main(String args[])
    {
        
            Scanner s = new Scanner(System.in);
            System.out.println("Enter no.of rows");
            int row=s.nextInt();
            System.out.println("Enter no of columns");
            int column=s.nextInt();
            int[][] array= new int [row][column];
            int[][] array2= new int [row][column];
            int[][] sum= new int [row][column];
            System.out.println("First matrix");
            for(int i=0;i<row;i++)
                {
                    for(int j=0;j<column;j++)
                    {
                    
                    System.out.println("enter row"+i+"column"+j);
                   array[i][j]=s.nextInt();
                    }    
                }
            
             for(int i=0;i<row;i++)
   {
       for(int j=0;j<column;j++)
       {
           System.out.print(array[i][j]+" ");
       
       }
  System.out.println(""); 
   }
            
                      System.out.println("Second Matrix");  
                    for(int i=0;i<row;i++)
                    {
                        for(int j=0;j<column;j++)
                        {
        System.out.println("enter row"+i+"column"+j);
        array2[i][j]=s.nextInt();
                      }
                    
                    }
    
     for(int i=0;i<row;i++)
   {
       for(int j=0;j<column;j++)
       {
           System.out.print(array2[i][j]+" ");
       
       }
  System.out.println(""); 
   }
    
     System.out.println("Sum of two matrix");
     for( int i=0;i<row;i++)
     {
         for(int j=0;j<column;j++)
         
         {
         
          sum[i][j]=array[i][j]+array2[i][j];
             System.out.print(sum[i][j]+" ");
         }
         System.out.println("");
     }
     
    
     
     
     
     
    }
    
    
}
