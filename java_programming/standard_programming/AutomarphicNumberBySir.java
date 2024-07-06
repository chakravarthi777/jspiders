import java.util.Scanner;
class AutomarphicNumberBySir
{
	public static int count(int n)
	{
		int c=0;
		while(n>0)		// 1.n value =25 | 2.n value =2
		{
			c++;		// 1.count value =1 | 2.count value =2
			n/=10;
		}
		return c;		// return 2;
	}
	public static int expo(int n) // 1.n value =25 | 
	{
		int e=1;
		for(int i=1;i<=count(n);i++) // 1.n value =25 | 2.count(n) return value 2 and loop iterates 2 times;
		{
			e=e*10;					 // 1.e value 1*10 =10; | 2. e value 10*10=100
		}
		return e;					// 1.e returns value 100;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //ex : 25,76,5,60
		if((n*n)%expo(n)==n) // n*n =
			System.out.println("automarphic number");
		else
			System.out.println("not a automarphic number");
	}
}
