package discount.utilities;

import java.text.NumberFormat;
import java.util.Locale;

public final class PayDesk {
	private PayDesk() {
	}

	private static Card card;

	private static double discount;

	/*
	 * Prints the invoice for the customer depending on his card type
	 */
	public static void showInvoice(CardTypes cardType, double turnover, double valueOfPurchase) {
		switch (cardType) {
		case BRONZE_CARD:
			card = new BronzeCard("Ivan", turnover);
			break;
		case SILVER_CARD:
			card = new SilverCard("Dragan", turnover);
			break;
		case GOLD_CARD:
			card = new GoldCard("Petkan", turnover);
		default:
			break;
		}

		setDiscount(valueOfPurchase);

		// So we can format the numbers as the US local currency
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
		currencyFormatter.setMaximumFractionDigits(2);

		NumberFormat percentFormatter = NumberFormat.getPercentInstance(Locale.US);
		percentFormatter.setMinimumFractionDigits(1);

		System.out.println("Purchase value: " + currencyFormatter.format(valueOfPurchase));
		System.out.println("Discount rate: " + percentFormatter.format(card.getDiscountRate() / 100));
		System.out.println("Discount: " + currencyFormatter.format(discount));
		System.out.println("Total: " + currencyFormatter.format(getTotal(valueOfPurchase)));
	}

	/*
	 * Discount is set by multiplying the value of purchase times the pre-calculated
	 * discount rate that is specific to the type of card and turnover divided by 100 to get percent
	 */
	private static void setDiscount(double valueOfPurchase) {
		discount = valueOfPurchase * card.getDiscountRate() / 100;
	}

	/* Total equals the value of purchase minus the pre-calculated discount */
	private static double getTotal(double valueOfPurchase) {
		return valueOfPurchase - discount;
	}
}
