package selenium_course;

import java.util.Scanner;

public class FactorsCode {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number:");		
		int num = scanner.nextInt();
		
		System.out.println("Factors of Number "+num+" are..");
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
			  System.out.println(i);
			}
		}

	}


}
