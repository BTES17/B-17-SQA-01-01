import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
		
		try {
			abc(0,0);
			
			
		}
		catch(Exception e){
			System.out.println("value of b is not valid");
			
			
		}
		
		
		
		
	}
	static public int abc(int a,int b)throws Exception {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a");
		a = scan.nextInt();
		System.out.println("enter b");
		 b = scan.nextInt();
		int c=a/b;
		System.out.println(c);
		return 0;
		
		
	}
}
