class DemoClass 
{
	int a=10;
	static int b=3;
	public static void method1()
	{
		System.out.println("method1 static method..");
	}
	public void method2()
	{
		System.out.println("non static method..");
	}
	public static void main(String[] args) 
	{
		//non-static method calling
		DemoClass obj=new DemoClass();
		obj.method2();
		method1();
		//calling instance variable
		System.out.println(obj.a);
		System.out.println(b);
	}
}
