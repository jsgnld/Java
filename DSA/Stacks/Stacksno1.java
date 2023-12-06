/* Jose Mari Aguinaldo
 * COMP 005 - Data Structures and Algorithms
 * Activity 5: Stacks
 */

import java.util.Stack;

public class Stacksno1 {
    public static void main(String[] args) {

        // Create a stack to store a integer objects
        // Syntax: Stack<dataType> stackName = new Stack<dataType>;
        Stack<Integer> s = new Stack<>();
        // Initialize two variables to be pushed onto the stack
        int x = 2; 
        int y = 3;

        // Push variables x and 2 * y variables onto the stack using push(variablename)
        s.push(x);  // Pushed variable x
        s.push(2 * y);  // Pushed variable y, with its value multiplied to 2
        s.push(4);  // Pushed the integer directly
        
        // Pop the last inserted value from the stack and assigned it to variable y
        y = s.pop();

        // Push another value which is 7 onto the stack
        s.push(7);  

        // Pop a value from the stack
        s.pop();

        // Peek and access the value at the top of the stack then assigned it to variable x
        x = s.peek();
        
        // Initialize the size of the stack to variable n
        int n = s.size();

        // Push values onto the stack based on its size, then
        for (int i = 0; i < n; i++) {
            s.push(n);
        }

        // Pop and print each value from the stack
        System.out.println("The values from Stack s\n");
        while (!s.isEmpty()) {
            y = s.pop();       
            System.out.println("" + y);
        } 

        // Print the final values of x and y
        System.out.print("x = " + x + "\ny = " + y + "\n\n");
        System.out.println();
    }  // public static void main(String[] args)
} // public class Stacksno1