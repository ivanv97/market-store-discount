package discount.utilities;

public class SilverCard extends Card {

	public SilverCard(String ownerName, double turnover) {
		super(ownerName, turnover);
	}

	/*
	 * If the turnover is more than $300 sets the discount rate at 3.5% else it
	 * defaults to 2%
	 */
	@Override
	protected void calculateDiscountRate() {
		if (getTurnover() > 300) {
			setDiscountRate(3.5);
			return;
		}
		setDiscountRate(2);
	}
}