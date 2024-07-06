class First_Quadrant_Space_Star 
{
	public static void main(String[] args) 
	{
		int n=5;
		int star=1;
		int space=n-1;
		for(int r=1;r<=n;r++)
		{
			for(int i=1;i<=star;i++)
				System.out.print("*");
			for(int j=1;j<=space;j++)
				System.out.print(" ");
			System.out.println();
			star++;
			space--;
		}
	}
}
