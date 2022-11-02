/* Lab Exercise 3

*/

class TickTock {
	int state;
	int stop;

	TickTock() {
		state = 0;
		stop = 0;
	}

	synchronized void tick(int n) {
		if(stop) {
			state = 0;
			notify();
			return;
		}

		System.out.print("Tick ");
		state = 0;
		
	}

	void tock(int n) {
		for(int i=0; i<n; i++) {
			state = 1; 
			System.out.println("Tock");
			notify();
		}
		stop = 1;
	}
}

class Producer extends Thread {
	TickTock tck;
	int n;

	Producer(TickTock tck, int n) {
		this.tck = tck;
		this.n = n;
		start();
	}

	public void run() {
		tck.tick(n);
	}
}

class Consumer extends Thread {
	TickTock tck;
	int n;

	Consumer(TickTock tck, int n) {
		this.tck = tck;
		this.n = n;
		start();
	}

	public void run() {
		tck.tock(n);
	}
}


public class exercise3 {
	public static void main(String[] args) {
		TickTock tck = new TickTock();
		Producer p = new Producer(tck, 10);
		Consumer c = new Consumer(tck ,10);
	}
}