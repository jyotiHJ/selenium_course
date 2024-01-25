package oops;

//Define Class

class Bus {

	//Attributes:

	String brand;
	int year;

	//Method:
	void startEngine() {
		System.out.println("The is Engine is starting. . . . " );
	}

}

 class Carr{
	public static void main(String[] args) {

		//create an object of the Bus class

		Bus myBus = new Bus();

		//Set attributes

		myBus.brand = "TATA";
		System.out.println(myBus.brand);	

		myBus.year = 2015;
		System.out.println(myBus.year);
		
		//call a method

		myBus.startEngine();
	}

}