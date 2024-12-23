package JAVA.OOP.Abstraction.AbstractClass2;

import java.util.*;

// Abstract class to define a generic payment system
abstract class Payment {
    // Abstract method to be implemented by subclasses for specific payment processing
    abstract void processPayment(double amount);

    // Method to display a receipt after payment processing
    void receipt(double totalPurchase, double balance, double newBalance) {
        System.out.println("*****************************");
        System.out.println("          RECEIPT            ");
        System.out.println("*****************************");
        System.out.println("Total Purchse:  " + totalPurchase);
        System.out.println("Balance:        " + balance);
        System.out.println("\nNew Balance:    " + newBalance);
        System.out.println("*****************************");
        System.out.println("      Payment Successful     ");
        System.out.println("         Thank You!          ");
        System.out.println("*****************************");
    }
}

// Subclass for Credit Card payments
class CreditCardPayment extends Payment {
    private double balance = 10000; // Initial Credit Card balance

    // Processes payment and checks if sufficient balance is available
    @Override
    void processPayment(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance in Credit Card.");
        } else {
            double newBalance = balance - amount; // Calculate new balance
            receipt(amount, balance, newBalance); // Print receipt
            balance = newBalance; // Update the balance
        }
    }
}

// Subclass for Gcash payments
class GcashPayment extends Payment {
    private double balance = 8967.78; // Initial Gcash balance

    // Processes payment and checks if sufficient balance is available
    @Override
    void processPayment(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance in Gcash.");
        } else {
            double newBalance = balance - amount; // Calculate new balance
            receipt(amount, balance, newBalance); // Print receipt
            balance = newBalance; // Update the balance
        }
    }
}

// Main class to simulate the online payment system
public class OnlinePaymentSystem_abstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Initialize the Scanner for user input

        // Prompt user for the total purchase amount
        System.out.print("Total Purchase Amount: ");
        double amount = sc.nextDouble();

        // Display payment options to the user
        System.out.print("""
                         ONLINE PAYMENT: 
                         1. Credit Card 
                         2. Gcash 
                         
                         Enter Choice:   """);

        int choice = sc.nextInt(); // Get user choice for payment method

        // Handle payment based on user choice
        switch (choice) {
            case 1:
                // Use Credit Card payment
                CreditCardPayment paymentMethod1 = new CreditCardPayment();
                paymentMethod1.processPayment(amount);
                break;
            case 2:
                // Use Gcash payment
                GcashPayment paymentMethod2 = new GcashPayment();
                paymentMethod2.processPayment(amount);
                break;
            default:
                // Handle invalid choice
                System.out.println("Invalid choice.");
                sc.close(); // Close the scanner
                return; // Exit the program
        }

        sc.close(); // Close the scanner after operations
    }
}