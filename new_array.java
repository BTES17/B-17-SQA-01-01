package array;

import java.util.Scanner;

public class new_array {

	static int i;
	public static void main(String[] args) {
		System.out.println("enter  the elements");
			int myarray[]=new int[3];
			Scanner scan=new Scanner(System.in);
			array1 obj1 = new array1(); 
			for(i=0;i<3;i++)
			{
			myarray[i]=scan.nextInt();
			
			}
			obj1.myarray(myarray);
			for(i=0;i<3;i++)
			{
				System.out.println(myarray[i]);
				
			}}}
		class jashan1{
			int i;
			int myarray(int myarray[]) 
			{
				for(i=0;i<3;i++){
					myarray[i]=myarray[i]+3;
					}
				
		return 0;	}
		}
			
			
			
		