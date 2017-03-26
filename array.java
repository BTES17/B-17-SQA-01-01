package abc;
import java.util.scanner; 

public class array {
	static scanner scan = new scanner (System.in);
	static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a1[]= new int[10];
for(i=0;i<10;i++){
	a1[i]= scan.nextInt();
	
}
	for (i=0;i<10;i++){
		System.out.println(a1[i]);
	}
	}}
