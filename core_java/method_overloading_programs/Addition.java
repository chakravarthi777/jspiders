class Addition 
{
	public static void sum(int i,int j)
	{
		System.out.println("sum : "+(i+j));
	}
	public static void sum(double i,double j)
	{
		System.out.println("sum : "+(i+j));
	}
	public static void sum(int i,double j)
	{
		System.out.println("sum : "+(i+j));
	}
	public static void main(String[] args) 
	{
		sum(10,20);
		sum(5.5,4.5);
	}
}
