class Subjects
{
	public static double marks(int sm,int tm)
	{
		double res= sm/tm;
		return res*100;
	}
	public static void main(String[] args) 
	{
		System.out.println("percentage :"+ marks(500,700));
	}
}

