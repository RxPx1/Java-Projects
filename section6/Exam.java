package section6;

public class Exam {

	public static void main(String[] args) {
		
		String[] seats = {"Harry", "Neville", "Ron", "Hermione", "Seamus"};
		System.out.println("It's time to take your fifth year exams. Please take your seats");
		System.out.println(seats[0] + ", you will take seat 0");
		System.out.println(seats[1] + ", you will take seat 1");
		System.out.println(seats[2] + ", you will take seat 2");
		System.out.println(seats[3] + ", you will take seat 3");
		System.out.println(seats[4] + ", you will take seat 4");
		
		System.out.println();
		
		String[] seats2 = {"Malfoy", "Crabbe", "Goyle", "Pansy", "Dean"};
		
		for(int i = 0; i < seats2.length; i++) {
			System.out.println(seats2[i] + ", you will take seat " + i);
		}

	}

}
