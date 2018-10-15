package loops;

import java.util.Scanner;

public class sumScanNumbers {

	public static void main(String[] args) {

		int howMany = 5;
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		Scanner scan = new Scanner (System.in);

		for (int i = 1; i <= howMany; i++) {
			System.out.printf("Please write a number %d: ", i);
			int number = Integer.parseInt(scan.nextLine());
			sum += number;
			if (max < number) {
				max = number;
			}

			if (min > number) {
				min = number;
			}
		}
		System.out.printf("The sum is %d.%n", sum);
		System.out.printf("The min number is %d.%n", min);
		System.out.printf("The max number is %d.%n", max);
	}
}

