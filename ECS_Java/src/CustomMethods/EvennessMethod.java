package CustomMethods;

public class EvennessMethod {
	public static void main(String[] args) {
		for(int i = 1; i < 101; i++){
			System.out.print(i + " ");
			if(checkEven(i))
				System.out.print("<");
			if(checkDivisibleByThree(i))
				System.out.print("=");
			System.out.println();
		}
	}
	
	public static boolean checkEven(int i){
		if(i%2 == 0)
			return true;
		else
			return false;
	}
	public static boolean checkDivisibleByThree(int i){
		if(i%3 == 0)
			return true;
		else
			return false;
	}
}
