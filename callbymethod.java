package vishali;

public class callbymethod {
	public static void main (String arg[])
	{
		int a,b,c;
		a=67;
		b=87;
		c=76;
		boolean i=(a<b)&&(b<c);
		System.out.println(i);
		
		callbymethod obj=new callbymethod();
		System.out.println(obj.methd());
	}
	 int methd()
	{
		int a,b,c;
		a=67;
		b=87;
		c=a+b;
		
		//System.out.println(c);
		return c;
		
		
	}

}
