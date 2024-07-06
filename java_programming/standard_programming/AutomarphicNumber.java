class AutomarphicNumber 
{
	public static int square(int n)
	{
		int s=n*n;
		int res1=automarphic(s);
		return res1;
	}
	public static int automarphic(int n)
	{
		int res=n%10;
		return res;
	}
	public static void main(String[] args) 
	{
		int n=6;
		if(square(n)==n)
			System.out.println("Automarphic");
		else
			System.out.println("Not Automarphic");
	}
}
