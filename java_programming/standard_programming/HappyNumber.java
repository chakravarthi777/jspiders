class HappyNumber 
{
	public static void main(String[] args) 
	{
		int n=86;
		while(n>9)
		{
			int sum=0;
			while(n>0)
			{
				int d=n%10;
				int square=d*d;
				sum+=square;
				n/=10;
			}
			n=sum;
		}
		if(n==1)
			System.out.println("Happy number");
		else
			System.out.println("not Happy number");
	}
}
