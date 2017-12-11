package CustomMethods;

import java.util.Scanner;

public class FindingPrimes {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		System.out.print("Low end: ");
		int low = keys.nextInt();
		System.out.print("High end: ");
		int high = keys.nextInt();
		System.out.println();
		for(int i = low; i <= high; i++){
			System.out.print(i + " ");
			if(isPrime(i))
				System.out.print("<");
			System.out.println();
		}
	}
	public static boolean isPrime(int number){
		boolean isPrime = true;
		for(int i = 2; i < number; i++){
			if(number%i == 0)
				isPrime = false;
		}
		return isPrime;
	}
}
