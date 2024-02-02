package oops;

public class Calculator {

	//i & j are parameters
	
	//Documentation
	/**
	 * This method is I am creating to generate sum of input.
	 * @param i
	 * @param j
	 * @return
	 */
	int sum(int i, int j)
	{
		int k = i + j;
		return k;
	}

	int multiply(int i , int j)
	{
		int p = i * j;
		return p;
	}

	//non-parameterized method
	double valueOfPi() {
		return 3.14;
	}


	//no return type required
	void noReturn() {

		System.out.println("Hello..");
	}


	//static method 

	static void test1() {


	}

}