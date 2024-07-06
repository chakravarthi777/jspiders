class StorngNumber 
{
	public static void main(String[] args) 
	{
		int n=145;
		int add=1;
		int sum=0; 
		for(int i=1;i<=n;i++)
		{
			int digit=n%10;
			for(int j=1;j<=digit;j++)
			{
				add=add*j;
				System.out.println(add);
			}

			sum+=add;
			add=1;
			System.out.println(sum);
			n/=10;
		}
		System.out.println(sum);
	}
}
