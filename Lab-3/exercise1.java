/* Lab Exercise 1
	Define a class to represent a complex number called Complex. Provide the following methods:
    		i) To assign initial values to the Complex object.
    		ii) To display a complex numberin a+ib format.
    		iii) To add 2 complex numbers. (the return type should be Complex) iv) To subtract 2 complex numbers
	Write a main method to test the class.
	[Hint: Make use of Math.abs() during subtraction.] 
*/

import java.util.*;

class Complex {
	float re;
	float im;

	void assign(float re, float im) {
		this.re = re;
		this.im = im;
	}

	void display() {
		if(this.im >= 0) 
			System.out.println(this.re + " + i" + this.im);
		else
			System.out.println(this.re + " - i" + Math.abs(this.im));
	}

	Complex add(Complex c) {
		Complex sum = new Complex();
		sum.assign(this.re + c.re, this.im + c.im);
		return sum;
	}

	Complex subtract(Complex c) {
		Complex diff = new Complex();
		diff.assign(this.re - c.re, this.im - c.im);
		return diff;
	}
}

public class exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Complex z1 = new Complex();
		Complex z2 = new Complex();
		float a, b;

		System.out.print("Enter a Complex Number(real and imaginary parts), z1: ");
		a = sc.nextFloat();
		b = sc.nextFloat();

		z1.assign(a, b);

		System.out.print("Enter another Complex Number(real and imaginary parts), z2: ");
		a = sc.nextFloat();
		b = sc.nextFloat();

		z2.assign(a, b);

		System.out.print("The complex number entered is, z1 = ");
		z1.display();
		System.out.print("The complex number entered is, z2 = ");
		z2.display();

		Complex sum = z1.add(z2);
		Complex diff = z1.subtract(z2);

		System.out.print("Complex numbers addition, z1 + z2 = ");
		sum.display();

		System.out.print("Complex numbers subtraction, z1 - z2 = ");
		diff.display();
	}
}
