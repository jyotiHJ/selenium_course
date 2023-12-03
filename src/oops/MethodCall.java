package oops;

public class MethodCall {
	
	public static void main (String[] args) {
		
		Car c1 = new Car();
		c1.name = "BMW";
		
		Bike b1 = new Bike();
		b1.name = "Hercules";
		
		 c1.drive("Drive me");
		 b1.ride("Let's go for ride");
		
	}

}
