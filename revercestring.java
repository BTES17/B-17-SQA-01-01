package vinay;

public class revercestring {

	public static void main(String[] args) 
	{
		int i;
		
		String object=new String();
		object=("Hello java i am");
		int size=object.length();
		for(i=size-1;i>=0;i--)
		{
			System.out.print(object.charAt(i));
		}
	}
	

	}

