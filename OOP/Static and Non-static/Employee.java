public class Employee {
    // Static variable
    static String companyName = "TechCorp";

    // Non-static variables
    String name;
    int empId;

    // Constructor
    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    // Static method
    public static void setCompanyName(String newName) {
        companyName = newName;
    }

    // Non-static method
    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Company: " + companyName);
    }

    public static void main(String[] args) {
        // Changing company name using static method
        Employee.setCompanyName("InnovateTech");

        // Creating employee objects
        Employee emp1 = new Employee(101, "Alice");
        Employee emp2 = new Employee(102, "Bob");

        // Displaying employee details
        emp1.displayDetails();
        emp2.displayDetails();
    }
}