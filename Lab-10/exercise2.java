/* Lab Exercise 2
	Define a simple generic stack class and show the use of the generic class for two different class types 
	Student and Employee class objects.
*/

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
			return;
		}
		arr[++tos] = ele;
	}

	T pop() {
		if(tos == -1) 
			return null;
		return arr[tos--];
	}
}

class exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice, schoice;
		String name;
		int reg, empid;
		Student std;
		Employee emp;

		Stack<Student> stckStd = new Stack<Student>(new Student[5]);
		Stack<Employee> stckEmp = new Stack<Employee>(new Employee[5]);

		while(true) {
			System.out.println("\n\nAvailable Stacks: ");
			System.out.println("\t1. Student Stack");
			System.out.println("\t2. Employee Stack");
			System.out.print("Enter Stack Choice(Hit 0 to exit): ");
			schoice = sc.nextInt();

			if(schoice == 0) 
				break;

			if(schoice != 1 && schoice != 2) {
				System.out.println("Invalid Choice... Try Again...");
				continue;
			}

			System.out.println("\nAvailable Operations: ");
			System.out.println("\t1. Push Object");
			System.out.println("\t2. Pop Object");
			System.out.print("Enter Choice(Hit 0 to return): ");
			choice = sc.nextInt();

			if(choice == 0) 
				continue;

			if(choice == 1) {
				System.out.print("Enter Name: ");
				sc.nextLine();
				name = sc.nextLine();

				if(schoice == 1) {
					System.out.print("Enter Registration Number: ");
					reg = sc.nextInt();

					stckStd.push(new Student(name, reg));
				}
				else {
					System.out.print("Enter Employee ID: ");
					empid = sc.nextInt();

					stckEmp.push(new Employee(name, empid));
				}
			}
			else if(choice == 2) {
				if(schoice == 1) {
					std =  stckStd.pop();
					if(std != null) {
						System.out.println("\nPopped Student Object Contains: ");
						std.display();
					}
					else
						System.out.println("Stack is Empty...");
				}
				else {
					emp =  stckEmp.pop();
					if(emp != null) {
						System.out.println("\nPopped Employee Object Contains: ");
						emp.display();
					}
					else
						System.out.println("Stack is Empty...");
				}
			}
			else {
				System.out.println("Invalid Choice... Try Again...");
			}
		}
	}
}