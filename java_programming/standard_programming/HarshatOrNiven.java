// Harshat or Niven number : if sum of digits in a given number is divisible by given number then it is called as Harshat or Niven number.
// Ex : 21 is harshat or niven number ---- 2+1=3 and 21 is divisible by 3 (21/3=7).
// Ex :21,27,81,50 are some examples for harshat or niven number.
import java.util.Scanner;
class HarshatOrNiven
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int c=i;
		int sum=0;
		while(i>0)
		{
			int digit=i%10;
			sum+=digit;
			i/=10;
		}
		if(c%sum==0)
			System.out.println(c+" is a Harshat/Niven number");
		else
			System.out.println(c+" is Not a Harshat/Niven number");
	}
}
