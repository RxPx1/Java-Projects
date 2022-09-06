package section6;

public class RingAnnouncer {

	public static void main(String[] args) {
		String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};
		int wins = 0;
		int losses = 0;
		
		for (int i = 0; i < record.length; i++) {
			if (record[i].equals("WIN")) {
				wins += 1;
			} else {
				losses +=1;
			}
		}
			int totalWins = wins;
			int totalLosses = losses;
		
			System.out.println("\nWith a professional record of " + totalWins + " Wins and " + totalLosses
					+ " losses. \nHe is the pride of oracle: Java Fury!");
		

	}

}
