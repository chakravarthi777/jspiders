class ExponentialOfFirstAndLast
{
	public static void main(String[] args) 
	{
		int original=2345;
		int n=original;
		int fd=0;
		int ld=n%10;
		while(n!=0)
		{
			fd=n%10;
			n=n/10;
		}
		int expo=1;
		for(int i=1;i<=ld;i++)
		{
			expo=expo*fd;
		}
		System.out.println(expo);
	}
}
