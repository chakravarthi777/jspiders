import java.util.Scanner;

class TwistedPrimeNumber
{
	public static int isPrime(int n)
	{
		int i;
		for(i=2;i<=n;i++)
		{
			if(n%i==0)
				break;
		}
		return i;
	}

	public static void twistedPrime(int n)
	{
		int pn=isPrime(n);
		int rev=0;
		int twp;
		if(pn==n)
		{
			while(pn>0)
			{
				int d=pn%10;
				rev=rev*10+d;
				pn/=10;
			}
			twp=isPrime(rev);
			if(rev==twp)
				System.out.println(n+" is a twisted prime number");
			else 
				System.out.println(n+" is not a twisted prime number");
		}
		else
			System.out.println(rev+" is not a prime number");
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		twistedPrime(n);
	}
}
