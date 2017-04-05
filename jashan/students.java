import java.util.Scanner;

public class students 
{
	String name;
	int rollno;
	float marks;
	static String colg_name;
	 int a,b;
	
		public static void main(String args[])
		{
			
			students obj = new students();
			obj.clg();
			students obj1 = new students();
			obj1.add();
			obj1.display();
			obj1.percentage();
			students obj2 = new students();
			obj2.add();
			obj2.display();
			obj2.percentage();
			students obj3 = new students();
			obj3.add();
			obj3.display();
			obj3.percentage();
			students obj4 = new students();
			obj4.add();
			obj4.display();
			obj4.percentage();
			students obj5 = new students();
			obj5.add();
			obj5.display();
			obj5.percentage();
			

		}
		void clg()
		{
			System.out.println("Enter the name of college");
			Scanner scan= new Scanner(System.in);
			colg_name= scan.next();
		}
		void add()
		{  
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the name");
			name = scan.next();
			System.out.println("Enter the rollno");
			rollno = scan.nextInt();
			System.out.println("Enter the marks");
			marks = scan.nextInt();
			
		}
		void display()
		{
			System.out.println(name);
			System.out.println(rollno);
			System.out.println(marks);
			System.out.println(colg_name);
		}
		void percentage()
		{
			float percent = marks/5;
			System.out.println(percent + "" + "%");
		}
		
	}

