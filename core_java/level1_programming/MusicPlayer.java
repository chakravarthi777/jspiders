class MusicPlayer //non-static method can call static method directly.
{
	public static void main(String[] args) 
	{
		MusicPlayer obj=new MusicPlayer();
		obj.play();
	}
	public void play()
	{
		System.out.println("play method");
		pause();
	}
	public static void pause()
	{
		System.out.println("pause method");
	}
}
