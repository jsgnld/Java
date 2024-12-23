package JAVA.OOP.Abstraction.InterfaceClass;

// Defines an interface for a payment gateway system
public interface PaymentGateway {
    // Declares a method to process a payment with the specified amount
    void processPayment(double amount);

    // Declares a method to display payment-related information
    void displayPaymentInfo();
}