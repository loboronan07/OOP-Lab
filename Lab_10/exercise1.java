import java.util.*;

class GenArr<T> {
	T[] arr;

	GenArr(T[] arr) {
		this.arr = arr;
	}

	void swap(int i, int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	void display() {
		for(int i=0; i<arr.length; i++) 
			System.out.println("\t" + arr[i]);
	}
}


class exercise1 {
	

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, m1, m2;

		System.out.print("Enter the number of elements in the String array: ");
		n = sc.nextInt();

		String[] strArr = new String[n];

		System.out.println("Enter the elements of the array: ");
		sc.nextLine();
		for(int i=0; i<n; i++)
			strArr[i] = sc.nextLine();

		GenArr<String> GenStr = new GenArr<String>(strArr);

		System.out.print("Enter the indexes of the elements to swap: ");
		m1 = sc.nextInt(); m2 = sc.nextInt();

		System.out.println("\nStrings in Array before swapping:");
		GenStr.display();

		GenStr.swap(m1, m2);

		System.out.println("\nStrings in Array after swapping:");
		GenStr.display();


		System.out.print("\n\nEnter the number of elements in the integer array: ");
		n = sc.nextInt();

		Integer[] intArr = new Integer[n];

		System.out.print("Enter the elements of the array: ");
		for(int i=0; i<n; i++)
			intArr[i] = sc.nextInt();

		GenArr<Integer> GenInt = new GenArr<Integer>(intArr);

		System.out.print("Enter the indexes of the elements to swap: ");
		m1 = sc.nextInt(); m2 = sc.nextInt();

		System.out.println("\nArray before swapping:");
		GenInt.display();

		GenInt.swap(m1, m2);

		System.out.println("\nArray after swapping:");
		GenInt.display();
	}
}