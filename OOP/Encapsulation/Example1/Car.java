package JAVA.OOP.Encapsulation.Example1;
public class Car {
    private String make;
    private String model;
    private String year;

    // Constructor
    Car(String make,String model,String year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getters
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getYear() {
        return year;
    }
}