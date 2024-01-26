package oops;

public class CallByValue {
	public static void main(String[] args) {

		int j=20;
		System.out.println(j);
		Test200.make50(j);
		System.out.println(j);

	}
}

class Test200{

	static void make50(int i) 
	{
		i=50;
		System.out.println("i="+i);
	}
}
