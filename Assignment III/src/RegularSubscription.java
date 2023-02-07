
public class RegularSubscription extends Subscription {

	private int rate = 0;
	
	public RegularSubscription(int rate, String journalName, String subscriberName, String deliverAddress, double monthPrice) {
		super(journalName, subscriberName, deliverAddress, monthPrice);
		setRate(rate);
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		if (rate > 0) {
			this.rate = rate;
		}
	}

	@Override
	public String printInvoice() {
		return "Regular Subscription Invoice: \n" + super.printInvoice() + "\nNumber of invoiced months: " + getRate() + "\nOrder Price: " + getRate() * super.getMonthlyPrice();
	}
}
