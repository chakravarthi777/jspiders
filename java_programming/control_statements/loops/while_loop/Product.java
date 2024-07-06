class Product 
{
	public static void main(String[] args) 
	{
		int a=12345;
		int product=1;
		while (a!=0)
		{
			int digit=a%10;
			a=a/10;
			product*=digit;
		}
		System.out.println(product);
	}
}
