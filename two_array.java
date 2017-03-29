package abc;
import java.util.Scanner;
public class two_array {

	public static void main(String[] args) {
		
		 		int arr2[][] = new int[3][3];
		 		Scanner scan = new Scanner(System.in);
		 		System.out.println("Enter the elements for 3x3 matrix");
		 		for(int i=0;i<3;i++)
		 			{
		 				for(int j=0;j<3;j++)
		 				{
		 					arr2[i][j] = scan.nextInt();
		 				}
		 			}
		 		for(int i=0;i<3;i++)
		 		{
		 			for(int j=0;j<3;j++)
		 			{
		 				System.out.println(arr2[i][j]);
		 			}
		 		}
		 		System.out.println(arr2[1][2]);
		 	}
		 
		 }
	


