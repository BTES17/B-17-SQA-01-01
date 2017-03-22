
public class sumnos 
{

	public static void main(String[] args) 
	{
		int a=987564;
		int sum=0;
		while(sum ==0 || sum >= 9)
		{
		sum=0;
		while(a!=0)
		{
			int b= a/10;
			int c= a%10;
			sum = sum+c;
			a=b;
		}
		a=sum;
		//System.out.println(sum); (To display sum of each step)
		}
		System.out.println(sum);
	} 
	

}
