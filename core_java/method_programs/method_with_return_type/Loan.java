class Loan 
{
	public static double find_Interest(double p,double t,double r)
	{
		return (p*t*r)/100;
	}
	public static void main(String[] args) 
	{
		double interest=find_Interest(10000,6.5,3);
		System.out.println(interest);

	}
}
