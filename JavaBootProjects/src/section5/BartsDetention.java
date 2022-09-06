package section5;

import java.util.Scanner;

public class BartsDetention {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hi Bart. I can write lines for you.");
		System.out.println("What do you want me to write");
		
		String writeOut = scan.nextLine();
		
		for(int i = 1; i < 100; i++) {
			System.out.println(i + "." + writeOut);
		}
		
		scan.close();
	}

}
