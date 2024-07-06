import java.util.Scanner;
class Nth_Prime_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=2;
		int pos=0;
		int nth=sc.nextInt();
		while(n>0)
		{
			int count=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				pos++;
			}
			if(pos==nth)
				break;
			n++;
		}
		System.out.println(n);
	}
}
