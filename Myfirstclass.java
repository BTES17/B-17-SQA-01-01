import java.util.Scanner;

public class Myfirstclass
{
  int Batch_no;
 int Batch_timings;

 public void add(int a, int b)
{ 
 this.Batch_no=a;
 this. Batch_timings=b;
 
}
public void edit(int a,int b)
{
	this.Batch_no=a;
	this.Batch_timings=b;
	
}
public void display(Myfirstclass b)
{
	System.out.println(b.Batch_no);
	 System.out.println(b.Batch_timings);
	
}

void array()
{
	int [] a= {6,7,8,9,15,67,89};
	System.out.println(a.length);
	int count =0;
for (int i=0; i<=10;i++)
{
	try{
		System.out.println(a[i]);
		count++;
		}
		catch(Exception e){
			System.out.println(e);
		}
}
	
	System.out.println(count);
	}



public static void main (String args[])
{
	//Myfirstclass batch1= new Myfirstclass();
	//batch1.array();
	 Myfirstclass batch1= new Myfirstclass();
	 Myfirstclass batch2= new Myfirstclass();
	
	Scanner scan= new Scanner (System.in);
	System.out.println ("Enter the batch no and batch timings");
	int Batch_no=scan.nextInt();
	int Batch_timings=scan.nextInt();
	
    batch1.add(Batch_no, Batch_timings);
	
	System.out.println ("Enter updated timings");
	Batch_timings=scan.nextInt();
	batch1.edit(Batch_no,Batch_timings );
	
	System.out.println ("Enter the batch no and batch timings");
	Batch_no=scan.nextInt();
	Batch_timings=scan.nextInt();
	
	batch2.add(Batch_no, Batch_timings);
	System.out.println ("Enter updated timings");
	Batch_timings=scan.nextInt();
	batch2.edit(Batch_no,Batch_timings );
	
	batch1.display(batch1);
	batch2.display(batch2);
	
 
}

}
