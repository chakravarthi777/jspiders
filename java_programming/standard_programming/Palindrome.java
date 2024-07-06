import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=n;
		int rev=0;
		while(n>0)
		{
			int digit=n%10;
			rev=rev*10+digit;
			n/=10;
		}
		if(c==rev)
			System.out.println(c+" is a palindrome.");
		else
			System.out.println(c+" is not a palindrome.");
	}
}
