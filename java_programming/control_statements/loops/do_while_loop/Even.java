class Even
{
	public static void main(String[] args) 
	{
		int i=2;
		do
		{
			System.out.println(i);
			i+=2;
		}
		while (i<=10);
		evenNumbers();
	}
	public static void evenNumbers()
	{
		int i=1;
		do
		{
			if(i%2==0)
				System.out.print(i);
			i++;
		}
		while (i<=10);
	}
}
