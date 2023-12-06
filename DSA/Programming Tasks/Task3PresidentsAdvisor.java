/*  COMP 006: Data Structures and Algorithms
 *  Programming Task 3: Case Study (President's Advisors)
 *  Leader:          Rasty Espartero
 *  Contributors:    David Geisler Mahayag       Marc Lorenz Quintana
 *                   Jhanice Pablo               Marian Facunla
 *                   Jose Mari Aguinaldo         Roanne Maye Dinglasa    
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3PresidentsAdvisor {
    public static void main(String[] args) { // Start of the main Program

        // [1] Instantiate the scanner object to accept user input
        Scanner scanner = new Scanner(System.in);

        // [2] Display initial message
        lineBreak();
        System.out.println("Programming Task 3: Case Problem\n\tPresident's Advisors");

        outerLoop: while (true) {

            // Validation for starting advisor
            int startAdvisor;

            // [3] Input: Get starting adviser from the user with validation
            do {
                lineBreak();
                System.out.print("Start   : "); // [4] Prompt user for the starting adviser
                startAdvisor = scanner.nextInt(); // [5] Reads the user's input as an integer and assigns it to the variable startAdvisor

                // [6] Validate the input for startAdvisor
                if (startAdvisor > 13) {
                    System.out.println("\nKindly enter a value between \n1 and 13. Please Try again."); // [7] Display an error message for invalid input
                } else if (startAdvisor == 0) {
                    System.out.println("\nExiting..\n"); // [8] Display a message for exiting the program
                    break outerLoop; // Use labeled break to exit the outer loop
                }
            } while (startAdvisor == 0 || startAdvisor > 13); // [9] Continue looping until a valid input is provided

            // Validation for counting interval
            int interval;

            // [10] Input: Get counting interval from the user with validation
            do {
                System.out.print("Interval: "); // [11] Prompt user for the counting interval
                interval = scanner.nextInt(); // [12] Represents the counting interval that will be used to select advisers in the subsequent part of the program

                // [13] Validate the input for the counting interval
                if (interval < 1 || interval > 100) {
                    System.out.println("\nKindly enter a value between \n1 and 100. Please try again"); // [14] Display an error message for invalid input
                }
            } while (interval < 1 || interval > 100); // [15] Continue looping until a valid input is provided

            System.out.println();

            // Initialize a list to represent the 13 advisers
            List<Integer> advisors = new ArrayList<>();

            // [16] Initialize the list to store the selected advisers
            List<Integer> chosenAdvisers = new ArrayList<>();

            // [17] Initialize advisers list with values from 1 to 13
            for (int i = 1; i <= 13; i++) {
                advisors.add(i);
            }

            int currentIndex = (startAdvisor - 1 + interval - 1) % advisors.size();

            // Create loop to select 5 advisers based on the counting interval (came from a user)
            for (int i = 0; i < 5; i++) {

                // Add the selected adviser to the chosenAdvisers list and remove it from the advisors list
                chosenAdvisers.add(advisors.remove(currentIndex));

                // Calculate the index for the next iteration based on the counting interval
                currentIndex = (currentIndex + interval - 1) % advisors.size();
            }

            // Display the selected advisers
            System.out.println("Chosen Advisers: " + chosenAdvisers.toString());
        }

        // [18] Close the Scanner to prevent resource leaks
        scanner.close();
    } // [19]  public static void main(String[] args); End of the main program

    // [20] Utility method to print a line break
    static void lineBreak() {
        System.out.println("=================================");
    }
} // public class Task3PresidentsAdvisor