//if sum of digits in a given number is equal to product of digits a given number is known as SPY_NUMBER.
//PROGRAM FOR SPY_NUMBER 
// Examples for spy number is : 22,123,321 etc...
import java.util.Scanner;
class Spy_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number to find spy_number : ");
		int n=sc.nextInt();
		int c=n;
		int sum=0;
		int product=1;
		while(n>0)
		{
			int digit=n%10;
			sum+=digit;
			product*=digit;
			n/=10;
		}
		if(sum==product)
			System.out.println(c+" is a Spy_Number");
		else
			System.out.println(c+" is Not a Spy_number");
	}
}
