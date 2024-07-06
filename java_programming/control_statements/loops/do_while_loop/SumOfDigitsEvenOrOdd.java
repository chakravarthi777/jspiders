import java.util.Scanner;
class SumOfDigitsEvenOrOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int original=sc.nextInt();
		int n=original;
		int sum=0;
		do
		{
			int digit=n%10;
			sum+=digit;
			n/=10;
		}
		while (n>0);
		if(sum%2==0)
		{
			System.out.println("Digits sum of "+original+" is "+sum+" and it is EVEN.");
		}
		else
			System.out.println("Digits sum of "+original+" is "+sum+" and it is ODD.");
	}
}
