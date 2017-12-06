package ForLoops;

import java.util.Scanner;

public class CountingMachineRevised {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		System.out.print("Count from: ");
		int num1 = keys.nextInt();
		System.out.print("Count by: ");
		int num2 = keys.nextInt();
		System.out.print("Count to: ");
		int num3 = keys.nextInt();
		for(int i = num1; i <= num3; i = i + num2){
			System.out.print(i + " ");
		}
	}
}
