/*
		* * * * * * *
		  * * * * *
		    * * *
			  *
			* * *
		  * * * * *
		* * * * * * *
*/
import java.util.Scanner;
class Triangle_Pattern_Ex_06  //SandTimer
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=n;
		int space=0;
		for(int r=1;r<=n;r++)
		{
			for(int i=1;i<=space;i++)
				System.out.print("   ");
			for(int j=1;j<=star;j++)
				System.out.print(" * ");
			System.out.println();

			if(r<(n+1)/2)
			{
				space++;
				star-=2;
			}
			else
			{
				star+=2;
				space--;
			}
		}
	}
}
