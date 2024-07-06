class FirstHalfOfADigit
{
	public static void main(String[] args) 
	{
		int original=123456;
		int n=original;
		int count=0;
		while(n!=0)
		{
			count++;
			n/=10;
		}

		int expo=1;
		for(int i=1;i<=(count/2);i++)
		{
			expo=expo*10;
		}
		if(count%2==0)
		{
			int sh=original/expo;
			System.out.println(sh);
		}
		else
			System.out.println("lenght of digits should be even");
	}
}
