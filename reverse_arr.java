package janky1;
import java.util.Scanner; 
public class reverse_arr {

	public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 System.out.println("enter the size of array");
 int size= scan.nextInt();
 int arr1[] = new int[size];
 System.out.println("Enter the no's.");
 for (int i=0;i<size;i++ )
 {
	 arr1[i]=scan.nextInt();
 }
 System.out.println("the no in array");
 for( int i=0; i<size;i++)
 {
	 System.out.println(arr1[i]);
 }
 System.out.println("the reverse of array");
 for (int i=size-1; i>=0;i--)
 {
	 System.out.println(arr1[i]);
 }
	}

}
