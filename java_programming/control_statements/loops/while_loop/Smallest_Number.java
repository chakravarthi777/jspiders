import java.util.Scanner;
class Smallest_Number
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sd=n%10;
		while(n!=0)
		{
			int digit=n%10;
			if(digit<sd)
				sd=digit;
			n/=10;
		}
		System.out.println(sd);
	}
}
