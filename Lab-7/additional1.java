/* Additional Exercise 1
	Create a class Phone{string brand, int memCapacity}, which contains an interface (Nested interface)
	Callable{makeAudioCall(string cellNum), makeVideoCall(string cellNum)}. Create subclasses BasicPhone 
	and SmartPhone and implement the methods appropriately. Demonstrate the creation of both subclass
	objects by calling appropriate constructors which accepts values from the user. Using these objects 
	call the methods of the interface.
*/

import java.util.*;

class Phone {
	String brand;
	int memCapacity;
	
	Phone(String brand, int memCapacity) {
		this.brand = brand;
		this.memCapacity = memCapacity;
	}
	
	public void displayInfo() {
		System.out.println("\tBrand: " + this.brand);
		System.out.println("\tMemory Capacity: " + this.memCapacity);
		System.out.println();
	}
		
	
	public interface Callable {
		void makeAudioCall(String cellNum);
		void makeVideoCall(String cellNum);
	}
}

class BasicPhone extends Phone implements Phone.Callable {
	
	BasicPhone(String brand, int memCapacity) {
		super(brand, memCapacity);
	}
	
	public void makeAudioCall(String cellNum) {
		System.out.println("Making an audio call to " + cellNum);
	}
	
	public void makeVideoCall(String cellNum) {
		System.out.println("Video Calls are not supported on this phone");
	}
}

class SmartPhone extends Phone implements Phone.Callable {
	
	SmartPhone(String brand, int memCapacity) {
		super(brand, memCapacity);
	}
	
	public void makeAudioCall(String cellNum) {
		System.out.println("Making an audio call to " + cellNum);
	}
	
	public void makeVideoCall(String cellNum) {
		System.out.println("Making a video call to " + cellNum);
	}
}

class additional1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Basic Phone Details: ");
		System.out.print("Brand: ");
		String brand = sc.nextLine();
		System.out.print("Memory Capacity: ");
		int mem = sc.nextInt();
		
		BasicPhone basic = new BasicPhone(brand, mem);
		
		System.out.println("Enter Smart Phone Details: ");
		System.out.print("Brand: ");
		sc.nextLine();
		brand = sc.nextLine();
		System.out.print("Memory Capacity: ");
		mem = sc.nextInt();
		
		SmartPhone smart = new SmartPhone(brand, mem);
		
		int choice;
		String cell;
		Phone phone;
		Phone.Callable caller;
		while(true) {
			System.out.println("Available Phones: ");
			System.out.println("\t1. Basic Phone");
			System.out.println("\t2. Smart Phone");
			System.out.print("Enter your choice(Hit 0 to exit): ");
			choice = sc.nextInt();
			
			if(choice == 1) {
				phone = basic;
				caller = basic;
			}
			else if(choice == 2) {
				phone = smart;
				caller = smart;
			}
			else 
				break;
			
			System.out.println("Available Operation: ");
			System.out.println("\t1. Display Info");
			System.out.println("\t2. Audio Call");
			System.out.println("\t3. Video Call");
			System.out.print("Enter your choice(Hit 0 to go back): ");
			choice = sc.nextInt();
			
			if(choice == 1) 
				phone.displayInfo();
			else if(choice == 2 || choice == 3) {			
				System.out.print("Enter Cell Number to Call: ");
				cell = sc.nextLine();
				if(choice == 2)
					caller.makeAudioCall(cell);
				else 
					caller.makeVideoCall(cell);
			}
		}
	}
}
	
	
