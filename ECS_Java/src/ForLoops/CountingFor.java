package ForLoops;

import java.util.Scanner;

public class CountingFor {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		
		System.out.println("Type in a message, and I will display it 5 times.");
		System.out.print("Message: ");
		String message = keys.nextLine();
		
		for(int i = 1; i < 20; i = i + 3){
			System.out.println((i+1) + ": " + message);
		}
	}
}
