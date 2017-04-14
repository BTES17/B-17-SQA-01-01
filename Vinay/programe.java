package vinaystatic;

public interface programe {
 abstract void btes();
  static int a=22;
 public static void main(String args[])
 {
	verma object=new verma();
	 object.btes();
	object.bts();

 }}
	 class verma implements programe{
		 static void bts()
		 {
	
	int b=34;
	int c=a+b;
	System.out.println(c);
		 }

public void btes()
{
	System.out.println("Today Raman mam loking Gorgies");
}
}