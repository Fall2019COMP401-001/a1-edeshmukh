package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		process(scan);
		
	}
	
	public static void process(Scanner scan) {
		
		int storeItemNum = scan.nextInt();
		String itemName[] = new String[storeItemNum];
		int countCustomer[] = new int[storeItemNum];
		int totalBought[] = new int[storeItemNum];
		for (int b = 0; b < storeItemNum; b++) {
			itemName[b] = scan.next();
			double itemPrice = scan.nextDouble();
		}
		int customerNum = scan.nextInt(); 
		
		for(int d = 0; d < customerNum; d++) {
			String first = scan.next();
			String last = scan.next();
			int totalItemsBought = scan.nextInt();
			
			boolean boolean_duplicate[] = new boolean[storeItemNum];
			
			for (int i = 0; i < totalItemsBought; i++) {
				int individualItemBought = scan.nextInt();
				String indiv_itemName = scan.next();
				int index = findindx(indiv_itemName, itemName);
				boolean_duplicate[index] = true;
				totalBought[index] += individualItemBought;
			}
			
			for(int i = 0; i < storeItemNum; i++) {
				if(boolean_duplicate[i] == true) {
					countCustomer[i] += 1;
				}
			}
			
		}
		for(int c = 0; c < itemName.length; c++) {
			if(totalBought[c] > 0) {
				System.out.println(countCustomer[c] + " customers bought " + totalBought[c] + " " + itemName[c]);
			} else {
				System.out.println("No customers bought " + itemName[c]);
			}
		}
		
	}
	
	public static int findindx(String itemName, String[] names) {
		for(int i = 0; i < names.length; i++) {
			if(names[i].equals(itemName)) {
				return i;
			}
		}
		return 1;
	}
}
