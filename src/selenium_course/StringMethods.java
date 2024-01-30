package selenium_course;

public class StringMethods {
public static void main(String[] args) {

	String s1 = "I am learning automation from testometer";
	
	System.out.println(s1.toUpperCase());
	System.out.println(s1.toLowerCase());
	System.out.println(s1.charAt(8));
	System.out.println(s1.indexOf("t"));
	
	String[] splitArr= s1.split(" ");
	for(String Arr : splitArr) {
		System.out.println(Arr);
	}
	
	System.out.println(s1.replace("automation","Java"));  //replace automation to java
	
	//data type to string
	
	int i1= 10;
	String i2 = String.valueOf(i1);
	System.out.println(i2);
	
	//String to datatpe
	
	 
	
	
}
}
