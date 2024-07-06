class Pen 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts..");
		write();
		System.out.println("main ends..");
	}
	public static void write()
	{
		System.out.println("write starts...");
		fillInk();
		System.out.println("write ends...");
	}
	public static void fillInk()
	{
		System.out.println("fillInk starts...");
		System.out.println("fillInk ends...");
	}
}
