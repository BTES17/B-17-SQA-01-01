package Ravdeep;

public interface inter{
	abstract void abc();
	public static void main(String args[])
	{ 	

		r obj=new r();
		obj.inter();
		obj.abc();
	}
}
class r implements inter{
	public void inter()
	{
		System.out.println("Hello");
	}

@Override
public void abc() {
	System.out.println("Hi");
	
}



}