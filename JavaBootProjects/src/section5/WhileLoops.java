package section5;

public class WhileLoops {

	public static void main(String[] args) {
		
//		int number = 25;
//		while(number <= 30) {
//			System.out.println(number);
//			number++;
//		}
//		for(int number = 25; number <= 30; number++) {
//			System.out.println(number);
//		}
		
		double choice= 0.01;
		double guess = 0.99;
		
		while(guess > choice) {
			guess = Math.random();
			System.out.println(guess);
		}

		
	}

}


// RUN A FOR LOOP - WHEN YOU KNOW HOW MANY TIMES YOU NEED TO RUN THE CODE
//RUN A WHILE LOOP - WHEN YOU DO NOT KNOW!!! HOW MANY TIMES YOU HAVE TO RUN THE CODE!!!!