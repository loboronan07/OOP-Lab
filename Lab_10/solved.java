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