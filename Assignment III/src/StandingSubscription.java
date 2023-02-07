
public class StandingSubscription extends Subscription {

	private int discount = 0;
	
	public StandingSubscription(int discount, String journalName, String subscriberName, String deliverAddress, double monthPrice) {
		super(journalName, subscriberName, deliverAddress, monthPrice);
		setDiscount(discount);
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		if (discount > 0) {
			this.discount = discount;
		}
	}
	
	@Override
	public String printInvoice() {
		return "Standing Subscription Invoice: \n" + super.printInvoice() + "\nNumber of invoiced month: 12" + "\nOrder price: " + 12 * super.getMonthlyPrice() * (1 - (discount * 0.01));
	}
	
}
