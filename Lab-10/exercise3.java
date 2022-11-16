import java.util.*;

class Node<T> {
	T val;
	Node<T> next;

	Node(T val) {
		this.val = val;
		next = null;
	}
}

class LinkedList<T> {
	Node<T> head;

	LinkedList() {
		head = null;
	}

	void insert(T ele) {
		if(head == null) {
			head = new Node<T>(ele);
			return;
		}

		Node<T> temp = head;
		
		while(temp.next != null) {
			temp = temp.next;
		}

		temp.next = new Node<T>(ele);
	}

	T delete() {
		T ele = null;
		if(head == null) {
			ele = null;
		}
		else if(head.next == null) {
			ele = head.val;
			head = null;
		}
		else {
			Node<T> temp = head;
			while(temp.next.next != null) {
				temp = temp.next;
			}
			ele = temp.next.val;
			temp.next = null;		
		}
		return ele;
	}

	void display() {
		if(head == null) {
			System.out.println("Linked List is Empty...");
			return;
		}

		Node<T> temp = head;

		System.out.println("Linked List Contains: ");
		while(temp != null) {
			System.out.print("\t" + temp.val);
			temp = temp.next;
		}
		System.out.println();
	}
}

class exercise3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LinkedList<Integer> intLL = new LinkedList<Integer>();
		LinkedList<Double> dblLL = new LinkedList<Double>();

		Integer choice, llchoice, intele;
		Double dblele;

		while(true) {
			System.out.println("\n\nAvailable Linked Lists: ");
			System.out.println("\t1. Integer LL");
			System.out.println("\t2. Double LL");
			System.out.print("Enter Linked List Choice(Hit 0 to exit): ");
			llchoice = sc.nextInt();

			if(llchoice == 0) 
				break;

			if(llchoice != 1 && llchoice != 2) {
				System.out.println("Invalid Choice... Try Again...");
				continue;
			}

			System.out.println("Avaliable Operations: ");
			System.out.println("\t1. Insert at end to Linked List");
			System.out.println("\t2. Delete from end of Linked List");
			System.out.println("\t3. Display Linked List");
			System.out.print("Enter Choice(Hit 0 to return): ");
			choice = sc.nextInt();

			if(choice == 0) 
				continue;

			if(choice == 1) {
				System.out.print("Enter value to insert: ");
				if(llchoice == 1) {
					intele = sc.nextInt();
					intLL.insert(intele);
				}
				else {
					dblele = sc.nextDouble();
					dblLL.insert(dblele);
				}
			}
			else if(choice == 2) {
				if(llchoice == 1) {
					intele = intLL.delete();
					if(intele != null) {
						System.out.println(intele + " was deleted from the Linked List...");
					}
					else {
						System.out.println("Linked List is Empty...");
					}	
				}
				else {
					dblele = dblLL.delete();
					if(dblele != null) {
						System.out.println(dblele + " was deleted from the Linked List...");
					}
					else {
						System.out.println("Linked List is Empty...");
					}
				}
			}
			else if(choice == 3) {
				if(llchoice == 1) {
					intLL.display();
				}
				else {
					dblLL.display();
				}
			}
			else {
				System.out.println("Invalid Choice... Try Again...");
			}
		}
	}
}