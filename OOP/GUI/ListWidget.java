/* Jose Mari Aguinaldo
 * COMP 009 - Object-Oriented Programming
 * GUI: ListWidget 
 */

import javax.swing.JFrame; // Import JFrame class for creating the main window
import javax.swing.JLabel; // Import JLabel class for displaying text
import javax.swing.JList; // Import JList class for creating a list box widget

import javax.swing.SwingUtilities; // Import SwingUtilities for running the GUI on a separate thread or process
import javax.swing.ListSelectionModel; // Import ListSelectionModel for configuring selection behavior (Single or Multi)

import javax.swing.event.ListSelectionListener; // Import ListSelectionListener interface for handling list selection events
import javax.swing.event.ListSelectionEvent; // Import ListSelectionEvent class for list selection event details

import java.awt.FlowLayout; // Import FlowLayout for setting the layout manager

public class ListWidget {

    JFrame frmWindow; // Declare a JFrame variable for the main window
    JLabel lblAutobot; // Declare a JLabel variable for displaying selected text
    JList lstAutobot; // Declare a JList variable for the list box

    // String[] objAutobot;

    int intIndex; // Declare an integer variable for storing the selected index in the list

    ListWidget() {

        lblAutobot = new JLabel(""); // Initialize the label for displaying selected text

        String[] objAutobot = {"I'm", "Awfully", "Tired", "And", "Want To", "Rest Peacefully!"}; // Initialize an array of strings for the list items

        lstAutobot = new JList(objAutobot); // Create a list box with the array of strings as its elements

        frmWindow = new JFrame("Using a Listbox Widget"); // Create a JFrame with a specified title
        frmWindow.setLayout(new FlowLayout()); // Set the layout manager for the frame
        frmWindow.setSize(500, 200); // Set the size of the frame
        frmWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the default close operation for the frame to exit the application

        frmWindow.add(lstAutobot); // Add the list box to the frame
        frmWindow.add(lblAutobot); // Add the label to the frame

        frmWindow.setVisible(true); // Set the frame as visible

        lstAutobot.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Set the behavior to single-click selection

        lstAutobot.addListSelectionListener(new ListSelectionListener() { // Add a ListSelectionListener to the list box

            public void valueChanged(ListSelectionEvent objLE) {

                intIndex = lstAutobot.getSelectedIndex(); // Get the selected index in the list
                if (intIndex != -1) { // Check if an item is selected

                    lblAutobot.setText("Autobot " + objAutobot[intIndex]); // Set the label text based on the selected item
                } // if (intIndex != -1)
            }
        });
    } // List Widget()

    public static void main(String[] args) { 

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                new ListWidget(); // Create an instance of the ListWidget class when the main method is executed
            }
        });
    } // public static void min(String[] args); End of the program
} // public class ListWidget

