// write a program to check whether the given number is perfect number or not ?
// Ex : 6,28
import java.util.Scanner;
class PerfectNumber 0
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++)				
		{
			if(n%i==0)							
			{
				sum+=i;
			}
		}
		if(n==sum)
			System.out.println(n+" is a perfect Number");
		else
			System.out.println(n+" is Not a perfect Number");
	}
}


/*Trace when n=6;
	i=1;
	n%i==0
	6%1==0 true
	sum=0;
	sum+=i;
	sum=0+1;

	i=2;
	6%2==0 true
	sum=1;
	sum+=i;
	sum=1+2;
	sum=3;

	i=3;
	6%3==0 true
	sum=3;
	sum+=i;
	sum=3+3;
	sum=6;

	i=4;
	6%4==0 false
	sum=6;
	
	i=5;
	6%5==0 false
	sum=6;

	sum=6; && n=6;
	s.o.p(" is a perfect Number"); */
	