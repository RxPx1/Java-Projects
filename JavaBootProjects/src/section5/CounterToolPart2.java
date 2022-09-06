package section5;

import java.util.Scanner;

public class CounterToolPart2 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("I hear you like to count by threes");
		System.out.println("No okay then what do you want to count by");
		System.out.println();
		System.out.print("1. Pick a number to count by: ");
		int numBy = scan.nextInt();
		System.out.print("2. Pick a number to start counting from: ");
		int numStart = scan.nextInt();
		System.out.print("3. Pick a number to count to: ");
		int numTo = scan.nextInt();
		
		for(int i = numStart; i <= numTo; i += numBy) {
			System.out.print(i + " ");
		}
		
		scan.close();

	}

}
