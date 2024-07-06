class Thrid_Quadrant_Star_Space 
{
	public static void main(String[] args) 
	{
		int n=5;
		int space=0;
		int star=n;
		for(int r=1;r<=n;r++)
		{
			for(int i=1;i<=space;i++)
				System.out.print(" ");
			for(int j=1;j<=star;j++)
				System.out.print("*");
			System.out.println();
			star--;
			space++;
		}
	}
}
