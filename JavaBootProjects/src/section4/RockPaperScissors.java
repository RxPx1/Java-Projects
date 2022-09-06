package section4;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = computerChoice();

		System.out.println("Let's play Rock Paper Scissors.");
		System.out.println("");
		System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.");
		System.out.println("");
		System.out.println("Are you ready? Write 'yes' if you are ready!");
		System.out.println(" ");
		
		String ready = scan.nextLine();
		
		
		if (ready.equals("yes")) {
			System.out.println(" ");
			System.out.println("Great!");
			System.out.println("rock -- paper -- scissors, shoot!");
			System.out.println(" ");
			String userAnswer = scan.nextLine();
			System.out.println(" ");
			if (userAnswer.equals("rock")) {
				System.out.println("You Chose: rock");
			} else if (userAnswer.equals("paper")) {
				System.out.println("You Chose: paper");
			} else if (userAnswer.equals("scissors")) {
				System.out.println("You Chose: scissors");
			} else {
				System.out.println("invalid input... Shutting Down....");
				System.exit(0);
			}
			
			System.out.println(" ");
			
			if (str.equals("1")) {
				System.out.println("The Computer Chose: rock");
			} else if (str.equals("2")) {
				System.out.println("The Computer Chose: paper");
			} else if (str.equals("3")) {
				System.out.println("The Computer Chose: scissors");
			}
			
			System.out.println(" ");

			if(userAnswer.equals("rock") && str.equals("1") || userAnswer.equals("paper") && str.equals("2") || userAnswer.equals("scissors") && str.equals("3")) {
				System.out.println("TIE!!!");
			} else if (userAnswer.equals("rock") && str.equals("3") || userAnswer.equals("paper") && str.equals("1") || userAnswer.equals("scissors") && str.equals("2")) {
				System.out.println("You WIN!!!");
			} else {
				System.out.println("Computer WINS, Better luck next time!!!");
			}
			
			
			// print out if they won or lost
		} else {
			System.out.println("Darn, some other time....");
		}
		scan.close();

	}

	public static String computerChoice() {
		int compPick = (int)(Math.random() * ((3 - 1) + 1) + 1);
		String str = String.valueOf(compPick);
		return str;
		
	}
}
