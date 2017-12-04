package SelectionStructures;

import java.util.Scanner;

public class SpaceBoxing {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		int weight;
		String planet;
		
		System.out.print("Please enter your current weight: ");
		
		weight = keys.nextInt();
		
		System.out.println("I have info on these planets:");
		System.out.println("  Venus  | Mars   | Jupiter");
		System.out.println("  Saturn | Uranus | Neptune");
		System.out.println();
		
		System.out.print("Which planet are you visiting? ");
		
		planet = keys.next();
		
		System.out.println();
		
		if(planet.equalsIgnoreCase("Venus")){
			System.out.println("Your weight would be " + (weight*0.78) + " pounds on Venus.");
		}
		else if(planet.equalsIgnoreCase("Mars")){
			System.out.println("Your weight would be " + (weight*0.39) + " pounds on Mars.");
		}
		else if(planet.equalsIgnoreCase("Jupiter")){
			System.out.println("Your weight would be " + (weight*2.65) + " pounds on Jupiter.");
		}
		else if(planet.equalsIgnoreCase("Saturn")){
			System.out.println("Your weight would be " + (weight*1.17) + " pounds on Saturn.");
		}
		else if(planet.equalsIgnoreCase("Uranus")){
			System.out.println("Your weight would be " + (weight*1.05) + " pounds on Uranus.");
		}
		else if(planet.equalsIgnoreCase("Neptune")){
			System.out.println("Your weight would be " + (weight*1.23) + " pounds on Neptune.");
		}
	}
}
