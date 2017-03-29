import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		
			int i,j;
			Scanner scan = new Scanner(System.in);
			int array[]= new int[5];
			System.out.println("Enter values");
			for( i=0;i<5;i++)
			{
				array[i]=scan.nextInt();
			}
			for( i=0;i<4;i++)
			{
				System.out.print( array[i] + ",");
			}
			System.out.println(array[4]);
			for( i=0;i<5;i++)
			{
				for( j=i+1;j<5;j++)
				{
					if(array[i]>array[j])
					{
						int temp=array[i];
						array[i]=array[j];
						array[j]=temp;
					}
				 
				}
				
					
			}
				
				System.out.println("Ascending Order");
				for( i=0;i<4;i++)
				{
					System.out.print( array[i] + ",");
				}
				System.out.println(array[4]);
			}
	
}




		


	

	


