class Sum_Of_Digits
{
	public static void main(String[] args) 
	{
		int n=12345;
		int sum=0;
		while(n>0)
		{
			int a=n%10;
			n=n/10;
			sum+=a;
		}
		System.out.println(sum);
	}
}
