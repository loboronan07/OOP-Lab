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

class Mixer {
	int[] arr;
	int n;		
	
	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		this.n = sc.nextInt();
		this.arr = new int[n];
		System.out.print("Enter the array elements(in ascending order): ");
		for(int i = 0; i < n; i++) {
			this.arr[i] = sc.nextInt();
		}
	}

	Mixer mix(Mixer A) {
		Mixer mixed = new Mixer();
	
		int[] new_arr = new int[this.n + A.n];
		int i, j, count;
		for(i=0, j=0, count=0; i < this.n && j < A.n; count++) {
			if(this.arr[i] < A.arr[j]) {
				new_arr[count] = this.arr[i++];
			}
			else if(this.arr[i] > A.arr[j]){
				new_arr[count] = A.arr[j++];
			}
			else {
				new_arr[count] = this.arr[i++];
				j++;
			}
		}
		for(; i<this.n; count++, i++) {
			new_arr[count] = this.arr[i];
		}
		for(; j<A.n; count++, j++) {
			new_arr[count] = A.arr[j];
		}
		
		mixed.n = count;
		mixed.arr = new int[count];
		
		for(i=0; i<count; i++) {
			mixed.arr[i] = new_arr[i];
		}
		
		return mixed;
	}

	void display() {
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}

public class exercise3 {	
	public static void main(String[] args) {
		Mixer A = new Mixer();
		Mixer B = new Mixer();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------- Mixed Array A ----------");
		A.accept();
		
		System.out.println("\n---------- Mixed Array B ----------");
		B.accept();
		
		Mixer mixed = A.mix(B);

		System.out.println("\n\nThe elements of the first mixer array: ");
		A.display();
		System.out.println("The elements of the second mixer array are: ");
		B.display();
		System.out.println("The elements of the mixed array are: ");
		mixed.display();
	}
}
