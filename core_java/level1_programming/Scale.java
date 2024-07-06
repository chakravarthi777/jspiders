class Scale //static method calling non-static method.
{
	public static void main(String[] args) 
	{
		measure();
	}
	public static void measure()
	{
		System.out.println("measure method");
		Scale obj=new Scale();
		obj.draw();
	}
	public void draw()
	{
		System.out.println("draw method");
	}
}
