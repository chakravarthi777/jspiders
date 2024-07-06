class Greeting_Message 
{
	public static void main(String[] args) 
	{
		double time=12;
		if(time<12)
			System.out.println("Good morning!");
		else if(time>=12 && time<17)
			System.out.println("Good AfterNoon!");
		else if(time>=17 && time<21)
			System.out.println("Good Evening!");
		else
			System.out.println("Good Night!");
	}
}
