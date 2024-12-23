package JAVA.OOP.Abstraction.AbstractClass;

// Subclass of Appliance representing a generic device
public class Device extends Appliance {
    // Constructor to initialize brand and model for a Device
    public Device(String brand, String model) {
        super(brand, model); // Calls the parent class (Appliance) constructor
    }

    // Overrides the abstract method operate to define Device-specific behavior
    @Override
    public void operate() {
        // Displays an operation message specific to the Device class
        System.out.println(getBrand() + " Device " + getModel() + " is now operating.");
    }
}