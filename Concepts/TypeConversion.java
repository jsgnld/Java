// Type Conversion

public class TypeConversion {
    public static void main(String[] args) {
        // Implicit conversion (widening)
        int num = 10;
        double doubleNum = num;

        // Explicit conversion (narrowing)
        double value = 9.8;
        int intValue = (int) value;

        System.out.println("Implicit Conversion (int to double): " + doubleNum);
        System.out.println("Explicit Conversion (double to int): " + intValue);
    }
}