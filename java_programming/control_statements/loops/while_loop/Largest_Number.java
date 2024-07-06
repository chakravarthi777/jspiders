import java.util.Scanner;
class Largest_Number
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ln=n%10;
		n/=10;
		while(n!=0)
		{
			int digit=n%10;
			if(digit>ln)
				ln=digit;
			n/=10;
		}
		System.out.println(ln);
	}
}
