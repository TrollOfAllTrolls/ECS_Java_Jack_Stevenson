package ForLoops;

import java.util.Scanner;

public class AddingValuesForLoop {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		System.out.print("Count to: ");
		int num = keys.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i++){
			System.out.print(i + " ");
			sum+= i;
		}
		System.out.println();
		System.out.println("The sum is " + sum);
	}
}
