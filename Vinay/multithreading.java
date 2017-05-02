package vinay;

public class multithreading extends Thread{

	public static void main(String[] args) {
		multithreading object1=new multithreading();
		multithreading object2=new multithreading();
		multithreading object3=new multithreading();
		//object1.add();
		//object2.add();
		//object3.add();
		object1.start();
		object2.start();
		object3.start();
		
	}

    /*	void add()
    	
    	{
    	for(int i=1;i<=10;i++)
	    System.out.println(i);
    	
    	}
    	public void run()
    	{
    		add();
    	}
    	}
    */
public void run() 
{
	for (int i=1;i<=10;i++)
	{
		System.out.println(i);
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
{
	e.printStackTrace();
	
}
	}
		}
		}
	
    


