/* Jose Mari Aguinaldo
 * COMP 009 - Object-Oriented Programming
 * GUI: TextWidget 
 */

import javax.swing.JFrame; // Import JFrame class for creating the main window (frame)
import javax.swing.JLabel; // Import JLabel class for displaying text (Label Widget)
import javax.swing.JTextField; // Import JTextField class for creating a text input field (Textbox Widget)

import javax.swing.SwingUtilities; // Import SwingUtilities for running the GUI on a separate thread

import java.awt.FlowLayout; // Import FlowLayout for setting the layout manager - automatically positions Widgets (components)

import java.awt.event.ActionListener; // Import ActionListener interface for handling action events
import java.awt.event.ActionEvent; // Import ActionEvent class for action event details

public class TextWidget {

    TextWidget() {

        JFrame frmWindow = new JFrame("Using Textbox Widget"); // Create a JFrame with a specified title

        JLabel lblFirst = new JLabel(""); // Create a label for displaying text
        JTextField txtFirst = new JTextField(25); // Create a text field with a specified width (25 characters)

        frmWindow.setLayout(new FlowLayout()); // Set the layout manager for the frame to FlowLayout

        frmWindow.setSize(500, 200); // Set the size of the frame

        frmWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the default close operation for the frame to exit the application

        frmWindow.add(txtFirst); // Add the text field to the frame
        frmWindow.add(lblFirst); // Add the label to the frame

        frmWindow.setVisible(true); // Set the frame as visible

        txtFirst.addActionListener(new ActionListener() { // Add an ActionListener to the text field

            public void actionPerformed(ActionEvent objAE) {

                lblFirst.setText(txtFirst.getText()); // Set the label text to the content of the text field when the Enter key is pressed
            }
        });
    } // TextWidget

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                new TextWidget(); // Create an instance of the TextWidget class when the main method is executed
            }
        });
    } // public static void main(String[] args); End of the program
} // public class TextWidget
