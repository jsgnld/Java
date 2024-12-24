import java.util.Scanner;

// Methods are public to access them outside their parent class
class ConvertMethods {
    public static void celsiusToFK(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;
        System.out.printf("%.2f Celsius is %.2f Fahrenheit and %.2f Kelvin%n", celsius, fahrenheit, kelvin);
    }
    
    public static double fahrenheit;
    public static double celsius;
    public static double kelvin;
    public static void fahrenheitToCK(double num) {
        fahrenheit = num;
        celsius = (fahrenheit - 32) * 5/9;
        kelvin = celsius + 273.15;
    }
    
    public void kelvinToCF(double kelvin) {
        double celsius = kelvin - 273.15;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("%.2f Kelvin is %.2f Celsius and %.2f Fahrenheit%n", kelvin, celsius, fahrenheit);
    }
}

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        double num;

        while (true) {
            System.out.println("\nTemperature Converter Menu:");
            System.out.println("1. Celsius to Fahrenheit and Kelvin");
            System.out.println("2. Fahrenheit to Celsius and Kelvin");
            System.out.println("3. Kelvin to Celsius and Fahrenheit");
            System.out.println("4. Exit Program");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Static approach; Calls the class and method by itself
                    System.out.print("\nEnter Celsius: ");
                    num = scanner.nextDouble();
                    
                    ConvertMethods.celsiusToFK(num);
                    break;
                case 2: // Static approach; Calls the class and variable by calling the method used, to print the result in the main class
                    System.out.print("\nEnter Fahrenheit: ");
                    num = scanner.nextDouble();

                    ConvertMethods.fahrenheitToCK(num);
                    System.out.printf("%.2f Fahrenheit is %.2f Celsius and %.2f Kelvin%n", ConvertMethods.fahrenheit, ConvertMethods.celsius, ConvertMethods.kelvin);
                    break;
                case 3: // Non-static approach; Insantiates the class to call the object and method used
                    System.out.print("\nEnter Kelvin: "); 
                    num = scanner.nextDouble(); 
                    
                    ConvertMethods converter = new ConvertMethods();    // object
                    converter.kelvinToCF(num); // method
                    break; 
                case 4: 
                    System.out.println("\nExiting the program..."); // Exit program
                    scanner.close(); // Close scanner
                    return;
                default:
                    System.out.println("\nInvalid choice! Please try again."); // Invalid choice
                    break;
            }
        }
    }
}