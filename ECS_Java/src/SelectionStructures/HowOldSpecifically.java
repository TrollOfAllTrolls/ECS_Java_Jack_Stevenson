package SelectionStructures;

import javax.swing.JOptionPane;

public class HowOldSpecifically {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Hey, what's your name?");
		int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you, " + name + "?"));
		
		if(age < 16){
			System.out.println("You can't drive, " + name + ".");
		}
		else if(age < 18){
			System.out.println("You can drive but not vote, " + name + ".");
		}
		else if(age < 25){
			System.out.println("You can vote but not rent a car, " + name + ".");
		}
		else{
			System.out.println("You can do pretty much anything, " + name + ".");
		}
	}
}
