
public class BankAccount {
	
	private String accountName = null;
	private String accountNumber = null;
	private double balance = 0.0;
	
	public BankAccount(String name, String number, double Balance) {
		setName(name);
		setNumber(number);
		setBalance(Balance);		
	}
	
	public void setName(String name) {
		if (name != null && name.length() > 0) {
			accountName = name;
		}
		else {
			accountName = "incognito person";
		}
	}
	
	public String getName() {
		return accountName;
	}
	
	public void setNumber(String number) {
		if (number != null && number.length() > 0) {
			accountNumber = number;
		}
		else {
			accountNumber = "incognito ID";
		}
	}
	
	public String getNumber() {
		return accountNumber;
	}
	
	public void setBalance(double balance) {
		if (balance >= 0.0) {
			this.balance = balance;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void accountDeposit(double deposit) {
		if (deposit > 0) {
			balance += deposit;
		}
		else {
			System.out.println("You cannot deposit negative or zero number. Please choose w(withdraw).");
		}
	}
	
	public void accountWithdraw(double withdraw) {
		if (withdraw <= 0) {
			System.out.println("You cannot withdraw negative or zero number. Please choose d(deposit).");
		}
		else if (withdraw <= balance) {
			balance -= withdraw;
		}
		else {
			System.out.println("You cannot withdraw more than you have.");
		}
	}
	
}
