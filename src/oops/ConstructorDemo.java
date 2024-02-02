package oops;

public class ConstructorDemo {

	public static void main(String[] args) {

		Test414 test1= new Test414();
   }
}


//Constructor name should be same as class name.
//There is no return type of constructor.

class Test414{

	//constructor
	Test414(){
		//this(10);
		System.out.println("I am non parameterized Constructor");

	}

	Test414 (int i){

		this();
		//System.out.println("I am int parameterized Constructor");

	}
}

//by using "this" keyword we can call constructor inside constructor