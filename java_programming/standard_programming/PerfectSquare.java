import java.util.Scanner; //ex: 1,4,9,16,25,
class PerfectSquare
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean isPerfectSquare=false;
		for(int i=1;i<=n;i++)
		{
			if(i*i==n) //suppose n=4 [1*1=1(false), 2*2=4(true) -> isPerfectSquare=true -> "perfect Number";]0000000
			{
				isPerfectSquare=true;
				break;
			}
		}
		if(isPerfectSquare)
			System.out.println(n +" is perfect Square Number");
		else
			System.out.println(n +" is not a perfect Square Number");
	}
}
