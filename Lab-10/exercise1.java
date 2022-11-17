import java.util.*;

class GenArr<T> {
	T[] arr;

	GenArr(T[] arr) {
		this.arr = arr;
	}

	void swap(int i, int j) {
		if(i < 0 || j < 0 || i >= arr.length || j >= arr.length) {
			System.out.println("Indexes do not Exist in the Given Array...");
		}
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
	}
}
