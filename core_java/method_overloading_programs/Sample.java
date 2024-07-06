class Sample
{
	public static void test(int i, int j)
	{
		System.out.println("test method with int ,int arg");
	}
	public static void test(String i)
	{
		System.out.println("test method with String arg");
	}
	public static void test(double i,int j)
	{
		System.out.println("test method with double ,int arg");
	}
	public static void test(char c,boolean b, char a)
	{
		System.out.println("test method with char boolean and char arg");
	}
	public static void main(String[] args) 
	{
		test("chakri");
		test(10,20);
		test('#',true,'@');
		test(4.5,10);
	}
}
