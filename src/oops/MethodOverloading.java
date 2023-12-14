package oops;

public class MethodOverloading {

	public static void main(String[] args) {

		Calculator1 cal = new Calculator1();

		int result = cal.sum(2, 3);

		System.out.println(result);

		double result1 = cal.sum(5.4, 3.2);

		System.out.println(result1);
		
		int result2 = Calculator1.sum(45, 50, 75);
		
		System.out.println(result2);
		
		

}
}

class Calculator1{

	int sum(int m, int n) {
		int k= m+n;
		return k;
	}

	double sum(double m, double n) {
		double k1 = m+n;
		return k1;

	}

	static int sum(int a, int b, int c) {
		int ans= a+b+c;
		return ans;
	}


}