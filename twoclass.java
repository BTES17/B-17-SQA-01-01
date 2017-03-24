
public class twoclass {
	 static secondclass obj=new secondclass();
	public static void main(String args[])
	{
		int a=7,b=4,c=8;
		if(a>b&&b<c)
		{
			System.out.println("a is greatest");
		}
		 System.out.println(obj.methd());
	}
  
	
}
 class secondclass
 {
	 //public static void main(String args[])
	 int methd()
	 {
			int i;
		 for (i=10;i>=1;i--)
		 {
			 System.out.print(i);
		 }
		 return 0;
		}
	 
 }
