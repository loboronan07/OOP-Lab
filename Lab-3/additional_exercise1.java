/* Additional Exercise 1 */

import java.util.*;

public class additional_exercise1 {
	static int inputISBN() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the ISBN Number: ");
		int n = sc.nextInt();
		return n;
	}
	
	static void checkISBN(int n) {
		int digits = 0;
		int sum = 0;
		int num = n;
		
		while (n != 0) {
			sum += (10 - digits) * (n % 10);
			n /= 10;
			digits++;
		}
		
		if(digits != 10) {
			System.out.println("ISBN should be a 10 digit number.");
		}
		else if(sum % 11 != 0) {
			System.out.println("Illegal ISBN");
		}
		else {
			System.out.println("Legal ISBN");
		}
	}
	
	public static void main(String[] args) {
		int n = inputISBN();
		checkISBN(n);
	}
}


