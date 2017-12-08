package CustomMethods;

import java.util.Scanner;

public class MethodPass {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		if(customMethod(keys.nextInt()))
			System.out.println("That's a good number");
		else
			System.out.println("That's a bad number");
	}

	private static boolean customMethod(int nextInt) {
		if(nextInt%3 == 0)
			return true;
		else
			return false;
		
	}
}
