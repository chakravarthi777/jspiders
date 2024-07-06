class Student_Rank

{
	public static void main(String[] args) 
	{
		int marks=95;
		if(marks>=95 && marks<=100)
			System.out.println("1st rank");
		else if(marks>=90 && marks<=94)
			System.out.println("2nd rank");
		else if(marks>=70 && marks<=89)
			System.out.println("Distinction");
		else if(marks>=60 && marks<=69)
			System.out.println("1st class with distinction");
		else if(marks>=50 && marks<=59)
			System.out.println("1st class");
		else if(marks>=40 && marks<=49)
			System.out.println("2nd class");
		else if(marks>=35 && marks<=39)
			System.out.println("pass");
		else if(marks<35)
			System.out.println("Fail");
	}
}
