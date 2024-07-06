import java.util.Scanner;
public class FibonacciSeries_Ex_02
{
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
		int n = sc.nextInt(); 
        int firstTerm = 0, secondTerm = 1;
        
        System.out.print(firstTerm + " " + secondTerm);

        for (int i = 3; i <= n; ++i) 
		{
            int nextTerm = firstTerm + secondTerm;
            System.out.print(" " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}