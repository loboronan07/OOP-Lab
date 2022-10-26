/* Lab Exercise 2
	Define a class CurrentDate with data members day, month and year. 
	Define a method createDate() to create date object by reading values from keyboard. 
	Throw a user defined exception by name InvalidDayException if the day is invalid and 
	InvalidMonthException if month is found invalid and display current date if the date is valid. 
	Write a test program to illustrate the functionality.
*/

import java.util.*;

class InvalidDayException extends Exception {
	int day;

	InvalidDayException(int d) {
		day = d;
	}
}

class InvalidMonthException extends Exception {
	int month;

	InvalidMonthException(int m) {
		month = m;
	}
}

class CurrentDate {
	int day;
	int month;
	int year;

	CurrentDate(int d, int m, int y) {
		day = d;
		month = m;
		year = y;
	}

	static CurrentDate createDate() throws InvalidMonthException, InvalidDayException {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter today's date(dd mm yyyy): ");
		int d = sc.nextInt(); int m = sc.nextInt(); int y = sc.nextInt();

		if(m < 1 || m > 12) {
			throw new InvalidMonthException(m);
		}

		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		days[2] = days[2] + (((y%4 == 0 && !(y%100 == 0)) || y%400 == 0) ? 1:0);

		if(d < 1 || d > days[m]) {
			throw new InvalidDayException(d);
		}
		
		return new CurrentDate(d, m, y);
	}

	void display() {
		System.out.println("Current Date is " + day + "/" + month + "/" + year);
	}
}


public class exercise2 {
	public static void main(String[] args) {
		CurrentDate date;
		
		try {
			date = CurrentDate.createDate();
			date.display();
		}
		catch(InvalidMonthException exc) {
			System.out.println("Invalid Month " + exc.month + " Entered...");
		}
		catch(InvalidDayException exc) {
			System.out.println("Invalid Day " + exc.day + " Entered...");
		}
	}
}