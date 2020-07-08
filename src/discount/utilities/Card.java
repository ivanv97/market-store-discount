package discount.utilities;

import discount.exceptions.InvalidCardValueException;

/*Abstract class that is base for specific types of cards*/
public abstract class Card {
	private String ownerName;
	protected double turnover;
	private double discountRate;

	public Card(String ownerName, double turnover) {
		this.ownerName = ownerName;
		setTurnover(turnover);
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

	public void setTurnover(double turnover) throws InvalidCardValueException {
		if (turnover >= 0) {
			this.turnover = turnover;
		} else {
			throw new InvalidCardValueException("Invalid turnover! Must be a positive number or zero!");
		}
	}

	public double getDiscountRate() {
		return discountRate * 100;
	}

	protected void setDiscountRate(double discountRate) throws InvalidCardValueException {
		if (discountRate >= 0 && discountRate <= 100) {
			this.discountRate = discountRate / 100;
		} else {
			throw new InvalidCardValueException("Invalid discount rate! Must be between 0 and 100 (including)!");
		}
	}

	/*
	 * Abstract method whose implementation is to be provided by the subclasses
	 * extending Card - calculates the discount rate based on turnover and card type
	 */
	protected abstract void calculateDiscountRate();
}