package loops;

import java.util.Scanner;

public class sumEvenOdd {

	public static void main(String[] args) {


		int sumEven = 0;
		int sumOdd = 0;


		Scanner scan = new Scanner (System.in);

		System.out.println("Please write how many numbers you will enter: ");
		int howManyNumbers = Integer.parseInt(scan.nextLine());

		int [] Array = new int [howManyNumbers];

		for (int i = 0; i < howManyNumbers; i++) {
			System.out.printf("Please write number: %n");
			Array[i] = Integer.parseInt (scan.nextLine());
		}

		for (int i = 0; i < howManyNumbers; i+=2) {
			sumEven += Array[i];
		}
		for (int i = 1; i < howManyNumbers; i+=2) {
			sumOdd += Array[i];
		}

		if (sumEven == sumOdd) {
			System.out.println("The sums are equal.");
		}else {
			System.out.printf("The sums are not equal. The difference is %d.", Math.abs(sumEven-sumOdd));
		}
	}
}
