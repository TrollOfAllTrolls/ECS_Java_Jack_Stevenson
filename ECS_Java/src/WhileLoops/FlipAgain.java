package WhileLoops;

import java.util.Random;
import java.util.Scanner;

public class FlipAgain {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		Random rng = new Random();

		String again;

		do {
			int flip = rng.nextInt(2);
			String coin;

			if (flip == 1)
				coin = "Heads";
			else
				coin = "Tails";

			System.out.println("You flip a coin and it is... " + coin);

			System.out.print("Would you like to flip again (y/n)? ");
			again = keys.next();
		} while (again.equals("y"));
		keys.close();
	}
}