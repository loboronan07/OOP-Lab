/* Additional Exercise 1
	Define a class called Customer that holds private fields for a customer ID number, name and credit limit. Include 
	appropriate constructors to initialize the instance variables of the Customer Class. Write a main() method that 
	declares an an-ay of 5 Customer objects. Prompt the user for values for each Customer, and display all 5
	Customer objects.
*/

import java.util.*;

class Customer {
	private long idNumber;
	private String name;
	private double creditLimit;
	
	Customer() {
		this.idNumber = 0;
		this.name = null;
		this.creditLimit = 0;
	}
	
	Customer(long id, String name, double credLim) {
		this.idNumber = id;
		this.name = name;
		this.creditLimit = credLim;
	}
	
	void display() {
		System.out.println("ID Number: " + this.idNumber);
		System.out.println("Name: " + this.name);
		System.out.println("Credit Limit: " + this.creditLimit);
	}
}

class additional_exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		long id;
		double credit;
		
		Customer[] customers = new Customer[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("\nEnter Details of Customer " + i + ": ");
			System.out.print("Id Number: ");
			id = sc.nextLong();
			System.out.print("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Credit Limit: ");
			credit = sc.nextDouble();
			customers[i] = new Customer(id, name, credit);
		}
		
		System.out.println("========== Customer Details ==========\n");
		for(int i = 0; i < 5; i++) {
			System.out.println("---------- Customer" + i + " ----------");
			customers[i].display();
			System.out.println();
		}
	}
}
		
