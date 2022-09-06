package section6;

import java.util.Scanner;

public class PizzaDelivery {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("How many pizza toppings do you want?");
	int numTop = scan.nextInt();
	String[] toppings = new String[numTop];
	System.out.println("Great, enter each topping.");
	
	scan.nextLine();
	for(int i = 0; i < toppings.length; i++) {
		toppings[i] = scan.nextLine();
		
	} 
	System.out.println();
	System.out.println("Thank you! Here are the toppings you ordered");
	for (int j = 0; j < toppings.length; j++) {
		 System.out.println(j + ". " + toppings[j]);
	}
	
	System.out.println("\nPress Enter to confirm your order.");
	scan.nextLine();
	System.out.println("Great, a driver is on the way!");
	
	
	
	
	
	
	
	
	
	
	
	scan.close();
	}

}
