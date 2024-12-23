package JAVA.OOP.Abstraction.AbstractClass;

// Abstract class representing a general appliance
public abstract class Appliance {
    private final String brand; // Stores the brand of the appliance
    private final String model; // Stores the model of the appliance

    // Constructor to initialize brand and model
    public Appliance(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Retrieves the brand of the appliance
    public String getBrand() {
        return brand;
    }

    // Retrieves the model of the appliance
    public String getModel() {
        return model;
    }

    // Displays general information about the appliance
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }

    // Abstract method to define specific appliance operation
    public abstract void operate();
}
