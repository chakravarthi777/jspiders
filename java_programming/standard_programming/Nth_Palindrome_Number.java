import java.util.Scanner;
class Nth_Palindrome_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int nth=sc.nextInt();
		int pos=0;
		int n=1;
		while(n>0)
		{
			int t=n;
			int rev=0;
			while(t>0)
			{
				int d=t%10;
				rev=rev*10+d;
				t/=10;
			}
			if(rev==n)
				pos++;
			if(pos==nth)
				break;
			n++;
		}
		System.out.println("nth value of :"+n);
	}
}
