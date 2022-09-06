package section2;

import java.util.Scanner;

public class Chatbot {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Hello. What is your name?");
		String name = scan.nextLine();

		System.out.println("Hi " + name + "! I'm Javabot. Where are you from?");
		String location = scan.nextLine();

		System.out.println("I hear it's beautiful at " + location + "! I'm from a place called Oracle.");

		System.out.println("\nHow old are you?");
		int age = scan.nextInt();

		System.out.println("So you're " + age + ", cool! I'm 400 years old.");
		System.out.println("This means I'm " + (400 / age) + " times older than you.");

		System.out.println("\nEnough about me. What's your favorite language? (Just do not say Python)");
		String language2 = scan.nextLine();
		String language = scan.nextLine();

		System.out.println(" ");
		System.out.println(
				language + ", that's great! Nice Chatting with you " + name + ". I have to log off now. See ya!");
	}

}
