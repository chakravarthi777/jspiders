class Product_Of_Odd_Digits
{
	public static void main(String[] args) 
	{
		int a=12345;
		int product=1;
		while (a!=0)
		{
			int digit=a%10;
			if(digit%2!=0)
			{
				product*=digit;
			}
			a=a/10;
		}
		System.out.println(product);
	}
}
