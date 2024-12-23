package JAVA.OOP.Abstraction.InterfaceClass;

// Defines the PayPal class implementing the PaymentGateway interface
public class PayPal implements PaymentGateway {
    private String email; // Stores the PayPal email address

    // Constructor to initialize the PayPal account with an email
    public PayPal(String email) {
        // Validates the email to ensure it contains '@'
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.email = email;
    }

    // Retrieves the email address associated with the PayPal account
    public String getEmail() {
        return email;
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
        System.out.println("Processing PayPal payment of $" + amount + " for " + email);
    }

    // Overrides the displayPaymentInfo method from the PaymentGateway interface
    @Override
    public void displayPaymentInfo() {
        // Displays the email address associated with the PayPal account
        System.out.println("PayPal Account: " + email);
    }
}
