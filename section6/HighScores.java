package section6;

public class HighScores {

	public static void main(String[] args) {

		System.out.println();
		System.out.println();
		int[] score = new int[10];
		for (int i = 0; i < score.length; i++) {
			score[i] = (int) (Math.random() * 50000);
			System.out.print(score[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println();

		int highScore = score[0];
		for (int j = 0; j < score.length; j++) {
			if (score[j] > highScore) {
				highScore = score[j];

				System.out.println("The highest score is- " + highScore + ". Give that man a cookie!");
				System.out.println("It's the person in seat: " + j + ". Give them a cookie!");
				break;
			}
			
		
			
		}

	}

}
