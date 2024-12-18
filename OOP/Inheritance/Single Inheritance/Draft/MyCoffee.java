package Draft;

// Aguinaldo, Jose Mari R.
// BSCS 3-1
// Date: 10/15/21

// MyCoffee.java
import java.util.Scanner;  // Importing the Scanner class to take user input

public class MyCoffee {
    public static void main(String[] args) {
        // Creating a Scanner object named inputScanner to take input from the user
        Scanner inputScanner = new Scanner(System.in);  

        // Prompting the user to choose between Coffee or Latte
        System.out.println("What would you like to brew? (1 for Coffee, 2 for Latte): ");
        int choice = inputScanner.nextInt();

        // Conditional statement to decide what to brew based on user input
        if (choice == 1) {
            // If the user chose 1, create a Coffee object
            Coffee myCoffee = new Coffee();  
            myCoffee.brew();  // Call the brew method from Coffee class to brew a coffee
        } else if (choice == 2) {
            // If the user chose 2, creaate a Latte object (subclass of Coffee)
            Latte myLatte = new Latte();  
            myLatte.brew();  // Call the overridden brew method from Latte class to brew a latte
        } else {
            // If the user enters an invalid option, notify them
            System.out.println("Invalid choice. Please choose 1 for Coffee or 2 for Latte.");
        }

        inputScanner.close();  
    }
}