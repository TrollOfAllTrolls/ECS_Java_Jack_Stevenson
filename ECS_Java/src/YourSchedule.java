
public class YourSchedule {
	public static void main(String[] args) {
		String[][] classInfo = {{"Spanish", "Sanchez"}, {"Comp Science", "Mauro"}, {"Math 1 Honors", "Farrar"}, {"PE", "Lackey"}};
		
		System.out.println("Jack's Class Schedule:");
		System.out.println();
		System.out.println("-------------------------------------------------");
		
		for (int i = 1; i < 5; i++) {
			System.out.println("For Period " + i + ", I have " + classInfo[i - 1][0] + " with " + classInfo[i-1][1] + ".");
		}
		
		System.out.println("-------------------------------------------------");
	}
}
