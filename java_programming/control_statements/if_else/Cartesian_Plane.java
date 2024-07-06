class Cartesian_Plane 
{
	public static void main(String[] args) 
	{
		int x=1;
		int y=-2;
		if(x>=0 && y>=0)
			System.out.println(x+" , "+y+" are 1st Quadrant.");
		else if(x<0 && y>=0)
			System.out.println(x+" , "+y+" are 2nd Quadrant.");
		else if(x<0 && y<0)
			System.out.println(x+" , "+y+" are 3rd Quadrant.");
		else if(x>=0 && y<0)
			System.out.println(x+" , "+y+" are 4th Quadrant.");
		else 
			System.out.println(x+" , "+y+" are origin. ");
	}
}
