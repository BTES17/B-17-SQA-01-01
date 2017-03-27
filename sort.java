package shy;
import java.util.Scanner;
public class sort {

	public static void main(String args[])
	{
		      int[] myList = {1,34,56,67,80};
		      for (int i = 0; i < myList.length; i++) {
		     System.out.println("enter the elements");
		     
		      }
		      int max = myList[0];
		      for (int i = 1; i < myList.length; i++) {
		         if (myList[i] > max) max = myList[i];
		      }
		      System.out.println("Max is " +max);  
		   }
		}

