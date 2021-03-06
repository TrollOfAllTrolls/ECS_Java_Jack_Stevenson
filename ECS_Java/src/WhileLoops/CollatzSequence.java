package WhileLoops;

import java.util.Scanner;

public class CollatzSequence {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = keys.nextInt();
		System.out.print(num + " ");
		do{
			if(num%2 == 0)
				num = num / 2;
			else
				num = (num*3) + 1;
			System.out.print(num + " ");
		} while(num != 1);
		keys.close();
	}
}
