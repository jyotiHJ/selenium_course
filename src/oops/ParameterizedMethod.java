package oops;


	//Creating parameterized method.

public class ParameterizedMethod {
	
	public static void main(String[] args) {
		Method meth1 = new Method();
		
		meth1.add1(10,10);
		meth1.add2(100,10);
		
		Method.sub(50.32,12.1);
		Method.name("Hello");

	}

}

class Method{
	
	public void add1(int i, int j) {
		int result = i+j;
	System.out.println(result);
	}
	
	public int add2(int m, int n) {
		int result1 = m+n;
		System.out.println(result1);
		return result1;
	}
	
	public static double sub(double p, double q) {
		double result2= p - q;
		System.out.println(result2);
		return result2;
	}
	
	public static String name(String content) {
		String n1 = content;
		System.out.println(n1);
		return n1;
	}
	
}