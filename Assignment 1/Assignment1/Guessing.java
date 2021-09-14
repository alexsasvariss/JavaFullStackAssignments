import java.util.Random;
import java.util.Scanner;
/**
 * @author aesas
 *
 */
public class Guessing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int val = rand.nextInt(100)+1;
		int upper = val + 10;
		int lower = val - 10;
		int guess;
		
		for (int i = 0; i < 5; i++)
		{
			System.out.print("Input a guess (1-100): ");
			guess = sc.nextInt();
			
			if (guess == val)
			{
				System.out.println("Congratulations! You've guessed the number! (" + val + ")");
				System.exit(0);
			}
			else if (guess > lower && guess < upper)
			{
				System.out.println("Close enough... the number was " + val);
				System.exit(0);
			}
			else
			{
				if (guess > val)
				{
					System.out.println("Lower.");
				}
				else
				{
					System.out.println("Higher.");
				}
			}
		}
		System.out.println("Sorry... The number was " + val + ".");
		System.exit(0);
	}

}
