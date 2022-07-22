import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoopMapEx {

	public static void main(String[] args) {

		Map<String, String> cars = new HashMap<>();
//		this is the data available in the hashmap
		cars.put("altima", "nissan");
		cars.put("suburban", "chevy");
		cars.put("wrangler", "jeep");
		cars.put("focus", "ford");

		
		Scanner userInput = new Scanner(System.in);
		System.out.println("What Model are you looking for?");
		String carWanted = userInput.nextLine();
		
//		System.out.println("Sure our " + carWanted + "'s are this way");
		
		if (carWanted.equals("altima")) {
			System.out.println("Sure our Nissans are this way");
		} 
		else if (carWanted.equals("suburban")) {
			System.out.println("Sure our Chevrolets are this way");
		} 
		else if (carWanted.equals("wrangler")) {
			System.out.println("Sure our Jeeps are this way");
		}
		else if (carWanted.equals("focus")) {
			System.out.println("Sure our Fords are this way");
		}
		else {
			System.out.println("Sorry, we don't have that at this time.");
		}
		
		
		
	}
}


