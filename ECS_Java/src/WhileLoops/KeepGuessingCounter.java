package WhileLoops;

import java.util.Random;
import java.util.Scanner;

public class KeepGuessingCounter {
	public static void main(String[] args) {
		Scanner keys = new Scanner (System.in);
		Random rng = new Random();
		int randNum = rng.nextInt(10) + 1;
		int count = 0;
		
		System.out.print("I have generated a random number. Try to guess it: ");
		
		while(keys.nextInt() != randNum){
			System.out.print("Guess again: ");
			count++;
		}
		
		System.out.println("You have guessed the number.");
		System.out.println("It only took you " + count + " tries.");
	}
}