/* Lab Exercise 3
	Design an interface called Series with the following methods
		i) 	Get Next (retums the next number in series) 
		ii) reset(to restalt the series) 
		iii)set Start (to set the value from which the series should staff)
	Design a class named By Twos that will implement the methods of the interface Series 
	such that it generates a series of numbers, each two greater than the previous one. 
	Also design a class which will include the main method for referencing the interface.
*/

import java.util.*;

interface Series {
	public int getNext();
	public void reset();
	public void setStart(int n);
}

class ByTwos implements Series {
	int a;
	int start;

	public int getNext() {
		a += 2;
		return a;
	}

	public void reset() {
		a = start;
	}

	public void setStart(int n) {
		a = start = n;
	}
}

public class exercise3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice, n;
		System.out.println("Creating a new ByTwo Series with 0 as start...");
		Series s = new ByTwos();
		s.setStart(0);

		System.out.println("\nAvailable Operations: ");
		System.out.println("\t1. Get Next Element");
		System.out.println("\t2. Reset to Start");
		System.out.println("\t3. Set Start");

		while(true) {
			System.out.print("\nEnter Operation(0 to exit): ");
			choice = sc.nextInt();

			if(choice == 0) {
				break;
			}

			switch(choice) {
				case 1:
					System.out.println("Next Element -> " + s.getNext());
					break;
				case 2:
					System.out.println("Resetting back to start...");
					s.reset();
					break;
				case 3:
					System.out.print("Enter value for start: ");
					n = sc.nextInt();
					System.out.println("Setting start to " + n);
					s.setStart(n);
					break;
				default:
					System.out.println("Please enter a Valid Operation...");
					break;
			}
		}
	}
}