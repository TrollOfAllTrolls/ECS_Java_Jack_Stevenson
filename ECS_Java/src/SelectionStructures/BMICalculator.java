package SelectionStructures;

import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		int height, weight;
		double bmi;
		
		System.out.println("Body Mass Index (BMI) is a way of representing your size");
		System.out.println();
		System.out.print("How tall are you (In inches)? ");
		height = keys.nextInt();
		System.out.print("How much do you weigh (In pounds)? ");
		weight = keys.nextInt();
		System.out.println();
		bmi = (weight*0.4536)/((height*0.0254)*(height*0.0254));
		System.out.println("Your BMI is " + bmi + ".");
		keys.close();
		if(bmi < 18.5){
			System.out.println("You are underweight.");
		}
		else if(bmi < 24.9){
			System.out.println("You are normal.");
		}
		else if(bmi < 29.9){
			System.out.println("You are overweight.");
		}
		else{
			System.out.println("You are obese.");
		}
	}
}
