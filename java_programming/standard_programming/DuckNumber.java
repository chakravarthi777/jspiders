import java.util.Scanner;
class DuckNumber 
{
	//duck method
	public static boolean isDuck(int n)
	{
		while(n>0)
		{
			int d=n%10;
			if(d==0)
				return true;
			n/=10;
		}
		return false;
	}

	//main method
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(isDuck(n))
			System.out.println(n+" is a DuckNumber");
		else
			System.out.println(n+" is not a DuckNumber");
	}
}
