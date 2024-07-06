class Product_Sum 
{
	public static void main(String[] args) 
	{
		int a=12345;
		int product=1;
		int sum=0;
		while (a!=0)
		{
			int digit=a%10;
			a=a/10;
			product*=digit;
			sum+=digit;
		}
		System.out.println(product);
		System.out.println(sum);
	}
}
