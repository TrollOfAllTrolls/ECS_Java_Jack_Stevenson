package SelectionStructures;

public class ElseAndIf {
	public static void main(String[] args) {
		int people = 30;
		int cars = 40;
		int busses = 15;
		
		if(cars > people){
			System.out.println("We should take the cars.");
		}
		if (cars < people){
			System.out.println("We shouldn't take the cars.");
		}
		else{
			System.out.println("We can't decide.");
		}
		
		if(cars < busses){
			System.out.println("That's too many busses.");
		}
		else if (cars > busses){
			System.out.println("Maybe we could take the busses.");
		}
		else{
			System.out.println("We still can't decide.");
		}
		
		if(people > busses){
			System.out.println("All right, let's just take the busses.");
		}
		else{
			System.out.println("Fine, let's stay home then");
		}
	}
}
