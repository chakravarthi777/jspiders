class Formula
{
	public static int lhs(int a,int b)
	{
		int c=(a*a)+(b*b);
		return c;
	}
	public static void main(String[] args) 
	{
		int lhsr=lhs(5,4);
		int rhsr=rhs(5,4);
		System.out.println(lhsr+" = "+rhsr);
		
	}
	public static int rhs(int a,int b)
	{
		int r=a+b;
		int r1=(r*r)-(2*a*b);
		return r1;
	}
}
