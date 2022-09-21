/* Additional Exercise 2
	Write and execute a Java program to count number of occurrences of a particular string in another 		
	string.
*/

import java.util.*;

class additional2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str, substr;
		
		System.out.print("Enter the input string: ");
		str = sc.nextLine();
		System.out.print("Enter the search substring: ");
		substr = sc.nextLine();
		
		int count = 0;
		int index = 0;
		while(true) {
			index = str.indexOf(substr, index);
			if(index < 0) 
				break;
			count++;
			index++;
		}
		
		System.out.println("Frequency of occurence of \"" + substr + "\" in \"" + str + "\" is " + count);
	}
}
		

