import java.util.Scanner;

public class twodimentional {
	
	
		public static void main(String[] args) 
		{
			int row,col,i,j;
		 	int[] [] array=new int [10] [10];
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter number of rows for array");
			row=scan.nextInt();
			System.out.println("Enter number of column for array");
			col=scan.nextInt();
			
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
					System.out.print(array[i][j] +"  ");
				}
				System.out.println();
			}
		}
}
			