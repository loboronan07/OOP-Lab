/* Lab Exercise 3
	Create a class Mixer to merge two sorted integer arrays in ascending order with the following 
	instance variables and methods:	
	Instance Variables: 
		int arr[]
	Methods:
		void accept() 		// To accept the elements of the array in ascending order 
						without any duplicates
		Mixer mix(Mixer A) 	// To merge the current object array elements with the 
						parameterized array elements and return the resultant 
						object
		void display() 		// To display the elements of the class
	Define the main() method to test the class.
 */

import java.util.*;

// Class Mixer Definition
class Mixer {
	// Instance Variables
	int[] arr; 	// To store the array elements
	int n;		// To store the number of elements
	
	
	void sort() {
		/* The sort() method sorts the elements of the array using the bubble sort technique */
		int temp;
		// Bubble sort
		for(int i=0; i < this.n-1; i++) {
			for(int j=0; j < this.n-1-i; j++) {
				if(this.arr[j] > this.arr[j+1]) {
					temp = this.arr[j];
					this.arr[j] = this.arr[j+1];
					this.arr[j+1] = temp;
				}
			}
		}
	}	
	
	void accept(int arr[], int n) {
		/* The accept() method stores the given array arr which is input by the user in arr 
			of the class */
		this.arr = arr;
		this.n = n;
		this.sort(); 		// Call the sort method to sort the elements of the array
		this.delDuplicates();	// Delete Duplicate elements in the array
	}
	
	void delDuplicates() {
		/* This method deletes duplicate values in the sorted array */
		int uniques, lastUnique; // Declare variables
		
		uniques = 1; // Keeps track of the number of unique elements encountered during the search
 		lastUnique = this.arr[0]; // The last element which was unique
 		
 		// Search for the number of unique elements in the array
		for(int i=1; i < n; i++) {
			if(lastUnique != this.arr[i]) { 
				// If a new element is found, update counter unique and keep track of the new element
				uniques++;
				lastUnique = this.arr[i];
			}
		}
		
		// Declare a new array with the number of unique elements found
		int[] temp = new int[uniques];
		
		// Iterate through the array again, and store unique elements in to the temp array
		uniques = 0; 	// Index of the next unique element to be added
		temp[uniques] = this.arr[0]; 	// Set the first element
		
		for(int i = 1; i < n; i++) {
			if(temp[uniques] != this.arr[i]) {
				// If a new element is found, store the new element in temp array
				uniques++;
				temp[uniques] = this.arr[i];
			}
		}
		this.arr = temp; 	// The temp array is the required array with the unique elements of the array
		this.n = uniques + 1;	// Update number of elements
	}

	Mixer mix(Mixer A) {
		/* This method merges the two Mixer objects, and returns a new Mixer object with elements of both the 
			initial Mixer objects which are sorted and contain no duplicate values */
		int i; 	// Index counter
		Mixer mixed = new Mixer(); 	// Create a new Mixer object
		
		mixed.n = this.n + A.n; 	// Number of elements in the new array
		mixed.arr = new int[mixed.n];	// Create an array with n elements
		
		// Insert the elements of the first array to mixed array
		for(i = 0; i < this.n; i++) {	
			mixed.arr[i] = this.arr[i];
		}
		
		// Append the elements of the second array to mixed array
		for(; i < this.n + A.n; i++) {
			mixed.arr[i] = A.arr[i - this.n];
		}
		
		mixed.sort(); 	// Sort the elements in mixed array
		mixed.delDuplicates();	// Delete duplicate elements from the array
		
		return mixed;
	}

	void display() {
		/* Print out the elements of the array */
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}

public class exercise3 {
	static int[] getElements(int n, Scanner sc) {
		int[] arr = new int[n];
		System.out.println("Enter the array elements: ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
	 	int n, arr[];
		Mixer A = new Mixer();
		Mixer B = new Mixer();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements of the array, A: ");
		n = sc.nextInt();
		arr = getElements(n, sc);
		A.accept(arr, n);
		
		System.out.print("Enter the number of elements of the array, B: ");
		n = sc.nextInt();
		arr = getElements(n, sc);
		B.accept(arr, n);
		
		Mixer mixed = A.mix(B);

		System.out.println("The elements of the first mixer array: ");
		A.display();
		System.out.println("The elements of the second mixer array are: ");
		B.display();
		System.out.println("The elements of the mixed array are: ");
		mixed.display();
	}
}
