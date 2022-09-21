/* Additional Exercise 1
	Write and execute a Java program to pull out all occurences of a given sub-string present in the main 	
	string.
*/

import java.util.*;

class additional1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str, substr;
		
		System.out.print("Enter the input string: ");
		str = sc.nextLine();
		System.out.print("Enter the search substring: ");
		substr = sc.nextLine();
		
		int prev_index = 0;
		int index = 0;
		int endindex;
		System.out.println("Occurences of \"" + substr + "\" in \"" + str + "\":");
		while(true) {
			index = str.indexOf(substr, index);
			if(index < 0) 
				break;
			endindex = str.indexOf(" ", index+substr.length());
			if(endindex >= 0)
				System.out.println(str.substring(index, endindex));
			else 
				System.out.println(str.substring(index));
			prev_index = index+substr.length();
			index++;
		}
	}
}
