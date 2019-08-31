package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		process(scan);
		
	}
	
	public static void process(Scanner scan) {

		int count = scan.nextInt();

		// getting names of customers and how much they bought
		for (int i = 0; i < count; i++) {
			String first = scan.next();
			String last = scan.next();
			int items = scan.nextInt();
			
			double sum = 0; 
			
			// calculating bill for each customer
			for (int j = 0; j < items; j++) {
				int quantity = scan.nextInt();
				String name = scan.next();
				double price = scan.nextDouble();
				sum = sum + (quantity * price);
			}
			
			String answer = String.format("%,.2f",sum);
			System.out.println(first.substring(0, 1) + ". " + last + ": " + answer);
		}
		
	
	}
}

