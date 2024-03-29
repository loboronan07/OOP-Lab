/* Lab Exercise 4
	    Write and execute a Java program to convert strings containing numbers into commapunctuated numbers, 
	    with a comma every third digit from the right.
		e.g., Input String : "1234567"
		      Output String : "1,234,567"
*/

import java.util.*;

class exercise4 {
	static String commaSeperate(String input) {
		String output = new String();
		int length = input.length();
		int i;
		for(i=length; i>3; i-=3) {
			output = "," + input.substring(i-3, i) + output;
		}
		output = input.substring(0, i) + output;
		return output;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;

		System.out.print("Enter a number: ");
		input = sc.nextLine();

		String output = commaSeperate(input);

		System.out.println("Comma Seperated Number: " + output);
	}
}
