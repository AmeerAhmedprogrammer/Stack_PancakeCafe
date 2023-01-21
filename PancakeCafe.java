//Ameer Ahmed

import java.util.Stack;

public class PancakeCafe {

	public static void main(String[] args) {
		Stack<String> pancakes = new Stack<>();

		// add elements into Stack
		pancakes.push("Blueberry Pancakes");
		pancakes.push("Cinnamon Pancakes");
		pancakes.push("Chocolate Chip Pancakes");
		pancakes.push("Apple Pancakes");

		System.out.println("The cafe currently has: " + pancakes);

		// remove elements in Stack
		System.out.println("We chose a pancake for the customer." + "\n");
		String foodTaken = pancakes.pop();
		System.out.println("The customer ate some: " + foodTaken);
		System.out.println("The cafe now has: " + pancakes);
	}
}