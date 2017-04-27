import java.util.ArrayList;
import java.util.Collections;

public class sorting implements Comparable<sorting>{
	static String company="byte";
	String Name;
	int Empl_id;
	double salary;
	sorting(String Name,int Empl_id,double salary)
	{
		
	this.Name=Name;
	this.Empl_id=Empl_id;
	this. salary = salary;
		
	}
	
	public static void main(String[] args) {
	
		sorting obj1=new sorting("xyz",1, 100);
		sorting obj2=new sorting("jashan",2, 100);
		sorting obj3=new sorting("abc",3, 100);
		ArrayList<sorting> list=new ArrayList<sorting>();
			list.add(obj1);
			list.add(obj2);
			list.add(obj3);
			Collections.sort(list);
			for(sorting a:list){
				System.out.println(a.Empl_id);
			}
	}
		public int compareTo(sorting e){
			
			if(this.Empl_id>e.Empl_id)
				return 1;
			else if (this.Empl_id==e.Empl_id)
				return 0;
			else 
				return-1;
		}
		
			
		
	}


