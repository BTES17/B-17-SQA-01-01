package soniyajoshi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class employee  {
	
	    String name;
	double salary;
	String companyname="Btes"; 
		employee(String name,float salary,String companyname)
		{   this.name=name;
			this.salary=salary;
			this.companyname=companyname;
		}
			
	public static void main(String[] args) 
	{
		
			employee obj=new employee("Sonia",25,"Btes");
			employee obj1=new employee("Sunil",30,"Btes");
			employee obj2=new employee("Sakshi",26,"Btes");
	
			
			ArrayList<employee> list=new ArrayList<employee>();
			
			list.add(obj);	
			list.add(obj1);	
			list.add(obj2);	
		   

	
						Collections.sort(list, new salary());
						
						  for( employee e: list)
						  {
							  System.out.println(e.name);
						  }		
		}	
	
		
}



