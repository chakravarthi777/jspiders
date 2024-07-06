class Book 
{
	public static void holdInfromation()
	{
		System.out.println("Hold information");
		//calling open book directly
		openBook();
	}
	public static void openBook()
	{
		System.out.println("Open Book");
	}
}
class Author
{
	public void imagineStory()
	{
		System.out.println("Imagine Story");
	}
	public void write()
	{
		System.out.println("Write Story..");
		//calling imagineStory()-nsm directly
		imagineStory();
	}
}
class MainClass1
{
	public static void sell()
	{
		System.out.println("sell method.");
		//calling Book class static method holdInformation
		Book.holdInfromation();
		//calling non static method of Author class by using orv
		Author obj=new Author();
		obj.write();
	}
	public static void main(String[] args) 
	{
		System.out.println("main method starts..");
		//calling sell method-sm directly
		sell();
		System.out.println("main method ends..");

	}
}