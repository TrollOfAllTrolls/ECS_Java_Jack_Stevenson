package KeyboardInputs;

import java.util.Scanner;

public class DumbCalculator {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		double numOne, numTwo, numThree;
		
		System.out.println("Let's find the average of 3 numbers...");
		System.out.println();
		
		System.out.println("What is the first number?");
		numOne = keys.nextDouble();
		System.out.println("What is the second number?");
		numTwo = keys.nextDouble();
		System.out.println("What is the third number?");
		numThree = keys.nextDouble();
		
		System.out.println("The average of these numbers is " + (numOne+numTwo+numThree)/3);
	}
}
