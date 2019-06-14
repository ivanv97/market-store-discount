package discount.utilities;

/*Abstract class that is base for specific types of cards*/
public abstract class Card {
	private String ownerName;
	private double turnover;
	private double discountRate;

	public Card(String ownerName, float turnover) {
		this.ownerName = ownerName;
		this.turnover = turnover;
		calculateDiscountRate();
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double getTurnover() {
		return turnover;
	}

	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	protected void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	/*
	 * Abstract method whose implementation is to be provided by the subclasses
	 * extending Card - calculates the discount rate based on turnover and card type
	 */
	protected abstract void calculateDiscountRate();
}
