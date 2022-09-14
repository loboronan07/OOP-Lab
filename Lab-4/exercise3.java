/* Lab Exercise 3
	Define a class to represent a Bank account. Include the following members. Data members:
		1. Name of the depositor
	        2. Account number.
	        3. Type of account.
	        4. Balance amount in the account.
	        5. Rate of interest (static data)
	Provide a default constructor and parameterized constructor to this class. Also provide Methods:
		1 . To deposit amount.
        	2. To withdraw amount after checking for minimum balance.
        	3. To display all the details of an account holder.
        	4. Display rate of interest (a static method)
	Illustrate all the constructors as well as all the methods by defining objects.
*/

import java.util.*;

class BankAccount {
	String name;
	int accountNumber;
	String accountType;
	double balance;
	static double rateOfInterest = 6.0;
	private double minimumBalance = 2000.;

	BankAccount() {
		System.out.println("Initializing Bank Account object using default constructor...\n");
		this.name = null;
		this.accountNumber = 0;
		this.accountType = null;
		this.balance = 0.0;
	}

	BankAccount(String name, int accNum, String accType) {
		System.out.println("Initializing Bank Account object using parameterized constructor...\n");
		this.name = name;
		this.accountNumber = accNum;
		this.accountType = accType;
		this.balance = 0.0;
	}

	void deposit(double amount) {
		System.out.println("\nDepositing Rs." + amount + "\n");
		this.balance += amount;
	}

	boolean checkMinimum(double amount) {
		return (this.balance - amount) > minimumBalance;
	}

	void withdraw(double amount) {
		if (checkMinimum(amount)) {
			System.out.println("\nWithdrawing Rs." + amount + "\n");
			this.balance -= amount;
		}
		else {
			System.out.println("\nNot Enough Balance Available....\n");
		}
	}

	void displayDetails() {
		System.out.println("Account Number: " + this.accountNumber);
		System.out.println("Name: " + this.name);
		System.out.println("Account Type: " + this.accountType);
		System.out.println("Balance: Rs." + this.balance);
	}

	static void diplayROI() {
		System.out.println("Rate of Interest: " + rateOfInterest + "%");
	}
}

class exercise3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, accountType;
		int accountNumber;
		double balance, amount;
		int choice;

		System.out.println("Initializing Bank Account 1....");
		BankAccount b1 = new BankAccount();

		System.out.println("\n----- Bank Account 1 Details -----");
		b1.displayDetails();

		System.out.println("\n");

		System.out.println("Enter details for a new Bank Account: ");
		System.out.print("Name: ");
		name = sc.next();
		System.out.print("Account Number: ");
		accountNumber = sc.nextInt();
		System.out.print("Account Type: ");
		accountType = sc.next();

		BankAccount b2 = new BankAccount(name, accountNumber, accountType);
		
		System.out.println("Enter Your Choice:");
		System.out.println("\t1.Deposit Money");
		System.out.println("\t2.Withdraw Money");
		System.out.println("\t3.Display Info");
		System.out.println("\t4.Display Rate of Interest");
		System.out.println("\t5.Exit");

		exit:while(true) {
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
				case 1:
					System.out.print("Enter amount to be deposited: ");
					amount = sc.nextDouble();
					b2.deposit(amount);
					break;
				case 2:
					System.out.print("Enter amount to be withdrawn: ");
					amount = sc.nextDouble();
					b2.withdraw(amount);
					break;
				case 3:
					System.out.println("----- Bank Account 2 Details -----");
					b2.displayDetails();
					break;
				case 4:
					BankAccount.diplayROI();
					break;
				case 5:
					System.out.println("Thank You for Using our Services.");
					break exit;
				default:
					System.out.println("Wrong Choice... Try Again.");
					break;
			}
			System.out.println("\n");
		}
	}
}
