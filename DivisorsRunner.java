import java.util.Scanner;

public class DivisorsRunner
{
	public static void main( String args[] )
	{
        
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your number: ");

        Divisors n = new Divisors();
        int number = kb.nextInt();
        Divisors.getDivisors(number);

	}
}
