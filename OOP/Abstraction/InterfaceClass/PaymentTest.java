/* Aguinaldo, Jose Mari R. | BSCS -1 */
/* Abstraction - Using Interface */

package JAVA.OOP.Abstraction.InterfaceClass;

import java.util.Scanner;

// Test class to demonstrate abstraction using interfaces
public class PaymentTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Creates a scanner for user input

        // Displays payment method options to the user
        System.out.println("Choose payment method: ");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        int choice = s.nextInt(); // Reads the user's choice
        s.nextLine(); // Consumes the newline character

        PaymentGateway paymentGateway = null; // Declares a PaymentGateway reference

        // Checks the user's choice and initializes the appropriate payment method
        if (choice == 1) {
            System.out.println("Enter card holder's name: ");
            String cardHolder = s.nextLine(); // Reads card holder's name
            System.out.println("Enter card number (16 digits): ");
            String cardNumber = s.nextLine(); // Reads card number
            paymentGateway = new CreditCard(cardNumber, cardHolder); // Creates a CreditCard object
        } else if (choice == 2) {
            System.out.println("Enter PayPal email: ");
            String email = s.nextLine(); // Reads PayPal email
            paymentGateway = new PayPal(email); // Creates a PayPal object
        } else {
            // Handles invalid choice and exits the program
            System.out.println("Invalid choice.");
            s.close(); // Closes the scanner
            return;
        }

        paymentGateway.displayPaymentInfo(); // Displays payment details

        System.out.println("Enter payment amount: ");
        double amount = s.nextDouble(); // Reads the payment amount

        paymentGateway.processPayment(amount); // Processes the payment

        s.close(); // Closes the scanner
    }
}