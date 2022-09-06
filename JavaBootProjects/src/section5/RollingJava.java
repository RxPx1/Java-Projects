package section5;

import java.util.Scanner;

public class RollingJava {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rolled = rollDice();
		//6 game stops
		//4 nothing happens
		//anything else 1 point
		//must get 3 points before the end of the game.
		System.out.println("Let's Play Rolling Java. Press Enter to Start\n");
		scan.nextLine();
		System.out.println("Great, here are the rules:\n");
		System.out.println("If you roll a 6 the game stops!");
		System.out.println("If you roll a 4 nothing happens");
		System.out.println("Otherwise, you get 1 point per roll\n");
		System.out.println("You must collect at least 3 points to win. Press Enter to Roll:\n");
		System.out.println();
		System.out.println("Press Enter to start.....");
		scan.nextLine();
//		rollDice();
//		System.out.println("You rolled a: " + rolled);
		
		int i = 0;
		while(rolled == 4) {
			System.out.println("You rolled a 4. You get Zero Points. Keep Rolling.\n");
			i +=0;
			scan.nextLine();
			rolled = rollDice();
			continue;
		} 	while(rolled == 1) {
			System.out.println("You rolled a 1. You get One Points. Keep Rolling.\n");
			i += 1;
			scan.nextLine();
			rolled = rollDice();
			continue;
		} 	while(rolled == 2) {
			System.out.println("You rolled a 2. You get One Points. Keep Rolling.\n");
			i += 1;
			scan.nextLine();
			rolled = rollDice();
			continue;
		} 	while(rolled == 3) {
			System.out.println("You rolled a 3. You get One Points. Keep Rolling.\n");
			i += 1;
			scan.nextLine();
			rolled = rollDice();
			continue;
		} 	while(rolled == 5) {
			System.out.println("You rolled a 5. You get One Points. Keep Rolling.\n");
			i += 1;
			scan.nextLine();
			rolled = rollDice();
			continue;
		} 	while(rolled == 6) {
			System.out.println("You rolled a 6\n");
			break;
		} System.out.println("OOPS 6 means - Game over!\n");
			System.out.println("You score is: " + i + "\n");
			
			if (i >= 3) {
				System.out.println("Wow, that's lucky. You win!");
			} else {
				System.out.println("Tough Luck, you lose :(");
			}
		
		
		 
		scan.close();
	}
	public static int rollDice() {
		int randomNum = (int) (Math.random() * (6) + 1);
		return randomNum;
	}
}
