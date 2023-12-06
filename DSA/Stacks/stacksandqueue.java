/* Jose Mari Aguinaldo
 * COMP 005 - Data Structures and Algorithms
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stacksandqueue {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        // PUSHSTACK (s, 3)
        stack.push(3);

        // PUSHSTACK (s, 12)
        stack.push(12);

        // ENQUEUE (q, 5)
        queue.offer(5);

        // ENQUEUE (q, 8)
        queue.offer(8);

        // POPSTACK (s, x)
        int x = stack.pop();

        // PUSHSTACK (s, 2)
        stack.push(2);

        // ENQUEUE (q, x)
        queue.offer(x);

        // DEQUEUE (q, y)
        int y = queue.poll();

        // PUSHSTACK (s, x)
        stack.push(x);

        // PUSHSTACK (s, y)
        stack.push(y);

        // Print the final contents
        System.out.println("Stack (s): " + stack);
        System.out.println("Queue (q): " + queue);
    } // public static void main(String[] args)
} // public class stacksandqueue
