import java.util.Scanner;
public class student {
	static String college;
	static float totalmarks;
	static String studentname;
float marks;
	int rollno;
	public static void main(String args[])
	{
		student[] obj=new student[2];
		for(int i=0;i<=5;i++)
		{
			obj[i]=new student();
			obj[i].add();
obj[i].display();
obj[i].percentage();		
		}
	}
	void add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the student name:");
		 studentname =sc.next();
		System.out.println("enter the college of student:"); 
		 college =sc.next();
		System.out.println("enter the marks of student:");
	 marks =sc.nextInt();
		System.out.println("enter the roll number of student:"); 
		 rollno =sc.nextInt();
		System.out.println("enter the totalmarks of student:"); 
	 totalmarks =sc.nextInt();
		
	}
	 void display()
	 {
		 System.out.println(studentname);
			System.out.println(marks);
			System.out.println(rollno); 
			System.out.println(college); 
			System.out.println(totalmarks);
	 }
	void percentage()
	{
	float a;
		a=((marks/totalmarks)*100);
		System.out.println(marks+ " " +a);
	}
	{
		int a=9;
		System.out.println(a);
	}

}
