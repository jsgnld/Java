// Conditionals
public class Conditionals {
    public static void main(String[] args) {
        int number = 5;

        // If statement performs a block of code if it's condition evaluates to be true
        if (number > 0) {
            System.out.println(number + " is positive."); // output is: 5 is positive.
        }
        
        // If...else statement
        if (number % 2 == 0) {
            System.out.println(number + " is even."); // Checks if 'number' is even by using the modulus operator
        } else {
            System.out.println(number + " is odd."); // output is: 5 is odd.
        }

        // Nested If...else
        if (number > 0) { 
            if (number < 10) {  
                System.out.println(number + " is a single-digit positive number."); // output is: 5 is a single-digit positive number.
            }
        }

        // Switch statement
        switch (number) {
            case 1:
                System.out.println("Number is one.");
                break;
            case 5:
                System.out.println("Number is five.");
                break;
            default:
                System.out.println("Number is something else."); // output is: Number is five.
        }
    }
}