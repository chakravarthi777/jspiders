class DisariumNumber 
{
	public static int count(int n)
	{
		int c=0;
		while(n>0)
		{
			c++;
			n/=10;
		}
		return c;
	}
	public static int expo(int d, int n)
	{
		int e=1;
		for(int i=1;i<=count(n);i++)
		{
			e=e*d;
		}
		return e;
	}
	public static int sum(int n)
	{
		int s=0;
		while(n>0)
		{
			int d=n%10;
			s=s+expo(d,n);
			n/=10;
		}
		return s;
	}
	public static void main(String[] args) 
	{
		int n=175;
		if(sum(n)==n)
			System.out.println("DisariumNumber");
		else
			System.out.println("NOt DisariumNumber");
	}
}
