//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Divisors
{
	public static String getDivisors( int number )
	{
        int count = number;

        System.out.print("The divisors of " + number + " are: ");

        do{
            if(number/count != number && number%count == 0)
            {
                System.out.print((number/count)+" ");
            }
            count--;

        }while(count < number && count > 0);

		System.out.print("");
		return ""; 
	}
}
