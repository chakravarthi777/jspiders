class SecondHalfOfADigit//reverse secondhalf
{
	public static void main(String[] args) 
	{
		int original=123456;
		int n=original;
		int count=0;
		int rev=0;
		while(n!=0)
		{
			count++;
			int digit=n%10;
			rev=rev*10+digit;
			n/=10;
		}

		int expo=1;
		for(int i=1;i<=(count/2);i++)
		{
			expo=expo*10;
		}
		int sh=rev%expo;
		System.out.println(sh);
	}
}
