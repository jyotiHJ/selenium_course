package selenium_course;

public class KeywordThis {

	public static void main(String[] args) {
		pen1 p =new pen1();
		//pen1 p1 =new pen1(5);
		p.a=15;
		p.draw1();

	}

}

class pen1{

	int a=10;

	public void draw() {
		int a = 12;
		System.out.println(a);
		System.out.println(this.a);
	}
	
	public void draw1() {
		
		System.out.println("This is draw1 method");
		this.draw();
	}

	pen1(){
		this(3);
		System.out.println("constructor with zero parameter");
	}

	pen1(int p){

		System.out.println("constructor with parameter");	
	}
	
}