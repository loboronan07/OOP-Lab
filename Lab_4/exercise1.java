/* */

import java.util.*;

class Complex {
	double re;
	double im;

	Complex() {
		System.out.println("Initializing a Complex object using default constructor....\n");
		this.re = 0.;
		this.im = 0.;
	}

	Complex(double re, double im) {
		System.out.println("Initializing a Complex object using parameterized constructor....\n");
		this.re = re;
		this.im = im;
	}

	void display() {
		System.out.println(this.re + ((this.im >=0) ? " + i" : " - i") + Math.abs(this.im));
	}
}

public class exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Complex z1, z2;
		double a, b;

		System.out.println("Initializing z1....");
		z1 = new Complex();

		System.out.print("Enter a Complex Number(real and imaginary parts), z2: ");
		a = sc.nextDouble();
		b = sc.nextDouble();

		System.out.println("Initializing z2....");
		z2 = new Complex(a, b);

		System.out.print("The complex number, z1 = ");
		z1.display();
		System.out.print("The complex number entered is, z2 = ");
		z2.display();
	}
}