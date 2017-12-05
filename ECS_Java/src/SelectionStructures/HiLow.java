package SelectionStructures;

import java.util.Random;
import java.util.Scanner;

public class HiLow {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		Random num = new Random();
		int randomNum = num.nextInt(100) + 1;
		int guessedNum;
		
		
		System.out.println("I'm thinking of a number between 1 and 100. Try to guess it.");
		System.out.print("> ");
		guessedNum = keys.nextInt();
		System.out.println();
		if(randomNum > guessedNum){
			System.out.println("You guessed too low! The number was " + randomNum);
		}
		else if(randomNum < guessedNum){
			System.out.println("You guessed too high! The number was " + randomNum);
		}
		else{
			System.out.println("You guessed it spot on! The number was " + randomNum);
		}
	}
}
