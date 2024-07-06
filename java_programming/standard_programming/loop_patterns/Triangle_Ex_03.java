import java.util.Scanner;
class Triangle_Ex_03 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=1;
		int space=n/2;
		for(int r=1;r<=n;r++)
		{
			for(int s=1;s<=star;s++)
				System.out.print(" * ");
			for(int st=1;st<=space;st++)
				System.out.print("   ");
			System.out.println();
			star++;
			space--;
		}
		int star1=n-1;
		int space1=1;
		for(int r=1;r<=n;r++)
		{
			for(int s=1;s<=star1;s++)
				System.out.print(" * ");
			for(int st=1;st<=space1;st++)
				System.out.print("   ");
			System.out.println();
			star1--;
			space1++;
		}
	}
}
