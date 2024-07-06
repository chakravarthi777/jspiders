/*
				*
			*	*	*
		*	*	*	*	*	
	*	*	*	*	*	*	*
		*	*	*	*	*
			*	*	*	
				*
*/
import java.util.Scanner;
class Triangle_Pattern_Ex_05	//Diamond
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=1;
		int space=n/2;
		for(int r=1;r<=n;r++)
		{
			for(int i=1;i<=space;i++)
				System.out.print("   ");
			for(int j=1;j<=star;j++)
				System.out.print(" * ");
			System.out.println();
			if(r<(n+1)/2)
			{
				star+=2;
				space--;
			}
			else
			{
				star-=2;
				space++;
			}

		}

	}
}
