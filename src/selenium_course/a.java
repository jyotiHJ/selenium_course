package selenium_course;

import java.util.Scanner;

public class a {
	public static void main(String[] args) {
	
	
		  System.out.println("Please Enter number:");
		  Scanner scanner = new Scanner (System.in);
		  int number = scanner.nextInt();
		  
		  if (number > 0) 
		  {
	            System.out.println("The entered number is positive.");
	        } else 
	        {
	            System.out.println("The entered number is negative.");
	        } 
	        
}
}