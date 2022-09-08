/* Additional Exercise 2 */

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
