package oops;

public class IntMethod {
 
	public static void main(String[] args) {
		addition a1 = new addition();
		
		int result = a1.add(15,12);
		System.out.println(result);
		
		int result2 = addition.mul(5,5);
		System.out.println(result2);
		
	}
}

//create 2 methods one should be static and one non static method


class addition{
	
	public int add(int i, int j)  //non static method
	{
		int k = i+j;
		return k;
	}
	
	 static int mul(int m, int n)   //static method
	{
		int j = m*n;
		return j;
		
	}
	
}

