class MultiplesOf5 
{
	public static void main(String[] args) 
	{
		int i=1;
		int count=1;
	do
	{
		if(i%5==0)
		{
			System.out.println("5 x "+count+" = "+i);
			count++;
		}
		i++;
	}
	while (i<=100);
	}
}
