package CustomMethods;

import java.util.Scanner;

public class BabyCalc {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		
		System.out.print("Give me a math procedure: ");
		String num1 = keys.next();
		String opp = keys.next();
		String num2 = keys.next();
		System.out.println();
		System.out.print(num1 + " ");
		System.out.print(opp + " ");
		System.out.print(num2 + " = ");
		System.out.println(calculate(num1, opp, num2));
		
		keys.close();
	}

	private static String calculate(String num1, String opp, String num2) {
		if(opp.equalsIgnoreCase("+"))
			return Integer.parseInt(num1) + Integer.parseInt(num2) + "";
		else if(opp.equalsIgnoreCase("-"))
			return Integer.parseInt(num1) - Integer.parseInt(num2) + "";
		else if(opp.equalsIgnoreCase("x"))
			return Integer.parseInt(num1) * Integer.parseInt(num2) + "";
		else if(opp.equalsIgnoreCase("/"))
			return Integer.parseInt(num1) / Integer.parseInt(num2) + "";
		else
		return "null";
	}
}
