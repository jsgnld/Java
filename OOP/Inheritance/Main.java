/* Jose Mari Aguinaldo
 * COMP 009 - Object-Oriented Programming
 * Activity 1: Inheritance
 */

// Import the scanner class for user input
import java.util.Scanner;

// Main class definition
public class Main {
    public static void main(String[] args) { // Start of the main program

        // Variables to represent shape names
        String shape1 = "Square";
        String shape2 = "Rectangle";
        String shape3 = "Circle";

        // Open selection pane also like a menu to choose
        System.out.println("Calculate the area of: ");                                                           
        System.out.println("----------------------------");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");

        // Synxtax for Scanner = Scanner scannerName = new Scanner (System.in);
        Scanner scanner = new Scanner(System.in);   // Instantiated scanner object

        // Prompt user to select a shape by entering desired number
        System.out.print("\nEnter the number to select your shape: ");
        int choice = scanner.nextInt();

        // This process the user's choice which will be perform calculations accordingly
        if (choice == 1) {
            System.out.println("\nShape: " + shape1);
            System.out.print("Enter the side [meters]: ");
                double side = scanner.nextDouble();
            // Calculate and print the area of a square
            System.out.println("Area is: " + Square.getArea(side));
        } else if (choice == 2) {
            System.out.println("\nShape: " + shape2);
            System.out.print("Enter the length [meters]: ");
                double length = scanner.nextDouble();
            System.out.print("Enter the breadth [meters]: ");
                double breadth = scanner.nextDouble();
            // Calculate and print the area of a rectangle
            System.out.println("Area is: " + Rectangle.getArea(length, breadth) + " meters");
        } else if (choice == 3) {
            System.out.println("\nShape: " + shape3);
            System.out.print("Enter the radius [meters]: ");
                double radius = scanner.nextDouble();
            // Calculate and print the diameter of the circle
            System.out.println("Diameter is: " + Circle.getDiameter(radius) + " meters");
        } else {

            // Invalid choice and/or pick
            System.out.println("Hello, you've entered an invalid value!");
        }
        // Close the scanner to prevent leaks
        scanner.close();
    } // public static void main(String[] args); End of the main program
} // public class Main
