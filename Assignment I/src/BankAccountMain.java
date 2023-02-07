import java.util.Scanner;

public class BankAccountMain {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String [] args) {
		System.out.println("Welcome to our bank!");
		BankAccount initial = readAccount();
		printAccount(initial);
		
		System.out.println("Please choose the service you want (d, w): ");
		String service = scanner.nextLine();
		if (service.equals("d")) {
			System.out.println("Please enter the amount you want to deposit: ");
			double deposit = scanner.nextDouble();
			scanner.nextLine();
			initial.accountDeposit(deposit);
			BankAccount after = new BankAccount(initial.getName(), initial.getNumber(), initial.getBalance());
			printAccount(after);
		}
		else if (service.equals("w")) {
			System.out.println("Please enter the amount you want to withdraw: ");
			double withdraw = scanner.nextDouble();
			scanner.nextLine();
			initial.accountWithdraw(withdraw);
			BankAccount after = new BankAccount(initial.getName(), initial.getNumber(), initial.getBalance());
			printAccount(after);
		}
		else {
			System.out.println("Thank you for visit!");
		}
		scanner.close();
	}
	
	public static BankAccount readAccount() {
		System.out.println("Please enter your name: ");
		String accountName = scanner.nextLine();
		
		System.out.println("Please enter your account number: ");
		String accountNumber = scanner.nextLine();
		
		System.out.println("Please enter your current balance: ");
		double balance = scanner.nextDouble();
		scanner.nextLine();
		
		return new BankAccount(accountName, accountNumber, balance);
	}
	
	public static void printAccount(BankAccount account) {
		System.out.println("User: " + account.getName() + "\nID: " + account.getNumber() + "\nBalance: " + account.getBalance());
	}
	
}
