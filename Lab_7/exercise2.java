/* Lab Exercise 2

*/

import java.util.*;
import static myPackages.p1.Maximum.*;
public class exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m, n;
		int i1, i2, i3;
		float f1, f2, f3;
		int[] arr;
		int[][] matrix;

		System.out.print("Enter three integers: ");
		i1 = sc.nextInt();
		i2 = sc.nextInt();
		i3 = sc.nextInt();

		System.out.println("Maximum of the three integers entered is " + max(i1, i2, i3));
		System.out.println();

		System.out.print("Enter three floating numbers: ");
		f1 = sc.nextFloat();
		f2 = sc.nextFloat();
		f3 = sc.nextFloat();

		System.out.println("Maximum of the three floating numbers entered is " + max(f1, f2, f3));
		System.out.println();

		System.out.print("Enter number of elements in array: ");
		n = sc.nextInt();
		
		arr = new int[n];

		System.out.print("Enter elements of the array: ");
		for(int i=0; i<arr.length; i++) 
			arr[i] = sc.nextInt();

		System.out.println("Maximum of the elements in the array is " + max(arr));
		System.out.println();

		System.out.print("Enter dimensions of matrix: ");
		m = sc.nextInt();
		n = sc.nextInt();
		
		matrix = new int[m][n];

		System.out.println("Enter elements of the array: ");
		for(int i=0; i<m; i++) 
			for(int j=0; j<n; j++)
				matrix[i][j] = sc.nextInt();

		System.out.println("Maximum of the elements in the matrix is " + max(matrix));
		System.out.println();

	}
}
