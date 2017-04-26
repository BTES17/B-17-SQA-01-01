package vinay;

import java.util.ArrayList;
import java.util.Scanner;

public class collection {

	public static void main(String[] args) {
	
		ArrayList<Integer> list=new ArrayList<Integer>();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the any values");
		int a=scan.nextInt();
		for(int i=0;i<=a; i++)
		{
			int c=scan.nextInt();
			list.add(c);
		}
		for(int c: list)
		{
			System.out.println(c);
		}
		}

	}

