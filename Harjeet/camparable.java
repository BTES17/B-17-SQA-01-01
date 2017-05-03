import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class camparable implements Comparable<camparable> 
{	
	String emp_name;
int emp_id;  
int salary;
static String comp_name="BTES";

	public static void main(String[] args) {
		
		
		
        camparable obj1=new camparable("Sheena",2,1000000000);
        camparable obj2=new camparable("Janky",3,10);
        camparable obj3=new camparable("Harjeet",1,40000);
       
        ArrayList<camparable> list= new ArrayList<camparable>();       
        	list.add(obj1);
        	list.add(obj2);
        	list.add(obj3);
        	Collections.sort(list);
        	for(camparable f:list){
        		System.out.println(f.emp_id);
        		
        	}
       
	}
	public int compareTo(camparable e)
	{
		if(this.emp_id> e.emp_id)
			return 1; 
		else if(this.emp_id ==e.emp_id)
			return 0;
		
		else
			return -1;	
			
	}
	camparable(String emp_name, int emp_id,int salary)
	{
		this.emp_name=emp_name;
		this.emp_id=emp_id;
		this.salary=salary;
	}

	
	}