import java.util.Scanner;
class NthPrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=1;
		int pos=0;
		int nth=sc.nextInt();
		while(n>0)
		{
			n++;
			int i;
			for(i=2;i<=n;i++)
			{
				if(n%i==0)
				{
					break;
				}
			}
			if(n==i)
				pos++;
			if(pos==nth)
				break;
			
		}
	System.out.println("Prime Number of "+nth+" postion is :"+n);
	}
}