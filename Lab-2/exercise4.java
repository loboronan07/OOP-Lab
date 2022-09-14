/* Lab Exercise 4
	Find the addition of two matrices and display the resultant matrix.
*/

import java.util.*;

public class exercise4 {
	public static void main(String args[]) {
		int m, n; // Dimensions of the arrays
		Scanner sc = new Scanner(System.in);
		// Get the dimensions from the user
		System.out.println("Note: The dimensions of the two matrices should be the same for their sum to be defined.");
		System.out.print("Enter the dimensions of the matrices: ");
		m = sc.nextInt();
		n = sc.nextInt();
		// Declare the two matrices along with the resultant matrix
		int A[][] = new int[m][n];
		int B[][] = new int[m][n];
		int resultant[][] = new int[m][n];
		// Accept the elements from the user
		System.out.println("Enter the elements of the first matrix A: ");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the elements of the second matrix B: ");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		// Perform addition on the two matrices
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				resultant[i][j] = A[i][j] + B[i][j];
			}
		}
		// Display the resultant matrix
		System.out.println("The resultant matrix A + B:");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(resultant[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
