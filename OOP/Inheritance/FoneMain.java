/* Jose Mari Aguinaldo
 * COMP 009 - Object-Oriented Programming
 * Activity 1: Inheritance
 */

// Programming Assignment: main class for testing the Telephone and SmartFone classes
public class FoneMain {
    public static void main(String[] args) { // Start of the main program

        // Creating a Telephone object with initial values
        Telephone telephone = new Telephone(
                "Samsung","Globe",0,23, 99999991);

        // Making a call to the telephone
        telephone.call(2131323);

        // Receiving a call on the telephone
        telephone.receive(2131323);

        // Rejecting a call on the telephone 
        telephone.reject(1212212);

        // Setting color and the owner for Smartphone
        SmartFone smartFone = new SmartFone("Samsung","Globe",0,23, 99999991);
        smartFone.setColor("Yellow");
        smartFone.setOwner("Ky");

        // Installing and uninstalling applications on the Smartphone
        smartFone.installApplication("Facebook");
        smartFone.unInstallApplication("Twitter");
    } // public static void main(String[] args); End of the main program
} // public class FoneMain