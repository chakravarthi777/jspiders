/*
		* * * * * * *
		  * * * * *
		    * * * 
			  *
*/
import java.util.Scanner;
class  Triangle_Ex_02
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=2*n-1;
		int space=0;
		for(int r=1;r<=n;r++)
		{
			for(int s=1;s<=space;s++)
				System.out.print("   ");
			for(int st=1;st<=star;st++)
				System.out.print(" * ");
			System.out.println();
			star-=2;
			space++;
		}
	}
}
