package selenium_course;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		
		int number = scanner.nextInt();
		
		scanner.close();
		
		{
		if (number > 0) {
			System.out.println("The number is positive.");
		} else  {
			System.out.println("The number is negative.");
		} 
	
		}
}
	
}