package vishali;

import java.util.Scanner;

public class student {

	static String college;
	String name;
	int rollno;
	float marks;



	public static void main(String args[])
	{
		student obj5=new student("ct group");
		//obj5.clg();
	    student obj=new student("vishali",2,457);
	   // obj.add();
	    obj.detail();
	    obj.percentage();
	    student obj1=new student("rahul",1,349);
	    //obj1.add();
	    obj1.detail();
	    obj1.percentage();
	    student obj2=new student("anusha",3,378);
	    //obj2.add();
	    obj2.detail();
	    obj2.percentage();
	    student obj3=new student("ravi",4,298);
	    //obj3.add();
     	obj3.detail();
    	obj3.percentage();
    	student obj4=new student("hurrr",5,467);
	    //obj4.add();
    	obj4.detail();
    	obj4.percentage();
	
	}
	
	student(String string)
	{
		/*Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name of college");
		college=scan.next();*/
		college=string;
		
	}
	student(String string, int i, int j)
	{
		/*Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name of the student");
		name=scan.next();
		System.out.println("Enter the roll-no of the student");
		rollno=scan.nextInt();
		System.out.println("Enter the marks of the student");
		marks=scan.nextInt();*/
		name=string;
		rollno=i;
		marks=j;
		
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
