package soniyajoshi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class employee implements Comparable<employee> {
	
	    String name;
		float salary;
	String companyname="Btes"; 
		employee(String name,float salary,String companyname)
		{
			this.name=name;
			this.salary=salary;
			this.companyname=companyname;
			
		}
			
	public static void main(String[] args) 
	{
		
			employee obj=new employee("Sonia",25,"Btes");
			employee obj1=new employee("Sunil",30,"Btes");
			employee obj2=new employee("Sakshi",26,"Btes");
	
			
			ArrayList<employee>list=new ArrayList<employee>();
			
			list.add(obj);	
			list.add(obj1);	
			list.add(obj2);	
		   
  for( employee a: list)
  {
	  System.out.println(a.salary);
  }
						
						Collections.sort(list);
						
						  for( employee a: list)
						  {
							  System.out.println(a.salary + a.name);
						  }		
		}	
	
		@Override
		public int compareTo(employee o) {
			if (this.salary>o.salary)
			return 1;
			else if ( this.salary==o.salary)
				return 0;
			else
				return -1;
		
		}
}
		

