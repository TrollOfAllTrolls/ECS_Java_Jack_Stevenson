package WhileLoops;

import java.util.Random;
import java.util.Scanner;

public class HiLowLimited {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		Random num = new Random();
		int randomNum = num.nextInt(100) + 1;
		int guessedNum;
		int attempts = 0;
		System.out.println("I'm thinking of a number between 1 and 100. Try to guess it.");
		do {
			System.out.print("Guess #" + (attempts+1) + " > ");
			guessedNum = keys.nextInt();
			System.out.println();
			if (randomNum > guessedNum) {
				System.out.println("You guessed too low!");
			} else if (randomNum < guessedNum) {
				System.out.println("You guessed too high!");
			}
			attempts++;
		} while (attempts < 7 && guessedNum != randomNum);
		keys.close();
		if(guessedNum == randomNum)
			System.out.println("You guessed the number! It was " + randomNum + ".");
		else
			System.out.println("The number was " + randomNum + ". You did not guess it in 7 tries.");
	}
}
