package vinay;
import java.util.Scanner;

public class studentstatic {
	static String college_name;
	int roll_no;
	//int student_class;
	float obtain_marks,total_marks,percentage;
	
	
	String stu_name;
	
	public static void main(String[] args) {
		
		
	
	
	
	student obj=new student();
	obj.add();
	obj.display();
	obj.percentage();
	
	}
	void add()
	{
		System.out.println("Enter the detail of students");
		
		
		Scanner scan=new Scanner(System.in);
    System.out.println("Enter the student's name");
   stu_name=scan.next();
   
     System.out.println("Enter the student's roll_no");
	 roll_no=scan.nextInt();
     System.out.println("Enter the student's marks");
      obtain_marks=scan.nextInt();
      System.out.println("enter the student's college name");
      college_name=scan.next();
	}

	void display()
	
	{	
	
      System.out.println(stu_name);
      System.out.println(roll_no);
      System.out.println(obtain_marks);
     // System.out.println(student_class);
      System.out.println(college_name);
	}

	void percentage()
	{
		float percentage=obtain_marks/500*100;
	
		System.out.println(percentage+""+ "%");
		System.out.println();
	}
	{
		int a=20;
		System.out.println(a);
		int c= 30+a*20;
		System.out.println(c);
	}	
		static
	
	{
		System.out.println("hello everyone , have a nice day");
		
	}
	
		{
			int a=55;
			System.out.println(a);
			int c= 30+a*20;
			System.out.println(c);
		}	
	}
	
	



