package section2;

public class Variables {

	public static void main(String[] args) {
		String Gryffindor = " points for Gryffindor";
		int points = 0;
		System.out.println( points + Gryffindor);
		System.out.println("Harry was caught wandering the halls. -50 points for Gryffindor");
		points -= 50;
		System.out.println( points + Gryffindor);
		System.out.println("Harry was being cheeky in class. -3 points for Gryffindor");
		points -= 3;
		System.out.println( points + Gryffindor);
		System.out.println("Hermine got full marks on Lockhart's quiz. 30 points for Gryffindor");
		points += 30;
		System.out.println( points + Gryffindor);
		System.out.println("Ron won the underground chess game. 100 points for Gryffindor");
		points += 100;
		System.out.println( points + Gryffindor);
		System.out.println("Harry defeated Quirrell. 60 points for Gryffindor");
		points += 60;
		System.out.println( points + Gryffindor);
	}

}
