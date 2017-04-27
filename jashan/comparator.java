import java.util.ArrayList;
import java.util.Collections;

public class comparator implements Comparable<comparator>{
	static String company="byte";
	String Name;
	int Empl_id;
	double salary;
	comparator(String Name,int Empl_id,double salary){
		this.Name=Name;
		this.Empl_id=Empl_id;
		this. salary = salary;
			
	}

	public static void main(String[] args) {
		comparator obj1=new comparator("xyz",3, 300);
		comparator obj2=new comparator("jashan",2, 200);
		comparator obj3=new comparator("abc",1, 100);
		ArrayList<comparator> list=new ArrayList<comparator>();
			list.add(obj1);
			list.add(obj2);
			list.add(obj3);
			Collections.sort(list);
			for(comparator a:list){
				System.out.println(a.salary);
			}}
	public int compareTo(comparator e){
		
		
		if(this.salary>e.salary)
			return 1;
		else if (this.salary==e.salary)
			return 0;
		else 
			return-1;
		
	}

	}
