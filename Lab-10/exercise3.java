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
		LinkedList<Integer> ll = new LinkedList<Integer>();

		Integer choice, ele;

		System.out.println("Avaliable Operations: ");
		System.out.println("\t1. Insert to Linked List");
		System.out.println("\t2. Delete from Linked List");
		System.out.println("\t3. Display Linked List");
		System.out.println("\t4. Exit");

		while(true) {
			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			if(choice == 1) {
				System.out.print("Enter integer to insert: ");
				ele = sc.nextInt();
				ll.insert(ele);
			}
			else if(choice == 2) {
				ele = ll.delete();
				if(ele != null) {
					System.out.println(ele + " was deleted from the Linked List...");
				}
				else {
					System.out.println("Linked List is Empty...");
				}
			}
			else if(choice == 3) {
				ll.display();
			}
			else if(choice == 4) {
				break;
			}
			else {
				System.out.println("Invalid Operation. Please Try Again...");
			}
		}
	}
}