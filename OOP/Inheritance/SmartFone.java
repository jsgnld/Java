/* Jose Mari Aguinaldo
 * COMP 009 - Object-Oriented Programming
 * Activity 1: Inheritance
 */

public class SmartFone extends Telephone {
    // Private instance variables specific to SmartFone
    private String owner;
    private String color;

    // Constructor to initialize the SmartFone with manufacturer, network, and telephone number details
    public SmartFone(String manufacturer, String network, int code, int areaCode, int number) {
        super(manufacturer, network, code, areaCode, number);
    }
    // Getter method to retrieve the owner's name
    public String getOwner() {
        return owner;
    }
    // Setter method to set the owner's name
    public void setOwner(String owner) {
        this.owner = owner;
    }
    // Getter method to retrieve the color of the SmartFone
    public String getColor() {
        return color;
    }
    // Setter method to set the color of the SmartFone
    public void setColor(String color) {
        this.color = color;
    }
    // Method to simulate the in sultation of an application on the surface
    public void installApplication(String appName) {
        System.out.printf("Installing %s...\n",appName);
    }
    // Method to simulate/show the uninstallation of an application from the SmartFone
    public void unInstallApplication(String appName) {
        System.out.printf("Removing %s... \n",appName);
    }

} // public class SmartFone extends Telephone