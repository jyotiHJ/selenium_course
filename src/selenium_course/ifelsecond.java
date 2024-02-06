package selenium_course;

import java.util.Scanner;

public class ifelsecond {
  public static void main(String[] args) {
	  
	  System.out.println("Welcome to my Age Calculator");
	  System.out.println("Please Enter Your Age:");
	  Scanner scan = new Scanner (System.in);
	
	  int age = scan.nextInt();
	  
//	  int age =25;
	  if(age < 18) 
	  {
			System.out.println("Child");
		}
	  else if(age >= 18 && age < 30) 
	  {
			System.out.println("Adult");
	  }
	  else if(age >= 30 && age < 45) 
	  {
			System.out.println("Mature");
       }
	  else  
		{
			System.out.println("Old");
		}
  }
}
