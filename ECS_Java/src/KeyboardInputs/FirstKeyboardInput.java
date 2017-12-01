package KeyboardInputs;

import java.util.Scanner;

public class FirstKeyboardInput {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);

		String name;
		int age, height, inches;
		double weight;

		System.out.println("What is your name? ");
		name = keys.next();

		System.out.println("How old are you? ");
		age = keys.nextInt();

		System.out.println("How tall are you (In feet)? ");
		height = keys.nextInt();

		System.out.println("How many inches tall are you? ");
		inches = keys.nextInt();

		System.out.println("How much do you weigh? ");
		weight = keys.nextInt();

		System.out.println("So, your name is " + name + ", you're " + age + " years old, you're " + height
				+ " feet tall, or " + inches + " inches tall, and you weigh " + weight + " pounds.");

		keys.close();
		
		//A: The first line of code (After the package declaration) implements the Scanner object for use in the program. It lets us take inputs from the user.
		
		//B: Line 7 is creating a scanner that can be used to detect keyboard inputs.
		
		//C: It does so by using the next() and nextInt() lines to differentiate what type of data is being put in
		
		//D: The error means that the String type can't take in an integer
		
		//E: The text is all put on the same line. Print() does not indent before putting something into the console, but println() does.
	}
}
