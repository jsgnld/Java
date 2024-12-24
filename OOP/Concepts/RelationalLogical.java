// Relational and Logical

public class RelationalLogical {
    public static void main(String[] args) {
        int x = 10, y = 20;

        // Relational operators
        System.out.println("x < y: " + (x < y));
        System.out.println("x == y: " + (x == y));

        // Logical operators
        System.out.println("(x < y) && (y > 0): " + ((x < y) && (y > 0)));
        System.out.println("(x > y) || (y > 0): " + ((x > y) || (y > 0)));
    }
}