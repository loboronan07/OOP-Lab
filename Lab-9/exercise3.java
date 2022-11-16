/* Lab Exercise 3
	Write and execute a java program to implement a producer and consumer problem using Inter-thread communication.
*/

import java.util.*;

class NameStore {
	boolean set;
	boolean stop;
	String name;

	NameStore() {
		stop = false;
		set = false;
		name = null;
	}

	synchronized void set(String n) {
		set = true;

		if(n.equalsIgnoreCase("stop")) {
			stop = true;
			notify();
			return;
		}
		name = new String(n);
		notify();

		try {
			while(set) 
				wait();
		}
		catch(InterruptedException e) {
			System.out.println("Thread Interrupted in Set Method...");
		}
	}

	synchronized void put() {
		while(name == null) 
			try {
				wait();
			}
			catch(InterruptedException e) {
				System.out.println("Thread Interrupted in Put Method...");
			}
			

		set = false;
		if(stop) {
			notify();
			return;
		}

		System.out.println("Recieved name as " + name + "...");

		notify();

		try {
			while(!set) 
				wait();
		}
		catch(InterruptedException e) {
			System.out.println("Thread Interrupted in Put Method...");
		}
	}
}

class Producer implements Runnable {
	Thread thrd;
	NameStore ns;

	Producer(NameStore obj) {
		thrd = new Thread(this);
		ns = obj;
		thrd.start();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		String name;
		do {
			System.out.print("Enter a Name(\"stop\" to exit): ");
			name = sc.nextLine();
			ns.set(name);
		} while(!ns.stop);
	}
}

class Consumer implements Runnable {
	Thread thrd;
	NameStore ns;

	Consumer(NameStore obj) {
		thrd = new Thread(this);
		ns = obj;
		thrd.start();
	}

	public void run() {
		while(!ns.stop) {
			ns.put();
		}
	}
}

class exercise3new {
	public static void main(String[] args) {
		NameStore m = new NameStore();
		Producer p = new Producer(m);
		Consumer c = new Consumer(m);

		try {
			p.thrd.join();
			c.thrd.join();
		} 
		catch(InterruptedException e) {
			System.out.println("Main Thread Interrupted...");
		}
	}
}
