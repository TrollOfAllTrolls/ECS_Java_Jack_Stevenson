package WhileLoops;

import java.util.Random;

public class DoubleDice {
	public static void main(String[] args) {
		Random num = new Random();
		
		int num1;
		int num2;
		
		System.out.println("Here comes the Dice!");
		
		do{
			num1 = num.nextInt(6) + 1;
			num2 = num.nextInt(6) + 1;
		System.out.println();
		System.out.println("Roll 1: " + num1);
		System.out.println("Roll 2: " + num2);
		System.out.println("The total is " + (num1+num2) + "!");
		} while( num1 != num2);
	}
}