//Justin Yeh

import java.util.Scanner;

public class CoinFlip {

	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		System.out.println("This program will simulate flipping a fair coin.");
		System.out.print("How many times would you like the coin to be flipped? ");
		int flips = kb.nextInt();
		int heads = 0;
		int tails = 0;
		System.out.println("Here is the sequence of coin flips: ");
		
		for (int i = 1; i <= flips; i++) {
			double face = Math.random();
			if (face < 0.5) {
				System.out.print("H");
				heads++;
			} else {
				System.out.print("T");
				tails++;
			}
		}
		
		System.out.println("\nThere were " + heads + " heads and " + tails + " tails.");
		
	}

}
