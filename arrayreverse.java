package matrix;

import java.util.Scanner;

public class arrayreverse {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		System.out.println("enter the size of array");
		int lenght=object.nextInt();
		int array[]=new int[lenght];
		System.out.println("enter the elements array");
		for(int i=0;i<lenght;i++)
		{
			array[i]=object.nextInt();
			System.out.println("enter the elements array");
			
		}
		for(int i=0;i<lenght;i++){
			System.out.println(array[i]);
			
		}
		System.out.println("Array in reverse order");
		
		for(int i=lenght-1;i>=0;i--)
		 {
       	 System.out.println(array[i]);	 
		 }
	}

}
