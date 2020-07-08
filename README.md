# Store discount

## A console app that calculates discount based on card type and most recent monthly turnover.

### The application in a nutshell:
1. An abstract class _Card_ provides base for the concrete implementations.
2. The abstract method _calculateDiscountRate()_ is overriden in the subclasses depending on the specific rules.
3. _calculateDiscountRate()_ is called in the constructor of Card object any time a card instance is created.
4. For _BronzeCard_ discount rate is calculated by the following rules:
   - If the turnover is below $100 discount rate is 0%
   - If the turnover is between $100 and $300 discount rate is 1%
   - If the turnover is over $300 discount rate is 2.5%
5. For _SilverCard_ discount rate is calculated by following rules:
   - The default discount rate is 2%
   - If the turnover is over $300 discount rate is 3.5%
6. For _GoldCard_ discount rate is calculated by following rules:
   - The default discount rate is 2%
   - For each $100 of the turnover the discount rate grows by 1% but 10% is the maximum.
7. PayDesk is a final (cannot be subclassed) utility class that holds a static method - _showInvoice(Card card, double valueOfPurchase)_ - which prints the invoice for the particular customer:
   - It calculates the discount - value of the purchase times the discount rate
   - Then gets the total - value of the purchase minus the calculated discount
8. In the main method the _showInvoice_ method is called three times creating three different cards instances with various values of the turnover.

**To start the application _build_ the code from your IDE and click _Run_.**
**Or simply navigate to the _bin_ folder of the application in the command prompt and run _"java app.start.MainClass"_**
