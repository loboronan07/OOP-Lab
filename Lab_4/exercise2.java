/* */

import java.util.*;

class Time {
	int hrs;
	int min;
	int sec;

	Time() {
		System.out.println("Initializing a Time object using default constructor....\n");
		this.hrs = 0;
		this.min = 0;
		this.sec = 0;
	}

	Time(int h, int m, int s) {
		System.out.println("Initializing a Time object using parameterized constructor....\n");
		int totalsecs = Math.abs(h * 3600 + m * 60 + s);
		this.hrs = (totalsecs / 3600) % 24;
		totalsecs %= 3600;
		this.min = totalsecs / 60;
		totalsecs %= 60;
		this.min = totalsecs;
	}

	void display() {
		System.out.println(this.hrs + ":" + this.min + ":" + this.sec);
	}
}

public class exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Time t1, t2;
		int h, m, s;

		System.out.println("Initializing t1....");
		t1 = new Time();

		System.out.print("Enter a time in hours, minutes and second(hh mm ss), t2: ");
		h = sc.nextInt();
		m = sc.nextInt();
		s = sc.nextInt();

		t2 = new Time(h, m, s);

		System.out.print("The time, t1 = ");
		t1.display();
		System.out.print("The time entered is, t2 = ");
		t2.display();
	}
}