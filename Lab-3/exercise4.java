/* Lab Exercise 4
	Create a class called Stack for storing integers. The instance variables are:
    		i) An integer an-ay
    		ii) An integer for storing the top of stack (tos)
       	Include methods for initializing tos, pushing an element to the stack and for popping an element from the stack. 
	The push()method should also check for "stack overflow" and pop() should also check for "stack underflow". 
	Use a display( ) method to display the contents of stack.
 */

import java.util.*;

class Stack {
	int arr[] = new int[100];
	int tos;

	void initialize() {
		this.tos = -1;
	}

	boolean isFull() {
		return this.tos >= 100;
	}
	
	boolean isEmpty() {
		return this.tos < 0;
	}	
	
	void push(int ele) {
		if(this.isFull()) {
			System.out.println("Stack Overflow ...");
			return;
		}
		this.tos++;
		this.arr[this.tos] = ele;
	}

	void pop() {
		if(this.isEmpty()) {
			System.out.println("Stack Underflow ...");
			return;
		}
		this.tos--;
	}

	void display() {
		if(this.isEmpty()) {
			System.out.println("Stack Empty");
		}
		else {
			System.out.println("Stack elements are: ");
			for(int i=0; i <= this.tos; i++) {
				System.out.print(this.arr[i] + "\t");
			}
			System.out.println();
		}
	}
}

public class exercise4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack();
		stack.initialize();
		int ele, choice;
		
		System.out.println("Avalilable Stack Operations: ");
		System.out.println("\t1.Display Stack");
		System.out.println("\t2.Push an Element");
		System.out.println("\t3.Pop an Element");
		System.out.println("\t4.Exit");
		
		while(true) { 
			System.out.print("Enter operation(1-4): ");
			choice = sc.nextInt();
			System.out.println();
			
			if(choice == 1) {
				stack.display();
			}
			else if(choice == 2) {
				System.out.print("Enter the element to be pushed into the stack: ");
				ele = sc.nextInt();
				stack.push(ele);
			}
			else if(choice == 3) {
				stack.pop();
			}
			else if(choice == 4) {
				break;
			}
			else {
				System.out.println("Invalid User Input, Try Again");
			}
			System.out.println();
		}
	}
}
