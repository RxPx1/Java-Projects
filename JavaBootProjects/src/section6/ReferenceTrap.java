package section6;

import java.util.Arrays;

public class ReferenceTrap {

	public static void main(String[] args) {
		
		
		String[] staffLastYear = {"Tommy", "Parker", "Ellie"};
//		String[] staffThisYear = staffLastYear;  /// never set an array = to an array!!!
//		staffThisYear[1] = "Abby";
//		
		
//		String[] staffThisYear = new String[3];   /// Use a loop to avoid a the reference trap!!!!
//		for(int i = 0; i < staffThisYear.length; i++) {
//			staffThisYear[i] = staffLastYear[i];
//		}
//		
//		staffThisYear[1] = "Abby";
//		
		String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length); 
		// !!!!  This is the best method and least amount of code for copying one array to another !!!!
		
		
		System.out.println(Arrays.toString(staffLastYear));
		System.out.println(Arrays.toString(staffThisYear));

	}

}
