class StrongNumberBySir 
{
	public static void main(String[] args) 
	{
		int n=145;
		int x=n;
		int sum=0;
		while(x>0)
		{
			int d=x%10;
			int factorial=1;
			for(int i=1;i<=d;i++)
			{
				factorial=factorial*i;
			}
			sum=sum+factorial;
			x/=10;
		}
		if(sum==n)
			System.out.println(" Strong number ");
		else
			System.out.println(" not Strong number");
	}
}
