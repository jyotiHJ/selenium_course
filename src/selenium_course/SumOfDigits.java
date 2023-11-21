package selenium_course;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the Value: ");
		
		int number = scanner.nextInt();
		 scanner.close();
		 
		 int sum = 0;
	        int originalNumber = Math.abs(number); 
	        
	        while (originalNumber != 0) {
	            sum += originalNumber % 10; 
	            originalNumber /= 10;      
	        }

	        System.out.println("Sum of digits: " + sum);
    
		
	}
}
