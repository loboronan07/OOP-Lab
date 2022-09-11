/* Additional Exercise 1 
	The Intemational Standard Book Number (ISBN) is a unique numeric book identifier which is printed on every book. 
	The ISBN is based upon a 10-digit code. The ISBN is legal if:
	1xdigitl + 2xdigit2 + 3xdigit3 + 4xdigit4 + 5xdigit5 + 6xdigit6 + 7xdigit7 + 8xdigit8 + 9xdigit9 + 1Oxdigit10 is
	divisible by 11 .
	Example: For an ISBN 1401601499:
	Sum = 1x1 + 2x4 + 3x0 + 4x1 + 5x6 + 6x0 + 7x1 + 8x4 + 9x9+ 10x9 = 253 which is divisible by 11.
	Write a program to implement the following methods: 
		inputISBN( ) to read the ISBN code as a 10-digit integer.
		checklSBN() to perfonn the following check operations :
			i) If the ISBN is not a 10-digit integer, output the message "ISBN should be a 10 digit number" 
				and terminate the program.
			ii) If the number is 10-digit, extract the digits of the number and compute the sum as explained above.
				If the sum is divisible by 11, output the message, "Legal ISBN"; 
				otherwise output the message, "Illegal ISBN"
*/

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


