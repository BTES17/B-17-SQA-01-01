package jashan;

import java.util.Scanner;

public class student {String name;
int rollno;
float marks;
static String colg_name;
 int a,b;


	

		
		
			
				public static void main(String args[])
				{
					
					student obj = new student();
					obj.clg();
					student obj1 = new student();
					obj1.add();
					obj1.display();
					obj1.percentage();
					student obj2 = new student();
					obj2.add();
					obj2.display();
					obj2.percentage();
					student obj3 = new student();
					obj3.add();
					obj3.display();
					obj3.percentage();
					student obj4 = new student();
					obj4.add();
					obj4.display();
					obj4.percentage();
					student obj5 = new student();
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


