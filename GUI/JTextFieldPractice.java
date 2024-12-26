package JAVA.GUI;

import javax.swing.*;    // Container-Component Elements
import java.awt.*;       // GUI Functionality ToolKit

public class JTextFieldPractice {
    
    public static void main(String[] args) {

        // JTextField is a swing component in Java used to allow users to input text in a Graphical Usewr Interface (GUI)

        // Panel
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());

        JTextField textField1 = new JTextField(20);
        JButton button1 = new JButton("CLICK!");
        JButton button2 = new JButton("CLEAR!");
        JTextField displayTextField1 = new JTextField(10);
        
            panel1.add(textField1);
            panel1.add(button1);
            panel1.add(button2);
            panel1.add(displayTextField1);

                button1.addActionListener (e -> {

                    if (!textField1.getText().equals("")) {
                        String inputtedString = textField1.getText();
                        displayTextField1.setText(inputtedString);
                    } else {
                        JOptionPane.showMessageDialog(panel1, "ENTER A VALID INPUT", "NOTIF!", JOptionPane.WARNING_MESSAGE);
                    }
                });

                button2.addActionListener (e -> {

                    if (!textField1.getText().equals("")) {
                        textField1.setText("");
                        displayTextField1.setText("");
                    }
                });

    JFrame mainFrame = new JFrame("TextField Naman");
    mainFrame.setSize(400, 600);
    mainFrame.setLocationRelativeTo(null);
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Components
        mainFrame.add(panel1);

    mainFrame.setVisible(true);


    } // Main Program
} // Main Class
