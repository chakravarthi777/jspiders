import java.util.Scanner;
class Twiste_Prime_Number_By_Sir 
{
	public static boolean isPrime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static int reverse(int n)
	{
		int rev=0;
		while(n>0)
		{
			int d=n%10;
			rev=rev*10+d;
			n/=10;
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int rev=reverse(n);
		if(isPrime(n) && isPrime(rev))
			System.out.println(n+" is a twisted prime number");
		else
			System.out.println(n+" is not a twisted prime number");
	}
}
