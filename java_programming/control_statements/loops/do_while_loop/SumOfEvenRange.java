class SumOfEvenRange 
{
	public static void main(String[] args) 
	{
		int range=10;
		int i=1;
		int sum=0;
		do
		{
			if(i%2==0)
			{
				sum+=i;
				System.out.println(i);
			}
			i++;
		}
		while (i<=range);
		System.out.println("sum : "+sum);
	}
}
