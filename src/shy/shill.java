package shilpa;
import java .util.Scanner;
public class shill {

		static float totalmarks=500;
		int marks;
		int rolno;
		String stu_name;
		static String collegename;
	//	static void add()

	//	Scanner s=new Scanner(System.in);
		//shill obj=new shill();
		//shill obj1=new shill();
		
		// TODO Auto-generated method stub
		
public static void main(String args[])
{
	int a=20;
	int b=30;
	int c=a+b;
	System.out.println(c);
	//	obj.add();
	//	obj.display();
		//obj.percentage();
	
	
	//shill shills=new shill();
	//shill.add();
	shill obj=new shill();
	
	obj.add();
	obj.display();
	obj.percentage();
}

void add()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter name of student");
	stu_name=scan.next();
	//rolno=scan.nextInt();
	System.out.println("rolno.");
	rolno=scan.nextInt();
	//collegename=scan.next();
	System.out.println("colegname");
	collegename=scan.next();
	//totalmarks=scan.nextInt();
	System.out.println("totalmarks");
	totalmarks=scan.nextInt();
	System.out.println("marks");
	marks=scan.nextInt();
}
void display()
{
	System.out.println("student name");
	System.out.println("rolno");
	System.out.println("colegename");
	System.out.println("marks");
	System.out.println("totalmarks");
}
void percentage()
{
	float percentage;
//	int result=0;
	//int marks;
	percentage=marks/totalmarks*100;
	System.out.println("percentage of student");
	System.out.println(percentage);
}
static
{

int a=10;
int b=30;
int c=a+b;
System.out.println(c);
}
{
	int a=20;
	int b=10;
	int c=a+b;
	System.out.println(c);
}

}