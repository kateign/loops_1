package loops;

import java.util.Scanner;

public class Row {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a number: ");
		int number = Integer.parseInt(scan.nextLine());
		
		//Variant1
		for (int i = 1; i <=number; i=i*2+1) {
			System.out.print(i + ", ");
		}
		
		System.out.println();
		
		//Variant2
		int j = 1;
		while (j<=number) {
			System.out.print(j + ", ");
			j=j*2+1;
		}
		System.out.println();
		
		//Variant3
		int k = 1;
		do {
			System.out.print(k + ", ");
			k=k*2+1;
		}while (k<=number);
	}
	}
