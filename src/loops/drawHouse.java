package loops;

import java.util.Scanner;

public class drawHouse {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.print("Please enter a number: ");
		double number = Double.parseDouble(scan.nextLine());
		double halfNumber = number/2; 

		double topHalf = Math.ceil(halfNumber);
		double bottomHalf = Math.floor(halfNumber);

		for (int i = 1; i<= topHalf; i++) {

			if (number%2==0) {
				for (int j = 1; j <= ((number/2)-i); j++) {
					System.out.print("-");
				}
				for (int k = 1; k<= i*2; k++) {
					System.out.print ("*");
				}
				for (int j = 1; j <= ((number/2)-i); j++) {
					System.out.print("-");
				}
				System.out.println("");
			} else {
				for (int j = 1; j <= ((number/2+1)-i); j++) {
					System.out.print("-");
				}
				for (int k = 0; k<= ((i*2)-2); k++) {
					System.out.print ("*");
				}
				for (int j = 1; j <= ((number/2+1)-i); j++) {
					System.out.print("-");
				}
				System.out.println("");
			}
		}

		for (int z = 1; z <= bottomHalf; z++) {
			for (int k = 1; k <= number; k++) {
				if (k == 1 || k == number) {
					System.out.print("|");
				} else {
					System.out.print ("*");
				}
			}
			System.out.println("");
		}
	}
}

