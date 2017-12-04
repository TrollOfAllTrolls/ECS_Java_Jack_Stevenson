package SelectionStructures;

import java.util.Scanner;

public class TwoQuestions {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		String answerOne, answerTwo;

		System.out.println("Two Questions!");
		System.out.println("Think of an object, and I will try to guess what it is!");
		System.out.println();
		System.out.print("Question 1) Is it an animal, a fruit, or something man-made? ");

		answerOne = keys.next();

		System.out.println();
		System.out.print("Question 2) Is it bigger than a breadbox? ");

		answerTwo = keys.next();
		System.out.println();
		if (answerOne.equalsIgnoreCase("animal")) {
			if (answerTwo.equalsIgnoreCase("yes")) {
				System.out.println("Is it a Moose?");
			} else {
				System.out.println("Is it a Squirrel?");
			}
		} else if (answerOne.equalsIgnoreCase("fruit")) {
			if (answerTwo.equalsIgnoreCase("yes")) {
				System.out.println("Is it a Watermelon?");
			} else {
				System.out.println("Is it an Orange?");
			}
		} else {
			if (answerTwo.equalsIgnoreCase("yes")) {
				System.out.println("Is it a V1 Flying Bomb?");
			} else {
				System.out.println("Is it a Paper Clip?");
			}
		}
	}
}
