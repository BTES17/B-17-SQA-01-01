import java.util.Scanner;
public class rrrrrrrrrrrr {

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


