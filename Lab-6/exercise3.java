/* Lab Exercise 3
	Create an abstract class Figure with abstract method area and two integer dimensions. Create three more 
	classes Rectangle, Triangle and Square which extend Figure and implement the area method. Show how the 
	area can be computed dynamically during run time for Rectangle, Square and Triangle to achieve dynamic 
	polymorphism. (Use the reference of Figure class to call the three different area methods)
*/

import java.util.*;

abstract class Figure {
	int dim1;
	int dim2;

	Figure(int x, int y) {
		this.dim1 = x;
		this.dim2 = y;
	}

	Figure(int x) {
		this.dim1 = this.dim2 = x;
	}

	abstract double area();
}

class Rectangle extends Figure {
	Rectangle(int x, int y) {
		super(x, y);
	}

	double area() {
		return dim1 * dim2;
	}
}

class Triangle extends Figure {
	Triangle(int x, int y) {
		super(x, y);
	}

	double area() {
		return (dim1 * dim2) / 2.0;
	}
}

class Square extends Figure {
	Square(int x) {
		super(x);
	}

	double area() {
		return dim1 * dim2;
	}
}

public class exercise3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dim1, dim2;
		Figure figure;

		System.out.print("Enter Dimensions for Rectangle(l, b): ");
		dim1 = sc.nextInt();
		dim2 = sc.nextInt();

		figure = new Rectangle(dim1, dim2);

		System.out.println("Area of the Rectangle: " + figure.area());

		System.out.print("Enter Dimensions for Triangle(h, b): ");
		dim1 = sc.nextInt();
		dim2 = sc.nextInt();

		figure = new Triangle(dim1, dim2);

		System.out.println("Area of the Triangle: " + figure.area());

		System.out.print("Enter Dimensions for Square(a): ");
		dim1 = sc.nextInt();

		figure = new Square(dim1);

		System.out.println("Area of the Square: " + figure.area());
	}
}
