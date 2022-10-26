/* Lab Exercise 1
	 Design a stack class. Provide your own stack exceptions namely Push Exception and Pop Exception, 
	 which throw exceptions when the stack is full and when the stack is empty respectively. 
	 Show the usage of these exceptions in handling a stack object in the main.
*/

import java.util.*;

class PushException extends Exception {
	int size;

	PushException(int s) {
		size = s;
	}
}	

class PopException extends Exception {

}

class Stack {
	int[] arr;
	int tos;

	Stack(int n) {
		arr = new int[n]; tos = -1;
	}

	boolean isFull() { return tos == arr.length - 1; }

	boolean isEmpty() { return tos == -1; }

	void push(int ele) throws PushException {
		if(isFull()) {
			throw new PushException(arr.length);
		}
		arr[++tos] = ele;
	}

	int pop() throws PopException {
		if(isEmpty()) {
			throw new PopException();
		}
		return arr[tos--];
	}
}


public class exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the maximim size of stack: ");
		int n = sc.nextInt();

		Stack s = new Stack(n);
		int ele, choice;
		
		System.out.println("Avalilable Stack Operations: ");
		System.out.println("\t1. Push an Element");
		System.out.println("\t2. Pop an Element");
		System.out.println("\t3. Exit");

		while(true) { 
			System.out.print("\nEnter your choice: ");
			choice = sc.nextInt();

			if(choice == 1) {
				System.out.print("Enter the element to be pushed into the stack: ");
				ele = sc.nextInt();
				try {
					s.push(ele);
				}
				catch(PushException exc) {
					System.out.println("Stack Overflow Error for Stack of Size " + exc.size + "...");
				}
			}
			else if(choice == 2) {
				try {
					ele = s.pop();
					System.out.println(ele + " was popped from the stack...");
				}
				catch(PopException exc) {
					System.out.println("Stack Underflow Error...");
				}
			}
			else if(choice == 3) {
				break;
			}
			else {
				System.out.println("Please Enter a Valid Operation...");
			}
		}
	}
}

