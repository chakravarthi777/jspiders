import java.util.Scanner;
class Perfect_Square_Series 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		
		for(int n=start;n<=end;n++)
		{
			for(int i=1;i<=n;i++) 
			{
				if((i*i)==n) //1 4 9 16 25 36......
					System.out.print(n+",");
			}
		}
		System.out.println();
	}
}
