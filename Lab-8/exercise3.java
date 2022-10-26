/* Lab Exercise 3

*/

import java.util.*;

class SeatsFilledException extends Exception {
	int n;

	SeatsFilledException(int num) {
		n = num;
	}
}

class Student {
	public int regno;
	public String name;
	private GregorianCalendar doj;
	static int count = 0;

	Student(String name, short dd, short mm, short yyyy) throws SeatsFilledException {
		if(count >= 3) {
			throw new SeatsFilledException(3);
		}

		this.regno = (yyyy % 100) * 100 + count++;
		this.name = name;
		this.doj = new GregorianCalendar(yyyy, mm-1, dd);
	}

	void display() {
		System.out.println("Registration Number: " + this.regno);
		System.out.println("Name: " + this.name);
		System.out.println("Date of joining: " + this.doj.getTime());
		System.out.println("\n");
	}
}

public class exercise3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		short dd, mm, yyyy;

		int n;

		System.out.print("Enter the number of Students(minumum of 5): ");
		n = sc.nextInt();

		Student[] students = new Student[n];

		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("\nEnter Student " + (i+1) + " details: ");

			System.out.print("\tName: ");
			name = sc.nextLine();

			System.out.print("\tDate of Joining(dd mm yyyy): ");
			dd = sc.nextShort();
			mm = sc.nextShort();
			yyyy = sc.nextShort();

			try {
				students[i] = new Student(name, dd, mm, yyyy);
			}
			catch(SeatsFilledException exc) {
				System.out.println("Seats are Full... Maximum Number of Seats is " + exc.n);
				students[i] = null;
			}
		}

		System.out.println("\n\n======= Student Details =======\n");
		for(int i=0; i<students.length; i++) 
			if(students[i] != null)
				students[i].display();
			else 
				break;
	}
}