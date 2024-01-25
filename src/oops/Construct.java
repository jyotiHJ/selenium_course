package oops;

public class Construct {

	public static void main(String[] args) {
		D a = new D();
		
	}

}

class D{

	D(){
		this(3);
		System.out.println("This is zero parameterized constructor");
	}
	D(int i){
		System.out.println("This is parameterized constructor");
	}
}