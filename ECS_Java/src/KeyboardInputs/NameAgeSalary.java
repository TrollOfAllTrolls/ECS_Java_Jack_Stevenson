package KeyboardInputs;

import java.util.Scanner;

public class NameAgeSalary {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		String name;
		int age;
		double salary;
		
		System.out.println("Hello! What is your name?");
		name = keys.next();
		
		System.out.println("Hi " + name + "! How old are you?");
		age = keys.nextInt();
		
		System.out.println("So you are " + age + ", " + name + "?");
		System.out.println("What is your annual salary");
		salary = keys.nextInt();
		
		System.out.println("$" + salary + " is quite a lot of money!");
		
		keys.close();
	}
}
