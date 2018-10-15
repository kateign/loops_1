package loops;

import java.util.Scanner;

public class factoriel {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int n = Integer.parseInt(scan.nextLine());
		int factoriel = 1;
//		for (int i = 1; i < n; i++) {
//			factoriel = factoriel*(i+1);
//		}
//		System.out.println(factoriel);
		
//		while (n > 0) {
//			factoriel = factoriel*n;
//			n--;
//		}
//		System.out.println(factoriel);
		
		do {
			factoriel = factoriel*n;
			n--;
		} while (n > 0);
			System.out.println(factoriel);
		
		
	}

}
