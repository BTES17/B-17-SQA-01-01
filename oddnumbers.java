import java.util.Scanner;


public class oddnumbers {

	
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the number");
	     int limit = scan.nextInt();
         
         System.out.println("Printing Odd numbers between 1 and " + limit);
        
         for(int i=1; i <= limit; i++){
                
                
                 if( i % 2 != 0){
                         System.out.print(i + " ");
                 }
         }
 }



	}


