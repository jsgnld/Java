/* Jose Mari Aguinaldo
 * COMP 006 - Data Structures and Algorithms
 * Programming Task 1: LinkedList
 */

public class Task1LinkedList {
    public static void main(String[] args) { // Start of the main program
        // Create the first linked list
        Task1Nodes head1 = new Task1Nodes(5);
        // Create and link two more nodes from head1 using the (next) and assign a value
        head1.next = new Task1Nodes(3);
        head1.next.next = new Task1Nodes(1);
        head1.next.next.next = new Task1Nodes(3);
        head1.next.next.next.next = new Task1Nodes(4);

        // Create the second linked list
        Task1Nodes head2 = new Task1Nodes(2);
        // Create and link two more nodes from head2 using the (next) and assign a value
        head2.next = new Task1Nodes(7);
        head2.next.next = new Task1Nodes(1);

        // Display the addition process for a better visuality
        System.out.println(); 
            System.out.println("__________________________________\n"); 
            System.out.println("ADDITION PROCESS:");
            System.out.println("\t  4  3  1  3  5\n\t+       1  7  2\t\n\t---------------\n\t  4  3  3  0  7\n");
            System.out.println("__________________________________"); 
        System.out.println();

        // Call the addInteger method to add the two linked lists
        Task1Nodes result = addInteger(head1, head2);

        // Display the outcomes using while loop
        while (result != null) {    // Checks and display the existing nodes
            System.out.print(result.data + " "); // Print the current data
            result = result.next; // Reassign result to move to the next code
        }
    } //  public static void main(String[] args); End of the Main Program

    // Method to add integers represented by two linked lists
    // Returns the head of the resulting linked list
    static Task1Nodes addInteger(Task1Nodes head1, Task1Nodes head2) {

        // Initialize a placeholder node for the result
        Task1Nodes head3 = new Task1Nodes(0);

        // Initialize head3 as the current head for te starting point in the adding operation
        Task1Nodes current = head3;
        Task1Nodes head1Pointer = head1; // Pointer to traverse the first linked list
        Task1Nodes head2Pointer = head2; // Pointer to traverse the second linked list
        int carry = 0; // Variable to store the carry during addition

        // Iterate through both linked lists until both are empty
        while (head1Pointer != null || head2Pointer != null) {
            // Extract the data from the current nodes (or use 0 if the node is null)
            int head1Data = (head1Pointer != null) ? head1Pointer.data : 0; // The node's value will be extrtacted if there's a node and if none, 0 is assigned value
            int head2Data = (head2Pointer != null) ? head2Pointer.data : 0; // The node's value will be extrtacted if there's a node and if none, 0 is assigned value

            // To calculate the sum of current digits and the carry from the previous iteration
            int sum = head1Data + head2Data + carry;
                // Update the carry for the next iteration
                carry = sum / 10; 
                // Create a new node with the digit in the units place of the sum
                current.next = new Task1Nodes(sum % 10);

            // Move to the next node in the result list
            current = current.next;
            // Move to the next nodes in the input linked lists if they are not null
            if (head1Pointer != null) head1Pointer = head1Pointer.next;
            if (head2Pointer != null) head2Pointer = head2Pointer.next;
        }
        // If there is a carry remaining, create a new node for it
        if (carry > 0) {
            // Create a new node to carry the value
            current.next = new Task1Nodes(carry);
        }
        // Return the head of the resulting linked list (skipping the placeholder node)
        return head3.next;
    } // static Task1Nodes addInteger(Task1Nodes head1, Task1Nodes head2)
} // public class Task1LinkedList