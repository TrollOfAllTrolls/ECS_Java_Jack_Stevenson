package WhileLoops;

import java.util.Scanner;

public class EnterPIN {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;

		System.out.println("Welcome to the Bank.");
		System.out.print("Enter your pin: ");
		int entry = keyboard.nextInt();

		while (entry != pin) {
			System.out.println("\nIncorrect Pin, try again.");
			System.out.print("Enter your pin: ");
			entry = keyboard.nextInt();
		}
		System.out.println("\nPin Accepted.");
	}
}