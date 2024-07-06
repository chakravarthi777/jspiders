//	A number in which the sum of squares of digit is recursively 1.
import java.util.Scanner;
class Happy_Number_Using_Methods 
{
	public static int sum(int n)
	{
		int s=0;
		while(n>0)
		{
			int d=n%10;
			int sq=d*d;
			s+=sq;
			n/=10;
		}
		return s;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while (n>9)
		{
			n=sum(n);
		}	
		if(n==1)
			System.out.println("Happy Number");
		else
			System.out.println("Not a Happy Number");
	}
}
