package vinay;

public class forlooppatteren {

	public static void main(String[] args)
	{
		//forloop();
		//forloop1();
	      whileloop();
	}
		static void forloop()
		{
		int i,j;
		for(i=1; i<=5;i++)
		{
			for(j=1;j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}
		static void forloop1()
		{
		int i,j;
		for(i=5;i>=1;i--)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
			}
		}
		static void whileloop()
		{
			int num=942341;
			 int rem;
		int temp,sum=0;
		while(sum==0 || sum>=10)
				{
			while(num>0)
			{
				rem=num%10;
				num=num/10;
				sum=sum+rem;
			}
			System.out.print(sum);
			}
			}

}