package selenium_course;

import java.util.Scanner;

public class GreatestNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		System.out.println("Enter 1st no.:");
		int num1 = sc.nextInt();

		System.out.println("Enter 2nd no.:");
		int num2 =sc.nextInt();

		System.out.println("Enter 3rd no.:");
		int num3 =sc.nextInt();

		int greatestnum = num1;
			
			if (num2 > greatestnum ) {
					greatestnum = num2;
			}
			
			if (num3 > greatestnum) {
			greatestnum= num3;
			}
			
			System.out.println("The greatest number is: "+ greatestnum);
	}

}
