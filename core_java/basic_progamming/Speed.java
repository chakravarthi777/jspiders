class Speed 
{
	public static int findspeed(int distance , int time)
	{
		int speed=distance/time;
		return speed;
	}
	public static void main(String[] args) 
	{
		System.out.println("speed :"+findspeed(600,5)+"kmph");
	}
}
