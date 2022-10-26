/* Lab Exercise 4
	Design a class Student with the methods, get Number and put Number to read and display the Roll No. 
	of each student and get Marks() and put Marks() to read and display their marks. 
	Create an interface called Sports with a method put Grade() that will display the grade obtained by a 
	student in Sports. 
	Design a class called Result that will implement the method put Grade() and generate the final result 
	based on the grade in sports and the marks obtained from the superclass Student.
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