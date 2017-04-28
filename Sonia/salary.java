package soniyajoshi;

import java.util.Comparator;

public class salary implements Comparator<employee> 
{
	public int compare(employee e1,employee e2){
	
		return e1.name.compareTo(e2.name);
	}  
}
