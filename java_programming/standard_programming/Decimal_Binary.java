import java.util.Scanner;
class Decimal_Binary
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int bin=0;
		while(n>0)
		{
			int rem=n%2;
			bin=bin*10+rem;
			n=n/2;
		}
		int revbin=0;
		while(bin>0)
		{
			int d=bin%10;
			revbin=revbin*10+d;
			bin/=10;
		}
		System.out.println(revbin);
	}
}
