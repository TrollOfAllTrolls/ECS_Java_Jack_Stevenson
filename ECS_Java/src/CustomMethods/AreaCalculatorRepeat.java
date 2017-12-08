package CustomMethods;

import java.util.Scanner;

public class AreaCalculatorRepeat {
	static Scanner keys = new Scanner(System.in);

	public static void main(String[] args) {
		String input;
		do {
			System.out.println("What shape?");
			System.out.println("1) Triangle");
			System.out.println("2) Rectangle");
			System.out.println("3) Square");
			System.out.println("4) Circle");
			System.out.println("5) Quit");
			System.out.print("> ");
			input = keys.next();
			System.out.println("The area is " + selectShape(input));
			System.out.println();
		} while (!input.equalsIgnoreCase("Quit"));
		keys.close();
	}

	public static double selectShape(String shape) {
		double area = 0;
		if (shape.equalsIgnoreCase("Triangle"))
			area = triangle();
		else if (shape.equalsIgnoreCase("Rectangle"))
			area = rectangle();
		else if (shape.equalsIgnoreCase("Square"))
			area = square();
		else if (shape.equalsIgnoreCase("Circle"))
			area = circle();
		return area;
	}

	public static int triangle() {
		System.out.println();
		System.out.print("Base: ");
		int base = keys.nextInt();
		System.out.print("Height: ");
		int height = keys.nextInt();
		System.out.println();
		return (base / 2) * height;
	}

	public static int rectangle() {
		System.out.println();
		System.out.print("Base: ");
		int base = keys.nextInt();
		System.out.print("Height: ");
		int height = keys.nextInt();
		System.out.println();
		return base * height;
	}

	public static int square() {
		System.out.println();
		System.out.print("Side Length: ");
		int length = keys.nextInt();
		System.out.println();
		return length * length;
	}

	public static double circle() {
		System.out.println();
		System.out.print("Radius: ");
		int radius = keys.nextInt();
		System.out.println();
		return (radius * radius) * Math.PI;
	}
}
