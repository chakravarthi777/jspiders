class MainClass3 
{
	public static void main(String[] args) 
	{
		System.out.println("main method");
		Book.holdStory();
		Book obj=new Book();
		obj.navigatePage();
	}
}
class Author
{
	public static void writeStory()
	{
		System.out.println("write Story");
	}
	public void reviewStory()
	{
		System.out.println("reviewStory");
	}
}
class Book
{
	public static void holdStory()
	{
		System.out.println("holdstory");
		Author.writeStory();
	}
	public void navigatePage()
	{
		System.out.println("navigatePage");
		Author obj=new Author();
		obj.reviewStory();
	}
}
