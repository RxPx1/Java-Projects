package section6;



public class Receipt {

	public static void main(String[] args) {
		String[] apples = {"Gala","Granny Smith", "Macintosh"};
		double[] applePrices = {1.99, 1.49, 1.29};
		
		System.out.println("Here's your receipt: ");
		System.out.println();
		
		for(int i = 0; i < apples.length; i++) {
			System.out.println(apples[i] + ": $" + applePrices[i]);
			}

		double[] prices = {1.99, 2.99, 3.99, 4.99};
		double[] afterTax = new double[4];
		
		for(int j = 0; j < prices.length; j++) {
			afterTax[j] = prices[j] + (.13 * prices[j]);
			System.out.println();
			System.out.println("The orginal prices are: $" + String.format("%.2f", prices[j]));
			System.out.println("The prices after tax are: $" + String.format("%.2f", afterTax[j]));
			System.out.println();
		}
		
		
	}

}
