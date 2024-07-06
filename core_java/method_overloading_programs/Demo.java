class Demo //non-static method or instance method
{
	public void display(char c)
	{
		System.out.println("display method with char arg ");
	}
	public void display(boolean b, boolean a)
	{
		System.out.println("display method with boolean , boolean arg ");
	}
	public void display(double j)
	{
		System.out.println("display method with double arg ");
	}
	public static void main(String[] args) 
	{
		Demo d1=new Demo();
		d1.display('a');
		d1.display(10.7);
		d1.display(true,false);

	}
}
