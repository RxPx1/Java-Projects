package section5;

import java.util.Scanner;

public class CountingTool {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Hi There! Choose a number to count to: ");
		int num = scan.nextInt();
		
		for(int i = 0; i <= num; i++) {
			System.out.print(i+ " ");
		}
		
		scan.close();
	}

}
