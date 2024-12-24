// 8 Primitive Data Types - stores data, faster, less memory

    // boolean  Boolean         1 bit       true(On) or false (Off)
    // byte     Integral        1 byte      -128 to 127
    // short    Integral        2 bytes     -32,728 to 32,767
    // int      Integral        4 bytes     -2 billion to 2 billion
    // long     Integral        8 bytes     -9 quintillion to 9 quintillion

    // float    floating-point  4 bytes     fractional numbers up to 6-7 digits
    // double   floating-point  8 bytes     fractional numbers up to 15 digits

    // char     Character       2 bytes     single character/letter/ASCII Value

// Reference Data Types - stores an address, slower, more memory

    // String                   varies      a sequence of characters
    // BigDecimal                           any decimal number that needs to be precise

    public class DataTypes{
    public static void main(String[] args) {
        
        // Primitive data types
        int age = 21;
        double height = 5.5;
        char sex = 'M';
        boolean isStudent = true;

        // Reference data types
        String name = "Kiye";

        System.out.println("Primitive Data Types:");
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Sex: " + sex);
        System.out.println("Is Student: " + isStudent);

        System.out.println("\nReference Data Type:");
        System.out.println("Name: " + name);
    }
}