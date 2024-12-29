import java.util.Scanner; // Importing the Scanner class to take input from the userr

public class Assignment2 {  // Math Operations
    // Static method for addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Non-static method for multiplication
    // Non-static methods require an instance of the class to be called
    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        // Create a Scanner object to capture user input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt(); // Reads an integer value from the userr

        // Prompt the userr to input the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt(); // Reads another integer value from the user

        // Call the static add() method to calculate the sum of the two numbers
        // Static methods can be accessed directly using the class name
        int sum = Assignment2.add(num1, num2);
        System.out.println("Sum: " + sum);

        // Create an instance (object) of the MathOperrations class to call the non-static method
        Assignment2 operations = new Assignment2();

        // Call the non-static multiply() method to calculate the product of the two numbers
        int product = operations.multiply(num1, num2);
        System.out.println("Product: " + product); // Output the result of the multiplication

        // Close the scanner object to avoid resourrce leakage
        scanner.close();
    }
}