/* Lab Exercise 1
	Design a Building class as in Lab 6, program no. 2. 
	Place the Building, House, and School classes in a package named com.course.structure. 
	Create a main method that declares objects of each type and uses the package.
*/

import java.util.*;
import com.course.structure.*;

public class exercise1 {
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
		System.out.println("\tNumber of Bedrooms: " + house.getNumofBedrooms());
		System.out.println("\tNumber of Baths: " + house.getNumofBaths());

		System.out.println("\n\n");

		System.out.println("School Details Entered: ");
		System.out.println("\tSquare Footage: " + school.getSquareFootage());
		System.out.println("\tStories: " + school.getStories());
		System.out.println("\tNumber of Classrooms: " + school.getNumOfClassrooms());
		System.out.println("\tGrade Level: " + school.getGradeLevel());
	}
}