package yenkee;
import java.util.Scanner;
public class new_arr {

static int i;
	public static void main(String[] args) {
		System.out.println("enter the element");
		int Myarray[] =new int[3];
Scanner scan= new Scanner (System.in);
array1 obj1 = new array1();

for(i=0;i<3;i++)
{
	Myarray[i]=scan.nextInt();
	
} 
obj1.myarray(Myarray);
for(i=0;i<3;i++)
{
System.out.println(Myarray[i]);	
}
	
	}
}
class array1{
	int i;
	int myarray(int Myarray[])
	{
		for (i=0;i<3;i++){
		Myarray[i]= Myarray[i]+3;
	}
		return 0;
	}
}