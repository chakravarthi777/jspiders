// write a program to find given number is prime number  ex :2,3,5,7,11,13,19,23,29
import java.util.Scanner;
class PrimeNumer
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number to find prime or not :");
		int n=sc.nextInt(); 
		if(prime(2)==2)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");
		
	}
	public static int prime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		return count;
	}
}
