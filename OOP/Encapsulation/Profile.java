/* Aguinaldo, Jose Mari R. | BSCS 3-1 */
/* Encapsulation */

package JAVA.OOP.Encapsulation;
import java.util.Scanner;

public class Profile {
    private String name;        // Private variable with both getter and setter
    private final int age;      // Read-only variable
    private final String studentID; // Read-only variable
    private String blockSection; // Private variable with both getter and setter

    // Constructor to set age, studentID, and blockSection
    public Profile(String name, int age, String studentID, String blockSection) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
        this.blockSection = blockSection;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age - no setter, making it read-only
    public int getAge() {
        return age;
    }

    // Getter for studentID - no setter, making it read-only
    public String getStudentID() {
        return studentID;
    }

    // Getter for blockSection
    public String getBlockSection() {
        return blockSection;
    }

    // Setter for blockSection
    public void setBlockSection(String blockSection) {
        this.blockSection = blockSection;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initial data for a student
        Profile student = new Profile("Jose Mari R. Aguinaldo", 20, "00001-MN-0", "BSCS 3-1");

        System.out.println("Student Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());          // Read-only
        System.out.println("Student ID: " + student.getStudentID());  // Read-only
        System.out.println("Block Section: " + student.getBlockSection());

        System.out.println("\nYou can update the following fields: Name and Block Section");

        // Updating Name
        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
        student.setName(newName);

        // Updating Block Section
        System.out.print("Enter new block section: ");
        String newBlockSection = scanner.nextLine();
        student.setBlockSection(newBlockSection);

        System.out.println("\nUpdated Student Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());          // Still read-only
        System.out.println("Student ID: " + student.getStudentID());  // Still read-only
        System.out.println("Block Section: " + student.getBlockSection());

        scanner.close();
    }
}