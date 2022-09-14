/* */

import java.util.*;

class Counter {
	static int count = 0;

	Counter() {
		count++;
	}

	static void showCount() {
		System.out.println("Number of Counter objects created till now: " + count);
	}
}

class exercise4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, choice;
		Counter c;
		System.out.println("Enter Choice: ");
		System.out.println("\t1.Create Counter Objects");
		System.out.println("\t2.Counter Objects created till now");
		System.out.println("\t3.Exit\n");

		exit:while(true) {
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
				case 1:
					System.out.print("Enter the number of objects: ");
					n = sc.nextInt();
					for(int i=0; i<n; i++) {
						c = new Counter();
					}
					break;
				case 2:
					Counter.showCount();
					break;
				case 3:
					break exit;
				default:
					System.out.println("Wrong Choice... Try Again.");
					break;
			}
			System.out.println("\n");
		}

	}
}