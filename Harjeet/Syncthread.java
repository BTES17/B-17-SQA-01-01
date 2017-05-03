
public class Syncthread extends Thread{
	
		static	Syncthread obj;
			public static void main(String[] args) {
		obj=new Syncthread();
		Syncthread obj1 =new Syncthread();
		Syncthread obj2=new Syncthread();
		Syncthread obj3=new Syncthread ();
		//obj1.setPriority(2);
		//obj2.setPriority(10);
		//obj3.setPriority(8);
		obj1.setDaemon(true);
		obj1.start();
		obj2.start();
		obj3.start();

			
			}
		 synchronized void add()
		{
			for (int i=1;i<=10;i++)
			{
			//System.out.println(Thread.currentThread().getName());
			System.out.println(i);
			System.out.println("hello");
			}
			}
		public void run(){
		
		obj.add();
		for (int i=1;i<=10;i++)
		{
	//	System.out.println(i);
		//System.out.println(i+Thread.currentThread().getName());

		}

		}}
