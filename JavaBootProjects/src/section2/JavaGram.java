package section2;

import java.util.Scanner;

public class JavaGram {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to JavaGram please create your account.");
		
		System.out.println("\nWhat is your first name?");
		String firstName = scan.nextLine();
		
		System.out.println("\nWhat is your last name?");
		String lastName = scan.nextLine();
		
		System.out.println("\nHow old are you?");
		int age = scan.nextInt();
		
		System.out.println("\nMake a username: ");
		String userName1 = scan.nextLine();
		String userName = scan.nextLine();
		
		System.out.println("\nWhat city do you live in?");
		String city = scan.nextLine();
		
		System.out.println("\nWhat country is that in?");
		String country = scan.nextLine();
		
		System.out.println("\n\nHere is the infomration you entered.");
		System.out.println("\nFirst Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Age: " + age);
		System.out.println("User Name: " + userName);
		System.out.println("City: " + city);
		System.out.println("Country: " + country);
		
		scan.close();
	}

}
