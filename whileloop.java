
public class whileloop 
{
	public static void main(String[] args)
	{
		int i,j;
		int num=1239986325;
		int sum=0;
		while(num>9)
		{
			sum=0;
			while(num>0)
			{
			
				i=num/10;
				j=num%10;
				sum=sum+j;
				num=i;
			}
			num=sum;
		}
		System.out.println(sum);
			
		}
	}
    	


