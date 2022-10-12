/* Lab Exercise 1
	
*/

import java.util.*;

class BirthDate {
	int dd, mm, yyyy;
	BirthDate(int dd, int mm, int yyyy) {
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
}

class Person {
	private String name;
	private BirthDate birth_date;

	Person(String name, int dd, int mm, int yyyy) {
		this.name = new String(name);
		this.birth_date = new BirthDate(dd, mm, yyyy);
	}

	public String getName() {
		return new String(this.name);
	}

	public String getBirthDate() {
		return new String(this.birth_date.dd + " " + this.birth_date.mm + " " + this.birth_date.yyyy);
	}
}

class CollegeGraduate extends Person {
	private float GPA;
	private int year_of_graduation;

	CollegeGraduate(String name, int dd, int mm, int yyyy, float GPA, int year_of_graduation) {
		super(name, dd, mm, yyyy);
		this.GPA = GPA;
		this.year_of_graduation = year_of_graduation;
	}

	public float getGPA() {
		return this.GPA;
	}

	public int getYearOfGraduation() {
		return this.year_of_graduation;
	}
}

public class exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name;
		int dd, mm, yyyy;

		System.out.println("Enter Person Details: ");
		System.out.print("\tName: ");
		name = sc.nextLine();
		System.out.print("\tDate of Birth: ");
		dd = sc.nextInt();
		mm = sc.nextInt();
		yyyy = sc.nextInt();

		Person person = new Person(name, dd, mm, yyyy);

		System.out.println("Enter Student Details: ");
		sc.nextLine();
		System.out.print("\tName: ");
		name = sc.nextLine();
		System.out.print("\tDate of Birth: ");
		dd = sc.nextInt();
		mm = sc.nextInt();
		yyyy = sc.nextInt();
		System.out.print("\tGPA: ");
		float GPA = sc.nextFloat();
		System.out.print("\tYear of Graduation: ");
		int yog = sc.nextInt();

		CollegeGraduate grad = new CollegeGraduate(name, dd, mm, yyyy, GPA, yog);

		System.out.println("Person Details: ");
		System.out.println("\tName: " + person.getName());
		System.out.println("\tDate of Birth: " + person.getBirthDate());

		System.out.println("Student Details: ");
		System.out.println("\tName: " + grad.getName());
		System.out.println("\tDate of Birth: " + grad.getBirthDate());
		System.out.println("\tGPA: " + grad.getGPA());
		System.out.println("\tYear of Graduation: " + grad.getYearOfGraduation());
	}
}