/* Lab Exercise 1

*/

class Multiplication extends Thread {
	int n;

	Multiplication(int n) {
		super(String.format("Multiplication Table for %d", n));
		this.n = n;
		System.out.println("Starting Printing " + getName());
		start();
	}

	public void run() {
		printTable();
	}

	void printTable() {
		try {
			for(int i=1; i<=10; i++) {
				System.out.println(n + " * " + i + " = " + n*i);
				sleep(100);
			}
		}
		catch(InterruptedException e) {
			System.out.println(getName() + " Interrupted...");
		}
		System.out.println(getName() + " exiting...");
	}
}


public class exercise1 {
	public static void main(String[] args) {
		Multiplication m1 = new Multiplication(5);
		while(m1.isAlive()) {
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println("Main Interrupted...");
			}
		}
		
		Multiplication m2 = new Multiplication(7);
		while(m2.isAlive()) {
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println("Main Interrupted...");
			}
		}
	}
}