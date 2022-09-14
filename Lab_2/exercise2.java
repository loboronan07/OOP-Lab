// Insert an element into 1D array and delete an element from a 1D array by taking the position as input

import java.util.*;

public class exercise2 {
	public static void main(String args[]) {
		int arr[] = new int[100]; // Array declaration
		int n; // Number of elements of the array
		int pos, ele, temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		n = sc.nextInt();
		System.out.print("Enter the elements: ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the element to be inserted: ");
		ele = sc.nextInt();
		System.out.print("Enter the position at which to insert: ");
		pos = sc.nextInt();
		// Push the elements above pos to the adjacent location
		for(int i = n-1; i >= pos-1; i--) { 
			arr[i+1] = arr[i];
		}
		arr[pos-1] = ele; // Insert the element at the specified position
		n++; // Increment the number of elements in the array
		System.out.println("The array after inserting the given element: ");
		for(int i = 0; i < n; i++) 
		{
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
		System.out.print("Enter the position at which to delete: ");
		pos = sc.nextInt();
		for(int i = pos-1; i < n-1; i++) { 
			arr[i] = arr[i+1];
		}
		n--; // Decrement the number the elements in the array
		System.out.println("The array after deleting the element from the array: ");
		for(int i = 0; i < n; i++) 
		{
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}
}