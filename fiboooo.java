import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[])
    {
        int a=0,b=1,c,i;
         Scanner sc = new Scanner(System.in);
System.out.println("Enter a number to print fibonacci series");  
int n= sc.nextInt();
            System.out.print(a+" "+b);
        for(i=2;i<n;i++)
        {
          c=a+b;        
        System.out.print(" " +c);
        a=b;
        b=c;   
    }
  }
}