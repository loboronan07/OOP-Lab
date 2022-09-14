/* Additional Exercise 1
	Define a class IntArr which hosts an an array of integers. Provide the following methods:
    		1. A default constructor.
    		2. A parameterized constructor which initializes the array of the object.
   		3. A method called display to display the an-ay contents.
		4. A method called search to search for an element in the an array.
		5. A method called compare which compares 2 IntArr objects for equality.
*/

import java.util.*;

class IntArr {
	int[] arr;
	
	IntArr() {
		this.arr = null;
	}
	
	IntArr(int[] arr) {
		this.arr = arr;
	}
	
	void display() {
		for(int i = 0; i < this.arr.length; i++) {
			System.out.print(this.arr[i] + "\t");
		}
		System.out.print("\n");
	}
	
	int search(int ele) {
		int pos = -1;
		
		for(int i = 0; i < this.arr.length; i++) {
			if(this.arr[i] == ele) {
				pos = i;
				break;
			}
		}
		return pos;
	}
	
	boolean compare(IntArr A) {		
		if(this.arr.length != A.arr.length) {
			return false;
		}
		
		boolean equals = true;
		
		for(int i = 0; i < this.arr.length; i++) {
			if(this.arr[i] != A.arr[i]) {
				equals = false;
				break;
			}
		}
		
		return equals;
	}
}

// Accessor Class Not Required As Per Question
// The IntArr has been checked for working
		
		
		
		
		
		
