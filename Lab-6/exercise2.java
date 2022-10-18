/* Lab Exercise 2
	Create a Building class and two subclasses, House and School. The Building class contains fields for 
	square footage and stories. The House class contains additional fields for number of bedrooms and 
	batlhs. The School class contains additional fields for number of classrooms and grade level (for 
	example, elementary or junior high). All the classes contain appropriate get and set methods. Create a 
	main method that declares objects of each type.
*/

import java.util.*;

class Building {
	private double square_footage;
	private int stories;

	Building(double square_footage, int stories) {
		this.square_footage = square_footage;
		this.stories = stories;
	}

	void setSquareFootage(double square_footage) {
		this.square_footage = square_footage;
	}

	void setStories(int stories) {
		this.stories = stories;
	}

	double getSquareFootage() {
		return this.square_footage;
	}

	int getStories() {
		return this.stories;
	}
}

class House extends Building {
	private int num_of_bedrooms;
	private int num_of_baths;

	House(double square_footage, int stories, int num_of_bedrooms, int num_of_baths) {
		super(square_footage, stories);
		this.num_of_bedrooms = num_of_bedrooms;
		this.num_of_baths = num_of_baths;
	}

	void setNumOfBedrooms(int num_of_bedrooms) {
		this.num_of_bedrooms = num_of_bedrooms;
	}

	void setNumOfBaths(int num_of_baths) {
		this.num_of_baths = num_of_baths;
	}

	int getNumOfBedrooms() {
		return this.num_of_bedrooms;
	}

	int getNumOfBaths() {
		return this.num_of_baths;
	}
}

class School extends Building {
	private int num_of_classrooms;
	private String grade_level;

	School(double square_footage, int stories, int num_of_classrooms, String grade_level) {
		super(square_footage, stories);
		this.num_of_classrooms = num_of_classrooms;
		this.grade_level = new String(grade_level);
	}

	void setNumOfClassrooms(int num_of_classrooms) {
		this.num_of_classrooms = num_of_classrooms;
	}

	void setGradeLevel(String grade_level) {
		this.grade_level = new String(grade_level);
	}

	int getNumOfClassrooms() {
		return this.num_of_classrooms;
	}

	String getGradeLevel() {
		return new String(this.grade_level);
	}
}

public class exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sq_foot;
		int stories, numbd, numb, numcr;
		String grade;

		System.out.println("Enter Details for a Building: ");
		System.out.print("\tSquare Footage: ");
		sq_foot = sc.nextDouble();
		System.out.print("\tStories: ");
		stories = sc.nextInt();

		Building building = new Building(sq_foot, stories);

		System.out.println("Enter Details for a House: ");
		System.out.print("\tSquare Footage: ");
		sq_foot = sc.nextDouble();
		System.out.print("\tStories: ");
		stories = sc.nextInt();
		System.out.print("\tNumber of Bedrooms: ");
		numbd = sc.nextInt();
		System.out.print("\tNumber of Baths: ");
		numb = sc.nextInt();

		House house = new House(sq_foot, stories, numbd, numb);

		System.out.println("Enter Details for a School: ");
		System.out.print("\tSquare Footage: ");
		sq_foot = sc.nextDouble();
		System.out.print("\tStories: ");
		stories = sc.nextInt();
		System.out.print("\tNumber of Classrooms: ");
		numcr = sc.nextInt();
		System.out.print("\tGrade Level: ");
		sc.nextLine();
		grade = sc.nextLine();

		School school = new School(sq_foot, stories, numcr, grade);

		System.out.println("\n\n");

		System.out.println("Building Details Entered: ");
		System.out.println("\tSquare Footage: " + building.getSquareFootage());
		System.out.println("\tStories: " + building.getStories());

		System.out.println("\n\n");

		System.out.println("House Details Entered: ");
		System.out.println("\tSquare Footage: " + house.getSquareFootage());
		System.out.println("\tStories: " + house.getStories());
		System.out.println("\tNumber of Bedrooms: " + house.getNumOfBedrooms());
		System.out.println("\tNumber of Baths: " + house.getNumOfBaths());

		System.out.println("\n\n");

		System.out.println("School Details Entered: ");
		System.out.println("\tSquare Footage: " + school.getSquareFootage());
		System.out.println("\tStories: " + school.getStories());
		System.out.println("\tNumber of Classrooms: " + school.getNumOfClassrooms());
		System.out.println("\tGrade Level: " + school.getGradeLevel());
	}
}
