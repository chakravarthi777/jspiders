class Sum_Of_Even_Digits
{
	public static void main(String[] args) 
	{
		int a=12345;
		int sum=0;
		while (a!=0)
		{
			int digit=a%10;
			if(digit%2==0)
			{
				sum+=digit;
			}
			a=a/10;
		}
		System.out.println(sum);
	}
}
