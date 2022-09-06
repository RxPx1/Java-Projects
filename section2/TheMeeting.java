package section2;

public class TheMeeting {

	public static void main(String[] args) {
		
		
		double sales = 24309.65;
		double profit = 18562.18;
		double refunds = 688.78;
		double shippingCost = 1233.57;
		
		System.out.println("This month, we made " + ((int)sales) + " in sales.");
		System.out.println("Factoring in costs, we made " + ((int) profit) + " in profits");
		System.out.println("The refunds are at a low " + ((int)refunds) + ". This is a good sign!");
		System.out.println("Shipping costs were high. We paid " + ((int)shippingCost) + "in shipping.");

	}

}
