class LargestNumberPowerLowestNumber 
{
	public static int largest(int n)
	{
		int l=n%10;
		int s=n%10;
		while(n>0)
		{
			int d=n%10;
			if(l>d)
				l=d;
			if(s < d)
				s=d;
			n=n/10;
		}
		int expo=1;
		for(int i=1;i<=s;i++)
		{
			expo=expo*l;
		}
		System.out.println(l);
	System.out.println(s);
		return expo;

	}

	public static void main(String[] args) 
	{
		int n=2343;
		System.out.println(largest(n));

	}
}
