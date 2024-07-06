import java.util.Scanner;
class SunnyNumber
{
	public static boolean isSunny(int j)
	{
		int n=j+1;
		for (int i=1;i<=n;i++ )
		{
			if(i*i==n)
			{
				return true;
			}
		}
	return false;	
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(isSunny(n))
			System.out.println(n+" is a SunnyNumber");
		else
			System.out.println(n+" is not a SunnyNumber");
	}
}
