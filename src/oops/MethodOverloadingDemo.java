package oops;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		int k = SceinceCalci.add(10, 20, 30);
		System.out.println(k);
		
//		int n = SceinceCalci.add(5,4);
//		System.out.println(n);
	}

}


//Method overloading is same name of method but different no. of parameters 
//Different type of parameters
//Method overloading is not depend on return type.

class SceinceCalci{

	static int add(int i, int j) {
         System.out.println("m1");
		int k = i+j;
		return k;
	}

	static int add(int i, int j, int m) {
		System.out.println("m2");
		int k1= SceinceCalci.add(i,j);
		int k2 =  SceinceCalci.add(k1, m);
		
		//int k2 =  SceinceCalci.add(SceinceCalci.add(i,j), m);
		
		return k2 ;
	}

	static double add(double i, double j) {
		System.out.println("m3");
		double k = i+j;
		return k;
	}

}
