// Operators

public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 20;

        // Arithmetic operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (b - a));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (b / a));

        // Assignment operators
        int c = a + b;
        System.out.println("Assignment Operator: " + c);

        // Increment/Decrement
        a++;
        b--;
        System.out.println("Increment a: " + a);
        System.out.println("Decrement b: " + b);

        // Relational operators
        System.out.println("a > b: " + (a > b));

        // Logical operators
        System.out.println("(a > 0) && (b > 0): " + ((a > 0) && (b > 0)));
    }
}
