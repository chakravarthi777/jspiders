import java.util.Scanner; // program to find the given number is prime or not.
class Prime2 
{
	public static boolean prime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(prime(n)==true)
			System.out.println(n+ " is a primeNumber");
		else
			System.out.println(n+ " is a primeNumber");
	}
}
