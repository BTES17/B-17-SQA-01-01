package soniyajoshi;

import java.util.Scanner;

public class abcd {
	
	
	    static float totalmarks=500;
		int rollno; 
		float marks;
		String name;
		static String clgname="IET"; 
			
	public static void main(String[] args) 
	{
		 int a=20;
		 int b=60;
		 int c=a+b;
		 System.out.println(c);
	    
			
			abcd obj=new abcd();
			abcd obj1=new abcd();
			abcd obj2=new abcd();
			abcd obj3=new abcd();
			abcd obj4=new abcd();
			
			
		    obj.add();
			obj.display();
			obj.percentage();
			
				
			    obj1.add();
				obj1.display();
				obj1.percentage();
				
				    obj2.add();
					obj2.display();
					obj2.percentage();
					
					    obj3.add();
						obj3.display();
						obj3.percentage();
						
						    obj4.add();
							obj4.display();
							obj4.percentage();
							
				
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
			 
	 }
		
		
	    void display()
		{
			System.out.println(name);
			System.out.println(rollno);
			System.out.println(marks);
			System.out.println(clgname);
			
	
			
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
		static {
			 int a=110;
			 int b=30;
			 int c=a+b;
			 System.out.println(c);
			 
		}
}
		

