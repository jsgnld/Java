package JAVA.OOP.Abstraction.InterfaceClass2;

// Define an interface Workable with methods for profiles and duties
interface Workable {
    // Abstract method to print the profile of the employee (name and role)
    public void profile(String name);

    // Abstract method to describe the duties performed by the employee
    public void performDuties();
}

// Manager class implementing the Workable interface
class Manager implements Workable {
    // Implement the profile method for the Manager
    @Override
    public void profile(String name) {
        System.out.println("Hi my name is " + name + "! I am the Manager.");
    }

    // Implement the performDuties method for the Manager
    @Override
    public void performDuties() {
        System.out.println("I am managing all the Employees.\n");
    }
}

// Developer class implementing the Workable interface
class Developer implements Workable {
    // Implement the profile method for the Developer
    @Override
    public void profile(String name) {
        System.out.println("Hi my name is " + name + "! I am a Developer.");
    }

    // Implement the performDuties method for the Developer
    @Override
    public void performDuties() {
        System.out.println("I am coding all day.");
    }
}

// Main class to demonstrate employee roles
public class EmployeeRoles_interface {
    public static void main(String[] args) {

        // Create a Manager object and display profile and duties
        Manager JohnDoe = new Manager();
        JohnDoe.profile("John Doe"); // Call profile method for Manager
        JohnDoe.performDuties(); // Call performDuties method for Manager

        // Create a Developer object and display profile and duties
        Developer MarkSmith = new Developer();
        MarkSmith.profile("Mark Smith"); // Call profile method for Developer
        MarkSmith.performDuties(); // Call performDuties method for Developer
    }
}