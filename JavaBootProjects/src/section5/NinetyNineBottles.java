package section5;

public class NinetyNineBottles {

	public static void main(String[] args) {
		sing();

	}

	
	public static void sing() {
		
		for (int i = 99; i >= 1; i--) {
		System.out.println(i + " bottles of beer on the wall, " + i 
				+ " bottles of beer! take one down, pass it around " + (i - 1) 
				+ ", bottle of beer on the wall!");
		}
	}
	
	
	
}

