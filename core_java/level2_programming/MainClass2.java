class Volleyball
{
	public static void pass()
	{
		System.out.println("pass the ball");
	}
}
class Match
{
	public static void play()
	{
		System.out.println("play the match");	
	}
}
class Stadium
{
	public static void fans()
	{
		Volleyball.pass();
		Match.play();
	}
}
class MainClass2 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts..");
		Stadium.fans();
		System.out.println("main ends");
	}
}
