package section5;

import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("I chose a number between 1 and 5. Try to guess it: ");
		int num = scan.nextInt();
		
		int guess = 0;
		
		while (guess != num) {
			
			System.out.print("Guess again: ");
			scan.nextInt();
			guess = (int)(Math.random() * ((5 - 1) + 1) + 1);
		}
			System.out.println("You Got It!");
			
			
			scan.close();
			
	}
			
}
