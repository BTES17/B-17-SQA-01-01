package array;

import java.util.Scanner;

public class asending {

	public static void main(String[] args) {
		int i,j;
		Scanner scan1= new Scanner (System.in);
		int ary[]=new int[5];
		System.out.println("enter the values");
		for( i=0;i<5;i++)
		{
			ary[i]=scan1.nextInt();
			
			
		}
		for(i=0;i<5;i++)
		{
			for( j=i+1;j<5;j++)
		
			{
				if(ary[i]>ary[j])
			
				{
					int temp=ary[i];
					ary[i]=ary[j];
					ary[j]=temp;
				}
			
			}
		}
		System.out.println("Ascending Order");
		for( i=0;i<4;i++){
			System.out.println(ary[i]);
			
		}System.out.println(ary[4]);
	}

}
