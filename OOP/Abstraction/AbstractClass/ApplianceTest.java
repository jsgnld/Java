/* Aguinaldo, Jose Mari R. | BSCS -1 */
/* Abstraction - Using Abstract */

package JAVA.OOP.Abstraction.AbstractClass;

import java.util.Scanner;

// Test class to demonstrate abstraction using abstract classes
public class ApplianceTest {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) { // Try-with-resources to ensure the scanner is closed automatically
            // Prompts user to enter brand and model for the first appliance (Device)
            System.out.println("Enter the brand for the first appliance (Device): ");
            String brand1 = s.nextLine(); // Reads the brand for the first appliance
            System.out.println("Enter the model for the first appliance (Device): ");
            String model1 = s.nextLine(); // Reads the model for the first appliance

            // Creates an instance of Device (a subclass of Appliance)
            Appliance device = new Device(brand1, model1);

            // Prompts user to enter brand and model for the second appliance (Cellphone)
            System.out.println("Enter the brand for the second appliance (Cellphone): ");
            String brand2 = s.nextLine(); // Reads the brand for the second appliance
            System.out.println("Enter the model for the second appliance (Cellphone): ");
            String model2 = s.nextLine(); // Reads the model for the second appliance

            // Creates an instance of Cellphone (a subclass of Appliance)
            Appliance cellphone = new Cellphone(brand2, model2);

            // Displays information and operation for the first appliance (Device)
            device.displayInfo(); // Displays brand and model for the device
            device.operate(); // Executes the specific operation for the device

            // Displays information and operation for the second appliance (Cellphone)
            cellphone.displayInfo(); // Displays brand and model for the cellphone
            cellphone.operate(); // Executes the specific operation for the cellphone
        }
    }
}
