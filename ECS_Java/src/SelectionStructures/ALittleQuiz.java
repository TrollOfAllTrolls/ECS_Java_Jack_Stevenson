package SelectionStructures;

import java.util.Scanner;

public class ALittleQuiz {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		int score = 0;
		int answer;
		System.out.println("Q1) What is the the best robotics team in the world?");
		System.out.println("      1) Aluminum Narwhals");
		System.out.println("      2) Some other team");
		System.out.println("      3) Robotics suck! Why would I like any of the teams?");

		System.out.println();
		System.out.print("> ");
		
		answer = keys.nextInt();
		
		if (answer == 1) {
			System.out.println();
			System.out.println("Correct!");
			score++;
		} else if (answer == 3) {
			System.out.println();
			System.out.println("Man, you're rude. -1 point for you!");
			score--;
		} else {
			System.out.println();
			System.out.println("Wrong! The correct answer was '1) Aluminum Narwhals'.");
		}

		System.out.println("Q2) Who is bad?");
		System.out.println("      1) Nobody");
		System.out.println("      2) Ronak Roy");
		System.out.println("      3) The whole team");

		System.out.println();
		System.out.print("> ");

		answer = keys.nextInt();
		
		if (answer == 2) {
			System.out.println();
			System.out.println("Correct!");
			score++;
		} else {
			System.out.println();
			System.out.println("I mean, you aren't wrong, so I'll give you a point anyways.");
			score++;
		}
		
		System.out.println("Q3) What is the speed of light (In miles per second)?");
		System.out.println("      1) 186282 Miles/Second");
		System.out.println("      2) Faster than me");
		System.out.println("      3) Too fast");

		System.out.println();
		System.out.print("> ");

		answer = keys.nextInt();
		
		if (answer == 1) {
			System.out.println();
			System.out.println("Correct!");
			score++;
		} else if (answer == 2) {
			System.out.println();
			System.out.println("Quite a lot faster, but that's not correct.");
		} else {
			System.out.println();
			System.out.println("It isn't that fast, but I'll give you a point cuz I feel like it.");
			score++;
		}
		System.out.println();
		
		System.out.println("Your final score is: " + score + " out of 3");
		
		keys.close();
	}
}
