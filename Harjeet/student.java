import java.util.Scanner;

public class student {

	
	String stu_name;
	int rollno;
	float marks;
	static String col_name;
	
	
	Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		
		student obj=new student();
				
		student obj1=new student();
		student obj2=new student();
		student obj3=new student();
		student obj4=new student();
		student obj5=new student();
		obj.collage();
		obj1.add();
		obj2.add();
		obj3.add();
		obj4.add();
		obj5.add();
		
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
	void collage()
	{
		
		System.out.println("Enter college name:");
		 col_name=scan.next();
	}
void add()
	
	
		
		{
			System.out.println("Enter the details of the students:");
			System.out.println();
			
			
			System.out.println("Enter Student name:");
		    stu_name=scan.next();
		   
			System.out.println("Enter roll_no:");
			 rollno=scan.nextInt();
			 
			System.out.println("Enter marks:");
			 marks =scan.nextInt();
			  
		
			
		}
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
		
	
			
	

	
}







