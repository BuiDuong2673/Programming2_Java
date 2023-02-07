
public class Subscription {

	private String journal = null;
	private String subscriber = null;
	private String address = null;
	private double monthlyPrice = 0.0;
	
	public Subscription(String journalName, String subscriberName, String deliverAddress, double monthPrice) {
		setJournal(journalName);
		setSubscriber(subscriberName);
		setAddress(deliverAddress);
		setMonthlyPrice(monthPrice);
	}
	
	public String getJournal() {
		return journal;
	}
	
	public void setJournal(String journal) {
		if (journal != null && journal.length() > 0) {
			this.journal = journal;
		}
	}
	
	public String getSubscriber() {
		return subscriber;
	}
	
	public void setSubscriber(String subscriber) {
		if (subscriber != null && subscriber.length() > 0) {
			this.subscriber = subscriber;
		}
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		if (address != null & address.length() > 0) {
			this.address = address;
		}
	}
	
	public double getMonthlyPrice() {
		return monthlyPrice;
	}
	
	public void setMonthlyPrice(double monthlyPrice) {
		if (monthlyPrice >= 0.0) {
			this.monthlyPrice = monthlyPrice;
		}
	}
	
	public String printInvoice() {
		return "Journal name: " + getJournal() + "\nSubscriber's name: " + getSubscriber() + "\nDelivery Address: " + getAddress() + "\nMonthly Price: " + getMonthlyPrice(); 
	}
}
