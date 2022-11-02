/* Lab Exercise 2 

*/

import java.util.*;
class SumArr implements Runnable{
	String name;
	Thread t;
	int s;
	int[] arr;

	SumArr(int r, int[] arr) {
		name = String.format("Sum for Row %d", r);
		t = new Thread(this, name);
		this.arr = arr;
		System.out.println("Starting Thread to compute " + name);
		t.start();
	}

	public void run() {
		sum();
		System.out.println(name + " exiting...");
	}

	void sum() {
		s = 0; 
		for(int i=0; i<arr.length; i++) {
			s += arr[i];
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				System.out.println(name + " Interrupted...");
			}
		}
	}
}

public class exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n;

		System.out.print("Enter the dimensions of the matrix: ");
		m = sc.nextInt(); n = sc.nextInt();

		int[][] matrix = new int[m][n];

		System.out.println("Enter the matrix elements: ");
		for(int i=0; i<m; i++) 
			for(int j=0; j<n; j++)
				matrix[i][j] = sc.nextInt();

		SumArr[] threads = new SumArr[m];

		for(int i=0; i<m; i++) 
			threads[i] = new SumArr(i+1, matrix[i]);

		boolean flag;
		do {
			flag = false;
			for(int i=0; i<m; i++) 
				if(threads[i].t.isAlive()) {
					flag = true;
					try {
						Thread.sleep(200);
					}
					catch(InterruptedException e) {
						System.out.println("Main Thread Interrupted...");
					}
					continue;
				}
		} while(flag);

		int sum = 0;
		for(int i=0; i<m; i++)
			sum += threads[i].s;

		System.out.println("Sum of all elements in the matrix is " + sum);
	}
}