package soniyajoshi;

import java.util.Scanner;

public class abcd {
	
	
	    static float totalmarks=500;
		int rollno; 
		float marks;
		String name;
		static String clgname; 
			
	public static void main(String[] args) 
	{
		 int a=20;
		 int b=60;
		 int c=a+b;
		 System.out.println(c);
	    
			
			abcd obj=new abcd();
			
			
		    obj.add();
			obj.display();
			obj.percentage();
			
				
				
		}	
	
	    
	     void add()
     {
	    	 Scanner scan=new Scanner(System.in);
    	 
    	    System.out.println("Enter name of student");
    	      name=scan.next();
			System.out.println("Enter rollno of student");
			  rollno=scan.nextInt();
			System.out.println("Enter marks of student");
			  marks=scan.nextInt();
			System.out.println("Enter clgname of student");
			  clgname=scan.next();
	 }
		
		
	    void display()
		{
			System.out.println(name);
			System.out.println(rollno);
			System.out.println(marks);
			System.out.println(clgname);
			System.out.println(totalmarks);
	
			
		}
		 void percentage()
		 {
			float percentage;
			percentage=marks/totalmarks*100;
			System.out.println("Percentage of student");
			System.out.println(percentage);
	
			 
		 }
		static {
			 int a=10;
			 int b=30;
			 int c=a+b;
			 System.out.println(c);
			 
			 
		 }
		 {
			 int a=110;
			 int b=30;
			 int c=a+b;
			 System.out.println(c);
			 
		}
		
}
