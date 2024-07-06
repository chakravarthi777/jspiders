/*
													*
												*	*
											*	*	*
												*	*
													*
*/
import java.util.Scanner;
class Triangle_Ex_04 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=1;
		int space=n/2;
		for(int r=1;r<=n;r++)
		{
			for(int j=1;j<=space;j++)
				System.out.print("   ");
			for(int i=1;i<=star;i++)
				System.out.print(" * ");
			System.out.println();
			if(r<(n+1)/2)
			{
				star++;
				space--;
			}
			else
			{
				star--;
				space++;
			}
		}
	}
}
