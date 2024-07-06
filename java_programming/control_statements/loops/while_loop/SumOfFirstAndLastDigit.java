class SumOfFirstAndLastDigit 
{
	public static void main(String[] args) 
	{
		int original=9345;
		int n=original;
		int fd=0;
		int ld=n%10;
		while(n!=0)
		{
			fd=n%10;
			n=n/10;
		}
		System.out.println(fd +ld);
	}
}
