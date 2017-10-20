//Justin Yeh

import java.util.Scanner;

public class AsteriskDiamond {

	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		System.out.print("Enter any whole number: ");
		int length = kb.nextInt();

		for (int i = 1; i <= length; i++) {
			for (int j = 1; j <= length - i; j++)
				System.out.print(" ");
			for (int j = 0; j < (2 * i) - 1; j++)
				System.out.print("*");
			System.out.println();
		}

		for (int i = length - 1; i > 0; i--) { 
			for (int j = 1; j <= length - i; j++)
				System.out.print(" ");
			for (int j = 0; j < (2 * i) - 1; j++)
				System.out.print("*");
			System.out.println(); 
		}
		
	}
}
