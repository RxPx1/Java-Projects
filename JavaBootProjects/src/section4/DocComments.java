package section4;

public class DocComments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * Function name: greet
	 * 
	 * 
	 * Inside the function: 
	 * 1. prints 'Hi'
	 */
	public static void great() {
		System.out.println("Hi");
	}
	/**
	 * Function name: printText
	 * 
	 * Inside the function:
	 * 1. prints the name and age in as part of the text.
	 *
	 * @param name (String)
	 * @param age (String)
	 */
	public static void printText(String name, String age) {
		System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
	}
	
	/**
	 * Function name: calculateArea
	 * Inside the function: calculate area by multiplying length and width
	 * 
	 * @param length (double)
	 * @param width (double)
	 * @return (double)
	 */
	
	public static double calculateArea(double length, double width) {
		double area = length * width;
		return area;
	}

}
