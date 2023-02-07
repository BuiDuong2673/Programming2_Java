import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String [] args) {
		System.out.println("Welcome!");
		
		System.out.println("Please enter the journal name: ");
		String journal = scanner.nextLine();
		
		System.out.println("Please enter subscriber name: ");
		String subscriber = scanner.nextLine();
		
		System.out.println("Please enter delivery address: ");
		String address = scanner.nextLine();
		
		System.out.println("Please enter monthly price: ");
		double monthlyPrice = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Please choose between Regular order(r) and Standing order(s), or any other characters to quit: ");
		String order = scanner.nextLine();
		
		if (order.equals("r")) {
			System.out.println("Please enter the subscriber rate (the number of order months): ");
			int rate = scanner.nextInt();
			scanner.nextLine();
			
			Subscription subscription = new RegularSubscription(rate, journal, subscriber, address, monthlyPrice);
			printSubscriptionInvoice(subscription);
		}
		else if (order.equals("s")) {
			System.out.println("Please enter the discount in percent: ");
			int discount = scanner.nextInt();
			scanner.nextLine();
			
			Subscription subscription = new StandingSubscription(discount, journal, subscriber, address, monthlyPrice);
			printSubscriptionInvoice(subscription);
		}
		else {
			System.out.println("Thank you for visit!");
		}
		scanner.close();
	}
	
	public static void printSubscriptionInvoice(Subscription subs) {
		System.out.println(subs.printInvoice());
	}
}
