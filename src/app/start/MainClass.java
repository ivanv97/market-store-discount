package app.start;

import discount.utilities.*;

public class MainClass {
	/*
	 * Invoking the static method of PayDesk three times with different card types
	 * and values for turnover and value of purchase
	 */
	public static void main(String[] args) {
		PayDesk.showInvoice(new BronzeCard("Ivan", 0), 150);
		System.out.println();
		PayDesk.showInvoice(new SilverCard("Dragan", 600), 850);
		System.out.println();
		PayDesk.showInvoice(new GoldCard("Petkan", 1500), 1300);
	}
}
