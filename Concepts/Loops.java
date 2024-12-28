// Loops

public class Loops {
    public static void main(String[] args) {
        
        // For loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // Enhanced for loop
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}