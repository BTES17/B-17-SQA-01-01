
import java.util.Scanner;

public class student1 {

	
	String stu_name;
	int rollno;
	float marks;
	static String col_name;
	
	
	Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		
		student1 obj=new student1("btes");
				
		student1 obj1=new student1("sf",2,12);
		student1 obj2=new student1("err",3,34);
		student1 obj3=new student1("ef",5,34);
		student1 obj4=new student1("df",5,56);
		student1 obj5=new student1("dsg",7,88);
	/*	obj.collage();
		obj1.add();
		obj2.add();
		obj3.add();
		obj4.add();
		obj5.add();
		*/
		obj1.display();
		obj1.percentage();
		
		obj2.display();
		obj2.percentage();
		
		
		obj3.display();
		obj3.percentage();
		
		
		obj4.display();
		obj4.percentage();
		
		
		obj5.display();
		obj5.percentage();
		
	}
	student1 (String str2)
	{
		/*
		System.out.println("Enter college name:");
		 col_name=scan.next();
		 */
		col_name=str2;
	}
student1(String str, int i, int j)
{
	stu_name=str;
	rollno=i;
	marks=j;
}
	
	
		
		/*{
			System.out.println("Enter the details of the students:");
			System.out.println();
			
			
			System.out.println("Enter Student name:");
		    stu_name=scan.next();
		   
			System.out.println("Enter roll_no:");
			 rollno=scan.nextInt();
			 
			System.out.println("Enter marks:");
			 marks =scan.nextInt();
			
		
			
		}*/  
		void display()
		{
			System.out.println(stu_name);
			 
			System.out.println(rollno);
			
			System.out.println(marks);
			 
			System.out.println(col_name);
		
			
			
		}
		
		void percentage()
		{
			float per =marks/100*100;
			System.out.println(per +""+ "%");
			System.out.println();	
		}
		
	static     	{
			int a=28;
			System.out.println(a);
			int b=10+a*20;
			System.out.println(b);
			
			
		}
			
	

	
}







