package jashan;

import java.util.Scanner;

public class students {
	String name;
	int roll_no;
	int marks;
	static String clg_name;
	
public static void main(String []args)

{

		students obj=new students("btes");
		//obj.add();
		students obj1=new students("jashan",20,30 );
		//obj1.add();
		obj1.display();
		obj1.percentage();
		students obj2=new students("abc",40,50);
		//obj2.add();
		obj2.display();
		obj2.percentage();
		students obj3=new students("abd",10,20);
		//obj3.add();
		obj3.display();
		obj3.percentage();
		
	
}
		students  (String str2 ){
			//Scanner scan=new Scanner(System.in);
			//System.out.println("enter the name");
			 //name=scan.next();
			 //System.out.println("enter the roll_no");
			 //roll_no=scan.nextInt();
			 //System.out.println("enter the marks");
			 //marks=scan.nextInt();
			// System.out.println("enter the clg_name");
			 clg_name=str2;
			 
		}students  (String str,int i,int j){
			name=str;
			roll_no=i;
			marks=j;
		}
		void display(){
			System.out.println(name);
			System.out.println(roll_no);
			System.out.println(marks);
			System.out.println(clg_name);
		}
		void percentage(){
			float percentage=marks/5;
			System.out.println(percentage +" "+ "%");
			
			
			
		}
}
