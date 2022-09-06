package section5;

import java.util.Scanner;

public class Pokerito {

	public static void main(String[] args) {
		// Dealer gives you one card
		// and computer one card
		// Dealer will draw five cards (the river)
		// Player with most matches wins... if matches are equal everyone wins
		Scanner scan = new Scanner(System.in);
		System.out.println("Let's play Pokerito. Press Enter to play...");
		scan.nextLine();
		System.out.println("It's like Poker, but a lot simpler.");
		System.out.println();
		System.out.println("-There are two players, you and the computer.");
		System.out.println("-The dealer will give each player one card.");
		System.out.println("-Then, the dealer will draw five cards (the river)");
		System.out.println("-The player with the most river matches wins!");
		System.out.println("-If the matches are equal, everyone's a winner!");
		System.out.println();
		System.out.println("Ready? Press Enter to Play!!");
		scan.nextLine();
		
		String yourCard = randomCard();
		String computerCard = randomCard();
		
		System.out.println("Here is your card:");
		System.out.println(yourCard);
		System.out.println();
		
		System.out.println("Here is the computer's card:");
		System.out.println(computerCard);
		System.out.println();
		
		int yourMatches = 0;
		int computerMatches = 0;
		
		System.out.println("Now, the dealer will draw five cards. Press Enter to continue...");
//		scan.nextLine();
		
		for(int i = 1; i <= 5; i++) {
			scan.nextLine();
			String draw = randomCard();
			System.out.println("Card " + i);
			System.out.println(draw);
			
			if(yourCard.equals(draw)) {
				yourMatches++;
			}
			if(computerCard.equals(draw)) {
				computerMatches++;
			}
		}
		
		System.out.println("Your number of matches: " + yourMatches);
		System.out.println();
		System.out.println("Computer number of matches: " + computerMatches);
		System.out.println();
		
		if(yourMatches > computerMatches) {
			System.out.println("You Win!!");
		} else if (computerMatches > yourMatches) {
			System.out.println("Computer Wins!!");
		} else {
			System.out.println("It's a Tie!!");
		}
		
		
		
		
		
		scan.close();
	}

	public static String randomCard(){
		double random = Math.random() * 13;
		random += 1;
		int randomInt = (int)random;
		
		switch (randomInt) {
		case 1:  return	"   _____\n"+
		        		"  |A _  |\n"+ 
		        		"  | ( ) |\n"+
		        		"  |(_'_)|\n"+
		        		"  |  |  |\n"+
		        		"  |____V|\n";
			
	
		case 2: return 	"   _____\n"+              
						"  |2    |\n"+ 
						"  |  o  |\n"+
						"  |     |\n"+
						"  |  o  |\n"+
						"  |____Z|\n";
				
	
		case 3: return  "   _____\n" +
                		"  |3    |\n"+
                		"  | o o |\n"+
                		"  |     |\n"+
                		"  |  o  |\n"+
                		"  |____E|\n";
						


		case 4: return  "   _____\n" +
                		"  |4    |\n"+
                		"  | o o |\n"+
                		"  |     |\n"+
                		"  | o o |\n"+
                		"  |____h|\n";
				 		
	
		case 5: return 	"   _____ \n" +
                		"  |5    |\n" +
                		"  | o o |\n" +
                		"  |  o  |\n" +
                		"  | o o |\n" +
                		"  |____S|\n";
							

		case 6: return  "   _____ \n" +
                		"  |6    |\n" +
                		"  | o o |\n" +
                		"  | o o |\n" +
                		"  | o o |\n" +
                		"  |____6|\n";
				 			
	
		case 7: return  "   _____ \n" +
                		"  |7    |\n" +
                		"  | o o |\n" +
                		"  |o o o|\n" +
                		"  | o o |\n" +
                		"  |____7|\n";
							
		
		case 8: return  "   _____ \n" +
                		"  |8    |\n" +
                		"  |o o o|\n" +
                		"  | o o |\n" +
                		"  |o o o|\n" +
                		"  |____8|\n";
				  			
	
		case 9: return  "   _____ \n" +
                		"  |9    |\n" +
                		"  |o o o|\n" +
                		"  |o o o|\n" +
                		"  |o o o|\n" +
                		"  |____9|\n";
							
	
		case 10: return  	"   _____ \n" +
                			"  |10  o|\n" +
                			"  |o o o|\n" +
                			"  |o o o|\n" +
                			"  |o o o|\n" +
                			"  |___10|\n";
						
		
		case 11: return  	"   _____\n" +
                			"  |J  ww|\n"+ 
                			"  | o {)|\n"+ 
                			"  |o o% |\n"+ 
                			"  | | % |\n"+ 
                			"  |__%%[|\n";
		  		
		case 12: return  	"   _____\n" +
                			"  |Q  ww|\n"+ 
                			"  | o {(|\n"+ 
                			"  |o o%%|\n"+ 
                			"  | |%%%|\n"+ 
                			"  |_%%%O|\n";
			     			
		

		case 13: return  	"   _____\n" +
                			"  |K  WW|\n"+ 
                			"  | o {)|\n"+ 
                			"  |o o%%|\n"+ 
                			"  | |%%%|\n"+ 
                			"  |_%%%>|\n";		
		
		default: return "This shouldnt get called";
		}
	}
		

		
}

