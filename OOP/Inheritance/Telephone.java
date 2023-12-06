/* Jose Mari Aguinaldo
 * COMP 009 - Object-Oriented Programming
 * Activity 1: Inheritance
 */

public class Telephone {
    // Private instance variables to store details of the telephone
    private String  manufacturer;
    private String network;
    private int code;
    private int areaCode;
    private int number;

    // Constructor to initialize the Telephone with provided details
    public Telephone(String manufacturer, String network, int code, int areaCode, int number) {
        this.manufacturer = manufacturer;
        this.network = network;
        this.code = code;
        this.areaCode = areaCode;
        this.number = number;
    }
    // Getter methods for each attribute
    public String getManufacturer() {
        return manufacturer;
    }
    // Setter methods to set the manufacturer of the telephone
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    // Getter method to retrieve the color of the SmartFone
    public String getNetwork() {
        return network;
    }
    // Setter method to set the network type of the telephone
    public void setNetwork(String network) {
        this.network = network;
    }
    // Getter method to retrieve the country code of the telephone
    public int getCode() {
        return code;
    }
    // Setter method to set the country code of the telephone
    public void setCode(int code) {
        this.code = code;
    }
    // Getter method to retrieve the area code of the telephone
    public int getAreaCode() {
        return areaCode;
    }
    // Setter method to set the area code of the telephone
    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }
    // Getter method to retrieve the phone number
    public int getNumber() {
        return number;
    }
    // Setter method to set the phone number
    public void setNumber(int number) {
        this.number = number;
    }
    
    // Actions that telephone can perform
    public void call(int phoneNumber) {
        System.out.printf("Calling %d \n",phoneNumber);
    }
    public void receive(int phoneNumber) {
        System.out.printf("Accepting call from %d \n",phoneNumber);
    }
    public void reject(int phoneNumber) {
        System.out.printf("Incoming call from %d rejected \n",phoneNumber);
    }
} // public class Telephone