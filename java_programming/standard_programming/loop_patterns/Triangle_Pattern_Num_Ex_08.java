/*										1
									   2 3
									  4 5 6
									 7 8 9 1
									2 3 4 5 6
									
*/
import java.util.Scanner;
class Triangle_Pattern_Num_Ex_08  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=1;
		int space=n-1;
		int a=1;
		for(int r=1;r<=n;r++)
		{
			for(int i=1;i<=space;i++)
				System.out.print(" ");
			for(int j=1;j<=star;j++)
			{
				System.out.print((a++)+" ");
				if(a>9)
				{
					a=1;
				}
			}
			System.out.println();
			star++;
			space--;
		}
	}
}
