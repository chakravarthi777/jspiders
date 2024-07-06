import java.util.Scanner;
class Neon 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int sqr=n*n;
		int sum=0;
		while(sqr>0)
		{
			int digit=sqr%10;
			sum+=digit;
			sqr/=10;
		}
		if(n==sum)
			System.out.println(n+" is a Neon number");
		else
			System.out.println(n+" is not a Neon number");
	}
}
