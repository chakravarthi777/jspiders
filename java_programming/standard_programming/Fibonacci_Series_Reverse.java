import java.util.Scanner;
class Fibonacci_Series_Reverse 
{
		public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=1;
		int c=0;
		int end=sc.nextInt();
		for(int i=end;a>=0;i--)
		{	
			System.out.print(b+", ");
			c=b;
			b=a;
			a=c-b;
		}
		System.out.println();
	}
}
