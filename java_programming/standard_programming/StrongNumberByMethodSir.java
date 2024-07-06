class StrongNumberByMethodSir 
{

	public static int factorial(int d)
	{
		int f=1;
		for(int i=1;i<=d;i++)
		{
			f*=i;
		}
		return f;

	}
	public static int sum_Of_Digit(int n)
	{
		int sum=0;
		while(n>0)
		{
			int d=n%10;
			sum=sum+factorial(d);
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		int n=145;
		if(sum_Of_Digit(n)==n)
			System.out.println("Strong Number.");
		else
			System.out.println("not Strong Number.");
	}
}
