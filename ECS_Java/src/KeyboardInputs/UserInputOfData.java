package KeyboardInputs;

import java.util.Scanner;

public class UserInputOfData {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		String firstName, lastName, login;
		int grade, studentID;
		double GPA;
		
		System.out.println("Please enter the following information:");
		System.out.println();
		
		System.out.println("First Name:");
		firstName = keys.next();
		System.out.println("Last Name:");
		lastName = keys.next();
		System.out.println("Grade (9-12):");
		grade = keys.nextInt();
		System.out.println("Student ID:");
		studentID = keys.nextInt();
		System.out.println("Login:");
		login = keys.next();
		System.out.println("GPA (0.0 - 4.0):");
		GPA = keys.nextInt();
		
		System.out.println();
		System.out.println("Your information:");
		System.out.println("    Login:   " + login);
		System.out.println("    ID:      " + studentID);
		System.out.println("    Name:    " + lastName + ", " + firstName);
		System.out.println("    GPA:     " + GPA);
		System.out.println("    Grade:   " + grade);
		
		keys.close();
	}
}
