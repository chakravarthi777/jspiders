class Mobile //instance method accessing instance method directly.
{
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Mobile obj=new Mobile();
		obj.games();
		System.out.println("main starts...");
	}
	public void games()//instance method
	{
		System.out.println("game starts...");
		charge();
		System.out.println("game ends...");
	}
	public void charge() //instance method.
	{
		System.out.println("charge starts...");
		System.out.println("charge ends...");
	}
}
