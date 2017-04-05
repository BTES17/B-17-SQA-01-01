package vishali;

import java.util.Scanner;

public class studnt {
	static String college;
String name;
int rollno;
float marks;

public static void main(String args[])
{
	studnt obj5=new studnt();
	obj5.clg();
    studnt obj=new studnt();
    obj.add();
    obj.detail();
    obj.percentage();
    studnt obj1=new studnt();
    obj1.add();
    obj1.detail();
    obj1.percentage();
    studnt obj2=new studnt();
    obj2.add();
    obj2.detail();
    obj2.percentage();
    studnt obj3=new studnt();
    obj3.add();
 	obj3.detail();
	obj3.percentage();
	studnt obj4=new studnt();
    obj4.add();
	obj4.detail();
	obj4.percentage();

}

void clg()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the name of college");
	college = scan.next();
}
void add()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the name of the student");
	name=scan.next();
	System.out.println("Enter the roll-no of the student");
	rollno=scan.nextInt();
	System.out.println("Enter the marks of the student");
	marks=scan.nextInt();
}

void detail()
{
	System.out.println(college);
	System.out.println(name);
	System.out.println(rollno);
	System.out.println(marks);
	
}

void percentage()
{
	float a=marks*100;
	float b=a/500;
	System.out.println(b + "" + "%");
}

}
