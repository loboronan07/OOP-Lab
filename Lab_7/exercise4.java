/* Lab Exercise 4

*/

import java.util.*;

class Student {
	int roll;
	int[] marks;

	void getNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Roll No: ");
		roll = sc.nextInt();
		sc.close();
	}

	void putNumber() {
		System.out.print("Roll No: " + roll);
	}

	void getMarks() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Marks of Student in 5 subjects: ");
		marks = new int[5];
		for(int i=0; i<marks.length; i++) 
			marks[i] = sc.nextInt();
		sc.close();
	}

	void putMarks() {
		System.out.println("Marks of Student in 5 subjects: ");
		for(int i=0; i<marks.length; i++) 
			System.out.print("\t" + marks[i]);
		System.out.println();
	}
}

interface Sports {
	public void putGrade();
	
}