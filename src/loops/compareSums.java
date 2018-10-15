package loops;

import java.util.Scanner;

public class compareSums {

	public static void main(String[] args) {

		int sum1 = 0;
		int sum2 = 0;
		

		Scanner scan = new Scanner (System.in);

		System.out.println("Please write how many numbers you will enter: ");
		int howManyNumbers = Integer.parseInt(scan.nextLine());

		int [] Array1 = new int [howManyNumbers];
		int [] Array2 = new int [howManyNumbers];
		
		for (int i = 0; i < howManyNumbers; i++) {
			System.out.printf("Please write number: %n");
			Array1[i] = Integer.parseInt (scan.nextLine());
			sum1 += Array1[i];
		}

		for (int i = 0; i < howManyNumbers; i++) {
			System.out.printf("Please write number: %n");
			Array2[i] = Integer.parseInt (scan.nextLine());
			sum2 += Array2[i];
		}

		if (sum1 == sum2) {
			System.out.println("The sums are equal.");
		}else {
			System.out.printf("The sums are not equal. The difference is %d.", Math.abs(sum1-sum2));
		}
	}
}
