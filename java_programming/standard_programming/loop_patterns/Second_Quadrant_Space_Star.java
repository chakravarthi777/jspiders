class Second_Quadrant_Space_Star 
{
	public static void main(String[] args) 
	{
		int n=5;
		int space=n-1;
		int star=1;
		for(int r=1;r<=n;r++)
		{
			for(int i=1;i<=space;i++)
				System.out.print(" ");
			for(int j=1;j<=star;j++)
				System.out.print("*");
			System.out.println();
			star++;
			space--;
		}
	}
}
