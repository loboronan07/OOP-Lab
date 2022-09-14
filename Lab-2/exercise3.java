/* Lab Exercise 3
	Search an element in a ID an-ay using linear search.
*/

import java.util.*;

public class exercise3 {
	public static void main(String args[]) {
		int n;
		int pos, ele;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the elements: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the element to be searched for: ");
		ele = sc.nextInt();
		pos = -1; // Initialize pos to be a invalid postion to be checked for later
		// Linear Search
		for(int i=0; i<n; i++) {
			if(ele == arr[i]) {
				pos = i+1;
				break;
			}
		}
		if(pos >= 0) {
			System.out.println("The element " + ele + " was found at position " + pos + ".");
		}
		else {
			System.out.println("The search element " + ele + " does not exist in the array.");
		}
	}
}
