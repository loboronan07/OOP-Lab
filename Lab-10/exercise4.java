import java.util.Scanner;

class GenArr<T> {
    T[] arr;

    GenArr(T[] arr) {
        this.arr = arr;
    }
}

class exercise4 {
    static void display(GenArr<?> ob) {
        for(int i=0; i<ob.arr.length; i++)
            System.out.println("\t" + ob.arr[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter the number of elements in the integer array: ");
	n = sc.nextInt();

	Integer[] intArr = new Integer[n];

	System.out.print("Enter the elements of the array: ");
	for(int i=0; i<n; i++)
		intArr[i] = sc.nextInt();

	GenArr<Integer> GenInt = new GenArr<Integer>(intArr);

	System.out.print("Enter the number of elements in the String array: ");
	n = sc.nextInt();

	String[] strArr = new String[n];

	System.out.println("Enter the elements of the array: ");
	sc.nextLine();
	for(int i=0; i<n; i++)
		strArr[i] = sc.nextLine();

	GenArr<String> GenStr = new GenArr<String>(strArr);

        System.out.println("\n\nValues in Integer Array are: ");
        display(GenInt);

        System.out.println("\n\nValues in String Array are: ");
        display(GenStr);

        sc.close();
    }
}
