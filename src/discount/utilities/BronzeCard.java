package discount.utilities;

public class BronzeCard extends Card {

	public BronzeCard(String ownerName, double turnover) {
		super(ownerName, turnover);
	}

	/*
	 * If the turnover is between $100 and $300 discount rate is set to 1%, if
	 * turnover is more than $300 - discount rate is 2.5%, else if turnover is below
	 * $100, discount rate defaults to 0%
	 */
	@Override
	protected void calculateDiscountRate() {
		double turnover = getTurnover();
		if (turnover >= 100 && turnover <= 300) {
			setDiscountRate(1);
			return;
		} else if (turnover > 300) {
			setDiscountRate(2.5);
			return;
		}
		setDiscountRate(0);
	}

}