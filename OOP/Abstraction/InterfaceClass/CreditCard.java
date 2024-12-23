package JAVA.OOP.Abstraction.InterfaceClass;

// Declares a class CreditCard that implements the PaymentGateway interface
public class CreditCard implements PaymentGateway {
    private String cardNumber; // Stores the credit card number
    private String cardHolder; // Stores the cardholder's name

    // Constructor to initialize the credit card details
    public CreditCard(String cardNumber, String cardHolder) {
        // Checks if the card number has exactly 16 digits
        if (cardNumber.length() != 16) {
            throw new IllegalArgumentException("Card number must be 16 digits");
        }
        // Assigns values to cardNumber and cardHolder fields
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    // Retrieves a masked version of the card number
    public String getCardNumber() {
        return "XXXX-XXXX-XXXX-" + cardNumber.substring(12);
    }

    // Retrieves the cardholder's name
    public String getCardHolder() {
        return cardHolder;
    }

    // Overrides the processPayment method from the PaymentGateway interface
    @Override
    public void processPayment(double amount) {
        // Validates the payment amount
        if (amount <= 0) {
            System.out.println("Invalid payment amount.");
            return;
        }
        // Processes the payment and prints a confirmation message
        System.out.println("Processing credit card payment of $" + amount + " for " + cardHolder);
    }

    // Overrides the displayPaymentInfo method from the PaymentGateway interface
    @Override
    public void displayPaymentInfo() {
        // Displays the masked card number and the cardholder's name
        System.out.println("Credit Card Info: " + getCardNumber() + ", Card Holder: " + cardHolder);
    }
}