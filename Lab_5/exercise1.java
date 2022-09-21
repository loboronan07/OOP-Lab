/* Lab Exercise 1

*/

import java.util.*;

class Student {
	public int regno;
	public String name;
	private GregorianCalendar doj;
	public short sem;
	private float[] gpa;
	private float cgpa;
	static int count = 0;

	Student() {
		this.regno = 0;
		this.name = null;
		this.doj = null;
		this.sem = 0;
		this.gpa = null;
		this.cgpa = 0;
		this.count++;
	}

	Student(String name, short dd, short mm, short yyyy, short sem, float gpa[]) {
		this.regno = (yyyy / 100) * 10 + count++;
		this.name = name;
		this.doj = new GregorianCalendar(yyyy, mm-1, dd);
		this.sem = sem;
		this.gpa = gpa;
		this.cgpa = 0;
		for(int i=0; i<this.sem-1; i++) {
			this.cgpa = this.cgpa + gpa[i];
		}
		this.cgpa = this.cgpa / (sem-1);
	}

	void display() {
		System.out.println("Registration Number: " + this.regno);
		System.out.println("Name: " + this.name);
		System.out.println("Date of joining: " + this.doj.getTime());
		System.out.println("Semester: " + this.sem);
		System.out.println("CGPA: " + this.cgpa);
		System.out.println("GPA: ");
		for(int i = 0; i < this.gpa.length && i < 8; i++) {
			System.out.print("Sem " + (i+1) + "\t");
		}
		System.out.println();
		for(int i = 0; i < this.gpa.length && i < 8; i++) {
			System.out.print(this.gpa[i] + "\t");
		}
		System.out.println("\n");
	}
}

class exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		short dd, mm, yyyy, sem;
		float cgpa, gpa[];

		int n;

		System.out.print("Enter the number of Students(minumum of 5): ");
		n = sc.nextInt();


		Student[] students = new Student[n];

		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("\nEnter Student " + (i+1) + " details: ");

			System.out.print("Name: ");
			name = sc.nextLine();

			System.out.print("Date of Joining(dd mm yyyy): ");
			dd = sc.nextShort();
			mm = sc.nextShort();
			yyyy = sc.nextShort();

			System.out.print("Semester: ");
			sem = sc.nextShort();

			System.out.println("Enter GPA of each Semesters: ");
			gpa = new float[sem-1];

			for(int j = 0; j < sem-1; j++) {
				System.out.print("Sem " + (j+1) + ": ");
				gpa[j] = sc.nextFloat();
			}

			students[i] = new Student(name, dd, mm, yyyy, sem, gpa);
		}
		System.out.println("\n\n======= Student Details =======\n");
		for(int i=0; i<students.length; i++) {
			students[i].display();
		}

	}
}