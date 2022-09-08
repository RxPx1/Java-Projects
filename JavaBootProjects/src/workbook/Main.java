package workbook;

import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
	
		Person passenger1 = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);
		passenger1.chooseSeat();
		
		Person passenger2 = new Person(passenger1);
		passenger2.chooseSeat();
		
		passenger2.setName("Jad Slim");
		
		
		System.out.println("Name: " + passenger1.getName() + "\n" + "Nationality: " + passenger1.getNationality() + "\n" + "Date of birth: " + passenger1.getDateOfBirth() +"\n" + "Seat number: " + passenger1.getSeatNumber());
		
		System.out.println();
		
		if (passenger1.applyPassport() == true) {
			System.out.println("Congratulations " + passenger1.getName() + ". Your passport was approved!");
		} else {
			System.out.println("We're sorry " + passenger1.getName() + ". We cannot process your application.");
		}
		System.out.println();
		System.out.println("Name: " + passenger2.getName() + "\n" + "Nationality: " + passenger2.getNationality() + "\n" + "Date of birth: " + passenger2.getDateOfBirth() +"\n" + "Seat number: " + passenger2.getSeatNumber());
		System.out.println();
		
		if (passenger2.applyPassport() == true) {
			System.out.println("Congratulations " + passenger2.getName() + ". Your passport was approved!");
		} else {
			System.out.println("We're sorry " + passenger2.getName() + ". We cannot process your application.");
		}
		
		
		
	

	}

}
