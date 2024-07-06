class Swapping_Two_Numbers
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		System.out.println("------------------beforeswapping-----------------");
		System.out.println("a is :"+a);
		System.out.println("b is :"+b);
		System.out.println("------------------Afterswapping without using third variable-----------------");
		System.out.println("a is :"+((a+b)-a));
		System.out.println("a is :"+((a+b)-b));
		int c=a;
		a=b;
		b=c;
		System.out.println("------------------Afterswapping by using third variable-----------------");
		System.out.println("a is :"+a);
		System.out.println("b is :"+b);
	}
}
