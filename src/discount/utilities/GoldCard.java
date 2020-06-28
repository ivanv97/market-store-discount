package discount.utilities;

public class GoldCard extends Card {

	public GoldCard(String ownerName, double turnover) {
		super(ownerName, turnover);
	}

	/*
	 * Calculates the discount rate.
	 * Default discount rate - 2%.
	 * For every $ 100 in the turnover increments the
	 * discount rate by 1% unless it reached 10%
	 */
	@Override
	protected void calculateDiscountRate() {
		double discountRate = 2;
		setDiscountRate(discountRate);
		double turnoverCopy = turnover;
		while ((turnoverCopy -= 100) >= 0 && getDiscountRate() < 10) {
			discountRate += 1;
			setDiscountRate(discountRate);
		}
	}
}