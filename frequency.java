
public class frequency {
	public static void main (int num)
	{
	int m = num;
	System.out.println("Number entered is ");
	int dig;
	int p;
	for(int i = 0;i<=9;i++)
	{
	m = num;
	int c=0;
	while(m>0)
	{
	dig=m%10;
	if(dig==i)
	{
	c++;
	p=dig;
	}
	m/=10;
	}
	if(c>=1)
	System.out.println("Frequency of "+i+" is "+c);
	}
	}
	}


