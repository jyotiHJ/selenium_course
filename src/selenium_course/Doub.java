package selenium_course;

//a Java program that read a number and display the square, cube, and fourth power


import java.util.Scanner;

public class Doub {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input: ");


		double num= sc.nextInt();

		sc.close();

		//		       int result= num*num;
		//		       System.out.println("Square: "+ result);
		//		       
		//		       int result1=num*num*num;
		//		       System.out.println("Cube: "+ result1);
		//		       
		//		       int result2=num*num*num*num;
		//		       System.out.println("fourth power: "+ result2);

		//Using math class

		double square = Math.pow(num, 2);
		System.out.println("Square: " + square);

		double cube = Math.pow(num, 3);
		System.out.println("Cube: " + cube);

		double fourthPower = Math.pow(num, 4);
		System.out.println("Fourth Power : " + fourthPower);

	}
}





