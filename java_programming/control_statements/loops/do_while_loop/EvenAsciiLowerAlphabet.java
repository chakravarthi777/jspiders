class EvenAsciiLowerAlphabet
{
	public static void main(String[] args) 
	{
		char c='a';
		do
		{
			if(c%2==0)
			{
				System.out.println(c);
			}
			c++;
		}
		while (c<='z');
	}
}
