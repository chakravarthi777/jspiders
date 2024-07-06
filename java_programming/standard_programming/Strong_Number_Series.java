import java.util.Scanner;
class Strong_Number_Series 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		for(int n=start;n<=end;n++)
		{
			int t=n;
			int sum=0;
			while(t>0)
			{
				int d=t%10;
				int f=1;
				for(int i=d;i>=1;i--)
				{
					f=f*i;
				}
				sum+=f;
				t/=10;
			}
			if(sum==n)
				System.out.print(n+",");
		}
		System.out.println();
	}
}
