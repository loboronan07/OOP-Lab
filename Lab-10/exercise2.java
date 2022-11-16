import java.util.*;

class Person {
	String name;
}

class Student extends Person {
	int regno;

	Student(String n, int r) {
		name = n;
		regno = r;
	}

	void display() {
		System.out.println("\tStudent Name: " + name);
		System.out.println("\tRegistration Number: " + regno);
	}
}

class Employee extends Person {
	int empid;

	Employee(String n, int e) {
		name = n;
		empid = e;
	}

	void display() {
		System.out.println("\tEmployee Name: " + name);
		System.out.println("\tEmployee ID: " + empid);
	}
}

class Stack<T extends Person> {
	T[] arr;
	int tos;

	Stack(T[] arr) {
		this.arr = arr;
		tos = -1;
	}

	void push(T ele) {
		if(tos == arr.length - 1) {
			System.out.println("Stack is Full...");
		}
		System.out.println("Pushing element into Stack...");
		arr[++tos] = ele;
	}

	T pop() {
		if(tos == -1) 
			return null;
		System.out.println("Popping element from Stack...");
		return arr[tos--];
	}
}

class exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice, schoice;
		String name;
		int reg;
		Student std;

		Stack<Student> stck = new Stack<Student>(new Student[5]);

		System.out.println("Available Operations: ");
		System.out.println("\t1. Push Student Object");
		System.out.println("\t2. Pop Student Object");
		System.out.println("\t3. Exit");

		while(true) {	
			System.out.print("Enter Choice: ");
			choice = sc.nextInt();

			if(choice == 3) 
				break;

			if(choice == 1) {
				System.out.print("Enter Name: ");
				sc.nextLine();
				name = sc.nextLine();

				System.out.print("Enter Registration Number: ");
				reg = sc.nextInt();

				stck.push(new Student(name, reg));
			}
			else if(choice == 2) {
				std = stck.pop();
				if(std != null) {
					System.out.println("Popped Student Object Contains: ");
					std.display();
				}
				else
					System.out.println("Stack is Empty...");
			}
			else {
				System.out.println("Invalid Choice");
			}

		}
	}
	
}