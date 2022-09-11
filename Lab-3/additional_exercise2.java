/* Additional Exercise 2 
	Create a Die class with one integer instance variable called sideUp. Give it a getSideUp() method that 
	returns the values of sideUp and a void roll() method that changes sideUpto a random value from I to 6.
	Then create a DieDemo class with a method that creates two Die objects, rolls them, and prints the sum 
	of the two sides up.
*/

import java.util.*;
import java.lang.*;

class Die {
	int sideUp;
	
	int getSideUp() {
		return this.sideUp;
	}
	
	void roll() {
		Random random = new Random();
		this.sideUp = random.nextInt(6) + 1;
	}
}

public class additional_exercise2 {
	public static void main(String[] args) {
		Die die1 = new Die();
		Die die2 = new Die();
		
		System.out.println("Rolling the first die...");
		die1.roll();
		System.out.println("Rolling the second die...\n");
		die2.roll();
		
		System.out.println("Die1: " + die1.getSideUp());
		System.out.println("Die2: " + die2.getSideUp());
		
		System.out.println("The sum of the sides up on the two die is " + (die1.getSideUp() + die2.getSideUp()));
		System.out.println();
	}
}
