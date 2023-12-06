/*  COMP 006: Data Structures and Aalgorithms
 *  Programming Task 2: Case Study (N-Queens Problem)
 *  Leader:          Rasty Espartero
 *  Contributors:    David Geisler Mahayag       Marc Lorenz Quintana
 *                   Jhanice Pablo               Marian Facunla
 *                   Jose Mari Aguinaldo         Roanne Maye Dinglasa    
 */
       
import java.util.Scanner; // Import to use Scanner class

public class Task2NQueens {
    public static void main(String[] args) { // Start of the maain program

        Scanner scanner = new Scanner(System.in); // Instance of Scanner class

        boolean continueSolving = true; // Initialization 

        while (continueSolving) { // While loop if continueSolving returns true

            line(); // Call line() method to print a separator line
            System.out.print("Enter the size of the chessboard (n)\nMaximum of (7): "); // Prompts the user for input
            int n = scanner.nextInt(); // Store the user input in variable n

            line(); // Call line() method to print a separator line
            Task2ChessBoard chessboard = new Task2ChessBoard(n); // Instance of ChessBoard class
            chessboard.solveNQueens(); // Calling solveNQueens method

            line(); // Call line() method to print a separator line
            System.out.print("Do you want to continue? [Y/N]:  "); // Asks the user before continuing
            String choice = scanner.next().toLowerCase(); // Store the user input in choice and automatically convert letter to lower case

            continueSolving = choice.equals("y"); // The program will continue solving if the user entered y/Y
        }

        System.out.println("Program terminated."); // Will be displayed if the user does not want to continue
        line();

        scanner.close(); // close the scanner to avoid leaks
    }// public static void main(String[] args); End of the main program

    // Method to print a separator line
    public static void line() {
        System.out.println("===========================================================");
    } // public static void main(String[] args)
} // public class Task2NQueens