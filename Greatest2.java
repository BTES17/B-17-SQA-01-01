package ranag;

public class Greatest2 {
public static void main(String[] args){
		
		greatest();
	}
static void greatest(){
	
	int x=9,y=8,z=7;
	if((x>y)&&(x>z))
	{
		System.out.println(x);
		
	}
	else if((y>z)&&(y>x))
	{
		System.out.println(y);
	}
	else 
	{
		System.out.println(z);
	}
	}
	
}
