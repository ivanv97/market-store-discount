package discount.utilities;

public class GoldCard extends Card {

	public GoldCard(String ownerName, float turnover) {
		super(ownerName, turnover);
	}

	/*
	 * Calculates the discount rate - for every $ 100 in the turnover increments
	 * the discount rate by 1% unless it reached 10%
	 */
	@Override
	protected void calculateDiscountRate() {
		double discountRate = 0.02d;
		setDiscountRate(discountRate);
		double turnoverCopy = getTurnover();
		while ((turnoverCopy -= 100) >= 100 && getDiscountRate() < 0.1d) {
			discountRate += 0.01d;
			// We have to round it to two decimal places
			// otherwise we get values like 0.0999999
			// which fails the logic of the loop
			setDiscountRate(Math.round(discountRate * 100.0) / 100.0);
		}
	}

}
