package oops;

//Use method call directly as argument

class B{
	  public int add(int i , int j){
	    return i+j;
	  }
	}

	public class A{
	  public static void main(String[]  args){
	    B a1 = new B();
	  int  result=  a1.add(a1.add(10,20),a1.add(30,40));
	   System.out.println(result); 
	    
	  }
	}

