/* Jose Mari Aguinaldo
 * COMP 009 - Object-Oriented Programming
 * GUI: ButtonWidget 
 */

import javax.swing.JFrame; // Import JFrame class for creating the main window
import javax.swing.JLabel; // Import JLabel class for displaying text
import javax.swing.JTextField; // Import JTextField class for creating a text input field (TextBox)
import javax.swing.JButton; // Import JButton class for creating a command button widget

import javax.swing.SwingUtilities; // Import SwingUtilities for running the GUI on a separate thread or process

import java.awt.FlowLayout; // Import FlowLayout for setting the layout manager

import java.awt.event.ActionListener; // Import ActionListener interface for handling button click events
import java.awt.event.ActionEvent; // Import ActionEvent class for button click event details

public class ButtonWidget {

    JLabel lblButton; // Declare a JLabel variable for displaying text
    JTextField txtButton; // Declare a JTextField variable for text input
    JButton btnCopy; // Declare a JButton variable for the copy button

    ButtonWidget() {
        // Create a JFrame with a specified title
        JFrame frmWindow = new JFrame("Using a button Widget");
        
        lblButton = new JLabel("");  // Initialize the label for displaying copied text
        txtButton = new JTextField("Enter a text here: "); // Create a text field with a placeholder text
        btnCopy = new JButton("Copy"); // Create a button with the label "Copy"

        frmWindow.setLayout(new FlowLayout()); // Set the layout manager for the frame

        frmWindow.setSize(200, 150); // Set the size of the frame

        frmWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the default close operation for the frame to exit the application

        // It will add this on layout manager
        frmWindow.add(txtButton); // Add the text field to the frame
        frmWindow.add(btnCopy); // Add the copy button to the frame
        frmWindow.add(lblButton); // Add the label to the frame

        frmWindow.setVisible(true); // Set the frame as visible

        btnCopy.addActionListener(new ActionListener() { // Add an ActionListener to the copy button

            public void actionPerformed(ActionEvent objAE) {
                // Set the text of the label to the text entered in the text field when the button is clicked
                lblButton.setText(txtButton.getText());
            }
        });
    } // ButtonWidget

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Create an instance of the ButtonWidget class when the main method is executed
                new ButtonWidget();
            }
        });
    } //  public static void main(String[] args); End of the program
} // public class ButtonWidget
