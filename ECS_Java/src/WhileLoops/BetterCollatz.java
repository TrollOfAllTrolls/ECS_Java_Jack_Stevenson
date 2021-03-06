package WhileLoops;

import java.util.Scanner;

public class BetterCollatz {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = keys.nextInt();
		int highestNum = 0, count = 0;
		System.out.print(num + " ");
		do{
			if(num%2 == 0)
				num = num / 2;
			else
				num = (num*3) + 1;
			System.out.print(num + " ");
			
			if(num > highestNum){
				highestNum = num;
			}
			count++;
		} while(num != 1);
		keys.close();
		System.out.println();
		System.out.println("There are " + count  + " numbers in this set");
		System.out.println("The largest number was " + highestNum);
	}
}
