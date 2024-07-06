class Seller 
{
	public static double book(int c,double p)
	{
		double profit=c-p;
		return profit;
	}
	public static void main(String[] args) 
	{
		double aprice=book(150,24.5);
		System.out.println(aprice);
	}
}
