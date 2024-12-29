// Non-static approach

import java.util.Scanner;

class ConvertMethods {
    public void celsiusToFK(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;
        System.out.printf("%.2f Celsius is %.2f Fahrenheit and %.2f Kelvin%n", celsius, fahrenheit, kelvin);
    }
    
    public void fahrenheitToCK(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        double kelvin = celsius + 273.15;
        System.out.printf("%.2f Fahrenheit is %.2f Celsius and %.2f Kelvin%n", fahrenheit, celsius, kelvin);
    }

    public void kelvinToCF(double kelvin) {
        double celsius = kelvin - 273.15;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("%.2f Kelvin is %.2f Celsius and %.2f Fahrenheit%n", kelvin, celsius, fahrenheit);
    }
}

public class TemperatureConverterNS { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConvertMethods converter = new ConvertMethods(); // Object reference

        int choice;
        double num;

        while (true) {
            System.out.println("\nTemperature Converter Menu:");
            System.out.println("1. Celsius to Fahrenheit and Kelvin");
            System.out.println("2. Fahrenheit to Celsius and Kelvin");
            System.out.println("3. Kelvin to Celsius and Fahrenheit");
            System.out.println("4. Exit program");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter Celsius: ");
                    num = scanner.nextDouble();
                    converter.celsiusToFK(num);
                    break;  
                case 2:
                    System.out.print("\nEnter Fahrenheit: ");
                    num = scanner.nextDouble();
                    converter.fahrenheitToCK(num);
                    break;
                case 3:
                    System.out.print("\nEnter Kelvin: ");
                    num = scanner.nextDouble();
                    converter.kelvinToCF(num);
                    break;
                case 4: 
                    System.out.println("\nExiting the program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("\nInvalid choice! Please try again.");
                    break;
            }
        }
    }
}