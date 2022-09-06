package section3;

public class Boolean {

	public static void main(String[] args) {
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println(bool1);
		System.out.println(bool2);
		
		int chemistryGrade = 95;
		int biologyGrade = 75;
		
		System.out.println(biologyGrade > chemistryGrade);
		
		double sales = 37.55;
		double costs = 5.55;
		
		System.out.println(sales > costs);
		
		String sentence = "I love this course.";
		String sentence2 = "I love this course.";
		
		System.out.println(sentence.equals(sentence2));
		System.out.println(!sentence.equals(sentence2));
	}

}
