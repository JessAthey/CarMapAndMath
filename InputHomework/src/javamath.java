import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class javamath {

	
	
	
//	Ask user (Scanner input) for 5 numbers (integers because math needed) --
//	Store the Scanner.input into an Array (array name = chosen)
//	find the sum of the array --
//	find the product of the array --
//	find the largest of the array --
//	find the smallest of the array --
	
	
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<Integer>(2);
		
		System.out.println("Please enter 5 numbers");
		while (nums.size() < 5) {
			nums.add(Integer.parseInt(input.nextLine()));
		}
		
		System.out.println(nums);
		
		Integer sum=0;
		for(int i = 0; i < nums.size(); ++i) {
			sum += nums.get(i);
		}
		System.out.println("Your sum is " + sum);
		
		Integer product = 1;
		for(int i = 0; i <nums.size(); ++i) {
			product *= nums.get(i);
		}
		System.out.println("Your product is " + product);
		
		int largest = Collections.max(nums);
		System.out.println("Your largest number is " + largest);
		
		int smallest = Collections.min(nums);
		System.out.println("Your smallest number is " + smallest);
		
	}
			
			
}
		
	


