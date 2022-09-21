/* Lab Exercise 3
	Add member fimctions to the above code that perfonn the following operations
        	a) List all the students whose name starts with a particular character.
        	b) List all the student names containing a palticular sub string.
        	c) Change the full name in the object to name with just initials and family name. For example, 
        		Prakash Kalingrao Aithal must be changed to P. K. Aithal and store it in the object. 
        		Display modified objects.
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
		this.regno = (yyyy % 100) * 100 + count++;
		this.name = name;
		this.doj = new GregorianCalendar(yyyy, mm-1, dd);
		this.sem = sem;
		this.gpa = gpa;
		this.cgpa = 0;
		if(this.sem > 1) {
			for(int i=0; i<this.sem-1; i++) 
				this.cgpa = this.cgpa + gpa[i];
			this.cgpa = this.cgpa / (sem-1);
		}
	}

	void display() {
		System.out.println("Registration Number: " + this.regno);
		System.out.println("Name: " + this.name);
		System.out.println("Date of joining: " + this.doj.getTime());
		System.out.println("Semester: " + this.sem);
		System.out.println("CGPA: " + this.cgpa);
		if(this.sem > 1) {
			System.out.println("GPA: ");
			for(int i = 0; i < this.gpa.length && i < 8; i++) 
				System.out.print("Sem " + (i+1) + "\t");
			System.out.println();
			for(int i = 0; i < this.gpa.length && i < 8; i++) 
				System.out.print(this.gpa[i] + "\t");
		}
		System.out.println("\n");
	}

	public static void sortBySem(Student[] students) {
		Student temp;
		for(int i=0; i<students.length-1; i++) 
			for(int j=0; j<students.length-1-i; j++) 
				if((students[j].sem > students[j+1].sem) || (students[j].sem == students[j+1].sem && students[j].cgpa > students[j+1].cgpa)) {
					temp = students[j];
					students[j] = students[j+1];
					students[j+1] = temp;
				}
	}

	public static void sortByName(Student[] students) {
		Student temp;
		for(int i=0; i<students.length-1; i++) 
			for(int j=0; j<students.length-1-i; j++) 
				if(students[j].name.compareTo(students[j+1].name) > 0) {
					temp = students[j];
					students[j] = students[j+1];
					students[j+1] = temp;
				}
	}

	public static void listByChar(Student[] students, char start) {
		System.out.println("Students whose names start with " + start + ": ");
		for(int i=0; i<students.length; i++) 
			if(students[i].name.charAt(0) == start) 
				System.out.println(students[i].name);
	}

	public static void listByString(Student[] students, String subString) {
		System.out.println("Students whose names contain " + subString + ": ");
		for(int i=0; i<students.length; i++) 
			if(students[i].name.contains(subString))
				System.out.println(students[i].name);
	}

	public static void changeName(Student[] students) {
		String name, temp;
		int first, last;
		for(int i=0; i<students.length; i++) {
			temp = students[i].name;
			name = new String();
			while(true) {
				first = temp.indexOf(" ");
				last = temp.lastIndexOf(" ");
				if(first < 0) 
					break;
				name = name + temp.charAt(0) + ". ";
				temp = temp.substring(first+1);
				if(first == last) 
					break;
			}
			name = name + temp;
			students[i].name = name;
		}
	}
}

class exercise3 {
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

			if(sem > 1) {
				System.out.println("Enter GPA of each Semesters: ");
				gpa = new float[sem-1];
				for(int j = 0; j < sem-1; j++) {
					System.out.print("Sem " + (j+1) + ": ");
					gpa[j] = sc.nextFloat();
				}
			}
			else 
				gpa = null;

			students[i] = new Student(name, dd, mm, yyyy, sem, gpa);
		}

		System.out.println("\n\n======= Student Details =======\n");
		for(int i=0; i<students.length; i++) {
			students[i].display();
		}
		
		Student.sortBySem(students);

		System.out.println("\n\n======= Student Details(Sorted by Semester and CGPA) =======\n");
		for(int i=0; i<students.length; i++) {
			students[i].display();
		}

		Student.sortByName(students);

		System.out.println("\n\n======= Student Details(Sorted by Name) =======\n");
		for(int i=0; i<students.length; i++) {
			students[i].display();
		}
		
		System.out.println("===================================================\n");
		System.out.println("Listing By Character: ");
		System.out.print("\tEnter Character: ");
		char start = sc.next().charAt(0);
		sc.nextLine();
		Student.listByChar(students, start);

		System.out.println("\nListing By Sub String: ");
		System.out.print("\tEnter String: ");
		String sub = sc.nextLine();
		Student.listByString(students, sub);

		Student.changeName(students);

		System.out.println("\n\n======= Student Details(After Changing Names to Initials) =======\n");
		for(int i=0; i<students.length; i++) {
			students[i].display();
		}
	}
}
