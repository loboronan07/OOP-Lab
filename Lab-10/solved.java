/* Solved Exercise
	Program defines two classes, the generic class Gen, and the second is GenDemo, which uses Gen. 
	Here, T is a type parameter that will be replaced by a real type when an object of type Gen is created.
*/

class Gen<T> {
	T ob;

	Gen(T ob) {
		this.ob = ob;
	}

	T getob() {
		return ob;
	}

	void showType() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}
}

class solved {
	public static void main(String[] args) {
		System.out.println();

		Gen<Integer> iOb = new Gen<Integer>(88);
		iOb.showType();
		int v = iOb.getob();
		System.out.println("Value: " + v + "\n");

		Gen<String> strOb = new Gen<String>("Generics Test");
		strOb.showType();
		String str = strOb.getob();
		System.out.println("Value: " + str + "\n");
	}
}