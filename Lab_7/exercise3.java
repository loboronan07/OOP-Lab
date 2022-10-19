/* Lab Exercise 3
	
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

		System.out.println("Available Opertions: ");
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