package loops;

import java.util.Scanner;

public class readFromOneToHundred {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int number = 0;
		
		while (number < 1 || number > 100) {
			System.out.println("Please enter a number: ");
			number = Integer.parseInt(scan.nextLine());
			
			if (number < 1 || number > 100) {
				System.out.printf("Number %d is invalid. %n", number);
			}
		}
		System.out.printf("The number is %d. ", number);
		
		
	}

}
