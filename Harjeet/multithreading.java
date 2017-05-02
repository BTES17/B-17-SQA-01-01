
public class multithreading extends Thread{

	public static void main(String[] args) {
		multithreading obj1=new multithreading ();
		multithreading obj2=new multithreading ();
		multithreading obj3=new	multithreading ();
	     //obj1.add();
		//obj2.add();
		//obj3.add();
	obj1.start();
	obj2.start();
    obj3.start();
   
	}
    /*   void add()
	{
	for(int i=1;i<=10;i++)
	{
		System.out.println(i);
	}
	try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}*/
   public  void run()
       {
    	   
    	   for(int i=1;i<=10;i++)
    	   {
    			System.out.println(i);
    		try {
    			Thread.sleep(200);
    		} catch (InterruptedException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    	   }
       }
}
