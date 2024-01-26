package oops;

public class ChatApp {
  public static void main(String[] args) {
	
	  Human.country="India";
	  
	 Human h1 = new Human();
	 h1.name = "Harshad";
	 h1.age = 30;
	
	 
	 Human h2 = new Human();
	 h2.name = "Jyoti";
	 h2.age = 25;
	 
	 
	 h1.speak("Hello");
	 h2.speak("Hi. I am Good!!!..");
	 
	 System.out.println(h1.age);
	 h2.happyBirthday();
	 System.out.println(h1.age);
	 System.out.println(h2.age);
	 
	 System.out.println(h1.country);
}
}
