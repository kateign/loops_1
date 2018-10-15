package loops;

import java.util.Scanner;

public class mathPower {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a number: ");
		int number = Integer.parseInt(scan.nextLine());
		int base = 2;

		for (int i = 0; i<=number; i+=2) {
			System.out.printf("%.0f", Math.pow(base,i));
			System.out.println();
		}

	}

}
