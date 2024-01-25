package oops;

public class ConstructorChaining {

	public static void main(String[] args) {
        K3 k = new K3();
        
        //k.m3();

	}

}

class K1{

	K1(){
		System.out.println("K1 Constructor");
	}

	public void m1() {
       }
}

class K2 extends K1{

	K2(int i){
		System.out.println("K2 Constructor ");
	}

	public void m2() {
         }
}

class K3 extends K2{

	K3(){
		super(2);
		System.out.println("K3 Constructor");
	}

	public void m3() {

	}
}