class StrongNumberByMethod 
{
	public static int method1(int x)
	{
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
		return sum;
	}
	public static void main(String[] args) 
	{
		int x=145;
		if(method1(x)==x)
			System.out.println("Strong Number");
		else
			System.out.println("Not Strong Number");
	}
}
