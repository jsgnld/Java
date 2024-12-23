package JAVA.OOP.Abstraction.AbstractClass;

// Subclass of Appliance representing a Cellphone
public class Cellphone extends Appliance {
    // Constructor to initialize brand and model for a Cellphone
    public Cellphone(String brand, String model) {
        super(brand, model); // Calls the constructor of the parent class (Appliance)
    }

    // Overrides the abstract method operate to define Cellphone-specific behavior
    @Override
    public void operate() {
        // Displays an operation message specific to the Cellphone class
        System.out.println(getBrand() + " Cellphone " + getModel() + " is now making a call.");
    }
}