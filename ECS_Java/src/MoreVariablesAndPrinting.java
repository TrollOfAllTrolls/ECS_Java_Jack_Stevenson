
public class MoreVariablesAndPrinting {
	public static void main(String[] args) {
		String myName, myEyes, myTeeth, myHair;
		int myAge, myHeight, myWeight;
		
		myName = "Jack P. Stevenson";
		myAge = 14;
		myHeight = 67;
		myWeight = 128;
		myEyes = "Blue";
		myTeeth = "Light yellow";
		myHair = "Blonde";
		
		//B:
		
		System.out.println("Let's talk about " + myName + ".");
		System.out.println("He is " + myHeight + " inches (or " + (myHeight*2.54) + " cm) tall.");
		System.out.println("He weighs " + myWeight + "(or " + (myWeight*0.454) + " kilograms) pounds.");
		System.out.println("Actually, that isn't too heavy.");
		System.out.println("He's got " + myEyes + " eyes and " + myHair + " hair.");
		System.out.println("His teeth are typically " + myTeeth + ".");
		
		System.out.println("If I add " + myAge + ", " + myHeight + ", and " + myWeight + ", I get " + (myAge + myHeight + myWeight) + ".");
		
		//A: Line 4 initializes all the string variables, but they are not declared yet
	}
}
