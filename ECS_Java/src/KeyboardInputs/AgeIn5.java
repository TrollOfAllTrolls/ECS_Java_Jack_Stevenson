package KeyboardInputs;

import java.util.Scanner;

public class AgeIn5 {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);

		String name;
		int age;

		System.out.println("What is your name? ");
		name = keys.next();

		System.out.println("Hello, " + name + "! How old are you? ");
		age = keys.nextInt();

		System.out.println("Did you know that in 5 years, you will be " + (age + 5)
				+ " years old? And five years ago you were " + (age - 5) + " years old! Imagine that!");
		
		keys.close();
	}
}
