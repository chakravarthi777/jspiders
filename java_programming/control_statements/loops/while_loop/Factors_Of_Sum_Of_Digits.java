class Factors_Of_Sum_Of_Digits
{
	public static void main(String[] args) 
	{
		int a=12345;
		int sum=0;
		while(a!=0)
		{
			int digit=a%10;
			sum+=digit;
			a=a/10;
		}
		int i=1;
		while(i<=sum)
		{
			if(sum%i==0)
				System.out.println(i);
			i++;
		}
		System.out.println("sum of digits : "+sum);
	}
}
