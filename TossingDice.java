//Justin Yeh

import java.util.Random;
import java.util.Scanner;

public class TossingDice {

	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		System.out.println("This program will simulate tossing a pair of dice.");
		System.out.print("How many times would you like the dice to be tossed? ");
		int tosses = kb.nextInt();
		System.out.println("Here is the sequence of sums, one for each toss: ");
		int sum = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		int ten = 0;
		int eleven = 0;
		int twelve = 0;
		
		for (int i = 1; i <= tosses; i++) {
			Random r = new Random();
			int rollOne = r.nextInt(6) + 1;
			int rollTwo = r.nextInt(6) + 1;
			sum = rollOne + rollTwo;
			System.out.print(sum + " ");	
			
			if (sum == 2) 
				two++;
			if (sum == 3)
				three++;
			if (sum == 4)
				four++;
			if (sum == 5)
				five++;
			if (sum == 6)
				six++;
			if (sum == 7)
				seven++;
			if (sum == 8)
				eight++;	
			if (sum == 9)
				nine++;
			if (sum == 10)
				ten++;
			if (sum == 11)
				eleven++;
			if (sum == 12)
				twelve++;
		}

		System.out.print("\n2: ");
		for (int i = 1; i <= two; i++)
			System.out.print("*");
		
		System.out.print("\n3: ");
		for (int i = 1; i <= three; i++)
			System.out.print("*");
		
		System.out.print("\n4: ");
		for (int i = 1; i <= four; i++)
			System.out.print("*");
		
		System.out.print("\n5: ");
		for (int i = 1; i <= five; i++)
			System.out.print("*");
		
		System.out.print("\n6: ");
		for (int i = 1; i <= six; i++)
			System.out.print("*");
		
		System.out.print("\n7: ");
		for (int i = 1; i <= seven; i++)
			System.out.print("*");
		
		System.out.print("\n8: ");
		for (int i = 1; i <= eight; i++)
			System.out.print("*");
		
		System.out.print("\n9: ");
		for (int i = 1; i <= nine; i++)
			System.out.print("*");
		
		System.out.print("\n10: ");
		for (int i = 1; i <= ten; i++)
			System.out.print("*");
		
		System.out.print("\n11: ");
		for (int i = 1; i <= eleven; i++)
			System.out.print("*");
		
		System.out.print("\n12: ");
		for (int i = 1; i <= twelve; i++)
			System.out.print("*");
		
	}

}
