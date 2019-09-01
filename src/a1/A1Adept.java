package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		process(scan);
		
	}
	
	public static void process(Scanner scan) {
		int storeItems = scan.nextInt();
		String itemName[] = new String[storeItems];
		Double itemPrice[] = new Double[storeItems];
		
		// getting names and prices of items
		for(int i = 0; i < storeItems; i++) {
			itemName[i] = scan.next();
			itemPrice[i] = scan.nextDouble();
		}
		
		int customerNum = scan.nextInt();
		String customers[] = new String[customerNum];
		Double customerTotal[] = new Double[customerNum];
		
		for(int i = 0; i < customerNum; i++) {
			// getting name of each customer and how many items they bought
			String first = scan.next();
			String last = scan.next();
			customers[i] = first + " " + last;
			double total = 0;
			int itemsNumber = scan.nextInt();
			
			// getting how much of each item they bought
			for(int j = 0; j < itemsNumber; j++) {
				int item_num = scan.nextInt();
				String item = scan.next();
				
				// getting prices of items and calculating total 
				for(int x = 0; x < storeItems; x++) {
					if(item.equals(itemName[x])) {
						double price = itemPrice[x];
						price = price * item_num;
						total = total + price;
					}
				}
			}
			customerTotal[i] = total;
		}
		
		int maxCount = 0;
		int minCount = 0;
		double max = customerTotal[0];
		double min = customerTotal[0];
		double grandTotal = customerTotal[0];
		
		for(int y = 1; y < customerNum; y++) {
			if(customerTotal[y] > max) {
				max = customerTotal[y];
				maxCount = y;
			}
			if(customerTotal[y] < min) {
				min = customerTotal[y];
				minCount = y;
			}
			grandTotal += customerTotal[y];
		}
		
		double average = grandTotal/customerNum;
		String firstAnswer = String.format("%,.2f",customerTotal[maxCount]);
		String secondAnswer = String.format("%,.2f",customerTotal[minCount]);
		String thirdAnswer = String.format("%,.2f",average);
		
		// printing out answers
		System.out.println("Biggest: " + customers[maxCount] + " (" + firstAnswer + ")" );
		System.out.println("Smallest: " + customers[minCount] + " (" + secondAnswer + ")" );
		System.out.println("Average: " + thirdAnswer);
	}
}
