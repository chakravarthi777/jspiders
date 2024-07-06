import java.util.Scanner;
class PyramidPattern 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=n-1;
		int star=1;
		for(int r=1;r<=n;r++)
		{
			for(int c=1;c<=space;c++)
				System.out.print("   ");
			for(int j=1;j<=star;j++)
				System.out.print(" * ");
			System.out.println();
			space-=1;
			star+=2;
		}
	}
}
