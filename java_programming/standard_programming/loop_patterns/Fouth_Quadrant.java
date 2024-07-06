import java.util.Scanner;
class Fouth_Quadrant
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter rows and columns :");
		int n=sc.nextInt();
		for(int r=1;r<=n;r++)
		{
			for(int c=1;c<=n;c++)
			{
				if(c<=r)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
