package oops;

//creating 2 non parameterized methods one should be static and one non static method

public class NonParameterized {

	public void message() {

		System.out.println("Non static using no parameter");
	}

	public static void message2() {

		System.out.println("Static method using no parameter");


	}

	public static void main(String[] args) {
		NonParameterized msg = new NonParameterized();

		msg.message();

		NonParameterized.message2();
	}
}


