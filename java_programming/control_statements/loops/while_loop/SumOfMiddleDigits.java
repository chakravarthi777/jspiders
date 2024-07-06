class SumOfMiddleDigits
{
	public static void main(String[] args) 
	{
		int original=123456;
		int n=original;
		int fd=0;
		int sum=0;
		while(n>0)
		{
			fd=n%10;
			sum+=fd;
			n/=10;
		}
		int ld=original%10;
		int sub=ld+fd;
		int smd=sum-sub;
		System.out.println(smd);
	}
}
