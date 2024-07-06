class Fourth_Quadrant_Star_Space 
{
	public static void main(String[] args) 
	{
		int n=5;
		int star=n;
		int space=1;
		for(int r=1;r<=n;r++)
		{
			for(int i=1;i<=star;i++)
				System.out.print("*");
			for(int j=1;j<=space;j++)
				System.out.print(" ");
			System.out.println();
			star--;
			space++;
		}
	}
}
