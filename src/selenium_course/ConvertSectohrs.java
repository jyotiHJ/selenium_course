package selenium_course;

import java.util.Scanner;

public class ConvertSectohrs {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number in seconds:");
		int totalSeconds = scanner.nextInt();
		scanner.close();
		
		int hours =totalSeconds/3600;
		int minutes =  (totalSeconds%3600)/60;
		int seconds = totalSeconds%60; 	
		
System.out.println("Converted time:" +hours+ " hours " +minutes+ " minutes " +seconds+ " seconds ");
	}

}
