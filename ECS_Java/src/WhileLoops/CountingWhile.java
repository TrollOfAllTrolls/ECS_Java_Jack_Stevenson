package WhileLoops;

import java.util.Scanner;

public class CountingWhile {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		
		System.out.println("Type a message, and I'll display it 5 times");
		System.out.print("Message: ");
		String message = keys.next();
		
		int n = 0;
		
		while(n < 5){
			System.out.println((n+1) + ": " + message);
			n++;
		}
		
		keys.close();
	}
}
