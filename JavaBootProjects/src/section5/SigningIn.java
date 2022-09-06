package section5;

import java.util.Scanner;

public class SigningIn {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Javagram! Sign in below: ");
		System.out.println();
		System.out.print("Username: ");
		String name = scan.nextLine();
		System.out.print("Password: ");
		String passWrd = scan.nextLine();
		
		
		while(!name.equals("RxPx") || !passWrd.equals("Java<3")){
			System.out.println();
			System.out.println("Incorrect, please try again!");
			System.out.println();
			System.out.print("Username: ");
			name = scan.nextLine();
			System.out.print("Password: ");
			passWrd = scan.nextLine();
			
		}
			System.out.println();
			System.out.println("Sign In Successful. Welcome!");
			
			
			scan.close();
	}

}
