/* Jose Mari Aguinaldo
 * COMP 005 - Data Structures and Algorithms
 * Activity 5: Stacks
 */
import java.util.Stack;

public class Stacksno2 {
    public static void main(String[] args) {

        // Create a stack to store a integer objects
        Stack<Integer> R = new Stack<>();
        Stack<Integer> S = new Stack<>();
        Stack<Integer> T = new Stack<>();

        // Populate stack S with integers in multiples of 10 from 10 to 40
        for (int i=10; i<50; i+=10) {
            S.push(i);
            T = S;
        }

        // Declare two variables 'a' and 'b' to store popped values
        int a, b;
        // Transfer elements from stack S to stack R
        while (!S.isEmpty()) {
            a = S.pop();
            R.push(a);
        }   

        // n is initialized with the value of 4, from T stack's size
        int n = T.size();

        // Iterate through the stacks R and T, pop elements, and print their values
        for (int i = 0; i < n; i++) {
            a = R.pop();
            b = T.pop();

        // Print the values of 'a' from stack R and 'b' from stack T
        System.out.println("R = " + a + " T = " + b);
            
        } System.out.println("  R T");
    } // public static void main(String[] args)
} // public class Stacksno2