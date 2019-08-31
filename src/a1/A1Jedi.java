package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		process(scan);
		
	}
	
	public static void process(Scanner scan) {
		
		int num_items_store = scan.nextInt();
		String item_name[] = new String[num_items_store];
		int customer_count[] = new int[num_items_store];
		int total_bought[] = new int[num_items_store];
		for (int b = 0; b < num_items_store; b++) {
			item_name[b] = scan.next();
			double item_price = scan.nextDouble();
		}
		int num_of_cust = scan.nextInt(); 
		
		for(int d = 0; d < num_of_cust; d++) {
			String first_name = scan.next();
			String last_name = scan.next();
			int total_items_each_bought = scan.nextInt();
			
			boolean boolean_duplicate[] = new boolean[num_items_store];
			
			for (int i = 0; i < total_items_each_bought; i++) {
				int num_each_indiv_item_bought = scan.nextInt();
				String indiv_item_name = scan.next();
				int index = findindx(indiv_item_name, item_name);
				boolean_duplicate[index] = true;
				total_bought[index] += num_each_indiv_item_bought;
			}
			
			for(int i = 0; i < num_items_store; i++) {
				if(boolean_duplicate[i] == true) {
					customer_count[i] += 1;
				}
			}
			
		}
		for(int c = 0; c < item_name.length; c++) {
			if(total_bought[c] > 0) {
				System.out.println(customer_count[c] + " customers bought " + total_bought[c] + " " + item_name[c]);
			} else {
				System.out.println("No customers bought " + item_name[c]);
			}
		}
		
	}
	
	public static int findindx(String item_name, String[] names) {
		for(int i = 0; i < names.length; i++) {
			if(names[i].equals(item_name)) {
				return i;
			}
		}
		return 1;
	}
}
