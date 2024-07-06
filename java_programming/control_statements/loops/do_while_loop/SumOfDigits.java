import java.util.Scanner; // example for do while loop
class SumOfDigits
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int result=sumOfDigits(num);	
		System.out.println(result);
	}
	//returns sum of digits
	public static int sumOfDigits(int i)
	{
		int sum=0;
		do
		{
			int digit=i%10;
			sum+=digit;
			i/=10;
		}
		while (i>0);
		return sum;
	}
}
