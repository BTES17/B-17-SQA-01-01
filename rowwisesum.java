import java.util.Scanner;


public class rowwisesum {

	
	public static void main(String[] args) {
		
		int row,col,i,j;
	 	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter number of rows for array ");
		row=scan.nextInt();
		System.out.println("Enter number of column for array");
		col=scan.nextInt();
		int[] [] array=new int [row] [col];
		
		System.out.println("Enter "  +(row*col)+  " elements : ");
		for( i=0;i<row;i++)
		{
			for( j=0;j<col;j++)
			{
				array[i][j]=scan.nextInt();
					
			}
		}
		System.out.println("The array is:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(array[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("Sum of rows is: ");
		int count=0;
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				count=count+array[i][j];
				
			}
			System.out.println(count +" ");	
			
			count=0;
			
			
		}
			
		}
}
			
	
	

	



