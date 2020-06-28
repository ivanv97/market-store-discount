package app.start;

import discount.utilities.CardTypes;
import discount.utilities.PayDesk;

public class MainClass {
	/*
	 * Invoking the static method of PayDesk three times with different card
	 * types and values for turnover and value of purchase
	 */
	public static void main(String[] args) {
		PayDesk.showInvoice(CardTypes.BRONZE_CARD, 0, 150);
		System.out.println();
		PayDesk.showInvoice(CardTypes.SILVER_CARD, 600, 850);
		System.out.println();
		PayDesk.showInvoice(CardTypes.GOLD_CARD, 1500, 1300);
	}
}
