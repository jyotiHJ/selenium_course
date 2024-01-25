package oops;

public class CallByValue1 {
	public static void main(String[] args) {
		
		Test201 test1 = new Test201();
		int i=20;
		System.out.println(i);
		
		test1.make50(i);
		System.out.println(i);

		//call by value- actual variable, copy create for Data type
	}
}

class Test201{

	void make50(int i) 
	{ 
		i=50;
		System.out.println("i="+i);
	}

}
