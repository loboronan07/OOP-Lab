/* Lab Exercise 2
	Create a class called Time that has instance variables to represent hours, minutes and seconds.
	Provide the following methods:
		i) To assign initial values to the Time object
		ii) To display a Time object in the form of hh:mm:ss {24 hours format}
		iii) To add 2 Time objects (the return type should be a Time) 
		iv) To subtract 2 Time objects (the return type should be a Time)
		v) To compare 2 Time objects and to determine if they are equal or if the first is greater 
			or smaller than the second one
*/

import java.util.*;

class Time {
	int hrs;
	int min;
	int sec;

	void assign(int h, int m, int s) {
		int totalsecs = Math.abs(h * 3600 + m * 60 + s);
		this.hrs = (totalsecs / 3600) % 24;
		totalsecs %= 3600;
		this.min = totalsecs / 60;
		totalsecs %= 60;
		this.sec = totalsecs;
	}

	void display() {
		System.out.println(this.hrs + ":" + this.min + ":" + this.sec);
	}

	Time add(Time t) {
		Time sum = new Time();
		sum.assign(this.hrs + t.hrs, this.min + t.min, this.sec + t.sec);
		return sum;
	}

	Time subtract(Time t) {
		Time diff = new Time();
		diff.assign(this.hrs - t.hrs, this.min - t.min, this.sec - t.sec);
		return diff;
	}

	int compare(Time t) {
		return (this.hrs * 3600 + this.min * 60 + this.sec) - (t.hrs * 3600 + t.min * 60 + t.sec);
	}
}

public class exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Time t1 = new Time();
		Time t2 = new Time();
		int h, m, s;

		System.out.print("Enter time in hours, minutes and second(hh mm ss), t1: ");
		h = sc.nextInt();
		m = sc.nextInt();
		s = sc.nextInt();

		t1.assign(h, m, s);

		System.out.print("Enter another time in hours, minutes and second(hh mm ss), t2: ");
		h = sc.nextInt();
		m = sc.nextInt();
		s = sc.nextInt();

		t2.assign(h, m, s);

		System.out.print("The first time entered is, t1 = ");
		t1.display();
		System.out.print("The second time entered is, t2 = ");
		t2.display();

		Time sum = t1.add(t2);
		Time diff = t1.subtract(t2);

		System.out.print("The sum of the time's entered, t1 + t2 = ");
		sum.display();
		System.out.print("The difference of the time's entered, t1 - t2 = ");
		diff.display();


		if(t1.compare(t2) > 0) {
			System.out.println("Time t1 is ahead of t2.");
		}
		else if(t1.compare(t2) < 0){
			System.out.println("Time t1 is behind t2.");
		}
		else {
			System.out.println("Both the times are equivalent.");
		}
	}
}
