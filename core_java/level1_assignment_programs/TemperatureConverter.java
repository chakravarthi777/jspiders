class TemperatureConverter 
{
	public static void convertToFarenheit() //static method
	{
		System.out.println("convertToFarenheit");
		//calling non static methods using orv.
		TemperatureConverter obj=new TemperatureConverter();
		obj.setCelsiusTemperature();
		obj.displayResult();
	}
	public void setCelsiusTemperature() //nsm
	{
		System.out.println("setCelsiusTemperature");
	}
	public void displayResult() //nsm
	{
		System.out.println("Result");
	}
	public static void main(String[] args) //main method
	{
		convertToFarenheit();
	}
}
