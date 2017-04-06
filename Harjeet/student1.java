
import java.util.Scanner;


public class student1 {

		
			
			
				String stu_name;
				int rollno;
				float marks;
				static String col_name;
				
				
				Scanner scan=new Scanner(System.in);

				public static void main(String[] args) {
					
					student1 obj=new student1("sviet");
					student1 obj1=new student1("Harjeet",1,77);
					student1 obj2=new student1("vinay",2,99);
					student1 obj3=new student1("janky",3,78);
					student1 obj4=new student1("harjot",4,79);
					student1 obj5=new student1("saini",5,80);
					
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
				student1(String str,int i,int j)
				{
					stu_name=str;
					rollno=i;
					marks=j;
					
				}
				student1(String str1)
				{
					col_name=str1;
				}
				/*	void collage()
				{
					System.out.println("Enter collage name:");
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
					
					
			   static
			   {
						int a=10;
						System.out.println(a);
						int b=10+a*20;
						System.out.println(b);
					}
				
					{
						int a=20;
						int b=30;
						int c=a*b;
						System.out.println(c);
						
						}
				static	{
						int a=10;
						int b=100+a;
						System.out.println(b);
						int c=a*b;
						System.out.println(c);
						
					}
			}
			


		

	