import java.util.Scanner;
class PalindromeSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter start range :");
		int start=sc.nextInt();
		System.out.print("Enter end range :");
		int end=sc.nextInt();
		for(int n=start;n<=end;n++)
		{
			int t=n;
			int rev=0;
			while(t>0)
			{	int d=t%10;
				rev=rev*10+d;
				t/=10;
			}
			if(rev==n)
				System.out.print(rev+",");
		}
		System.out.println();
	}
}
