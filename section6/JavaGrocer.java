package section6;

import java.util.Scanner;

public class JavaGrocer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Java Grocers.");
		System.out.println("We have - apples, bananas, candy, chocolate, coffee, & tea!");
		System.out.println("What can I help you find?");
		String custNeed = scan.nextLine();
		
		
		
		String[] aisles = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
		
		for(int i = 0; i < aisles.length; i++) {
			if(aisles[i].equals(custNeed)) {
				System.out.println("\nWe have that in aisle: " + i );
				break;
			}
			
		}
		
		
		
		scan.close();
	}

}
