package loops;

import java.util.Scanner;

public class sumVowels {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("Please write a word: ");

		String word = scan.nextLine();
		int sum = 0;

		for (int i = 0; i< word.length(); i++) {
			char symbol = word.charAt(i);
			switch (symbol) {
			case 'a':
				sum += 1 ;
				break;
			case 'e':
				sum += 2 ;
				break;
			case 'i':
				sum += 3 ;
				break;
			case 'o':
				sum += 4 ;
				break;
			case 'u':
				sum += 5 ;
				break;
			default:
				break;
			}
		}
		System.out.printf("The sum is: %d.", sum);
	}
}

