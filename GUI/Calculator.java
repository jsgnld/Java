package JAVA.GUI;

// Needed Interfaces
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class Calculator {
    
    // Global Varibales
    static int sum, difference, product, quotient;
    static String firstValue = "";
    static JTextField displayScreen;

    // Main Function
    public static void main(String[] args) {

        // Panel for Text Field, used for dispaly
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.setPreferredSize(new Dimension(350, 120));
        panel1.setBorder(new EmptyBorder(0, 20, 30, 20));

            // Instantiating Text Field
            displayScreen = new JTextField();
            displayScreen.setPreferredSize(new Dimension(350, 100));

                // Adding Text Field to Panel
                panel1.add(displayScreen);

        // Panel for Buttons
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(4, 4));
        panel2.setPreferredSize(new Dimension(350, 370));
        Font btnFont = new Font("Arial", Font.BOLD, 20);
        
            // Instantiating Buttons
            JButton btn7 = new JButton("7");
            JButton btn8 = new JButton("8");
            JButton btn9 = new JButton("9");
            JButton btnAdd = new JButton("+");

            JButton btn4 = new JButton("4");
            JButton btn5 = new JButton("5");
            JButton btn6 = new JButton("6");
            JButton btnSubtract = new JButton("-");

            JButton btn1 = new JButton("1");
            JButton btn2 = new JButton("2");
            JButton btn3 = new JButton("3");
            JButton btnMultiply = new JButton("X");

            JButton btnDelete = new JButton("<<");
            JButton btn0 = new JButton("0");
            JButton btnEquals = new JButton("=");
            JButton btnDivide = new JButton("/");
        
                // Setting Font to Buttons
                btnDivide.setFont(btnFont);
                btnDelete.setFont(btnFont);
                btnMultiply.setFont(btnFont);
                btnSubtract.setFont(btnFont);
                btn7.setFont(btnFont);
                btn8.setFont(btnFont);
                btn9.setFont(btnFont);
                btn4.setFont(btnFont);
                btn5.setFont(btnFont);
                btn6.setFont(btnFont);
                btn1.setFont(btnFont);
                btn2.setFont(btnFont);
                btn3.setFont(btnFont);
                btn0.setFont(btnFont);
                btnAdd.setFont(btnFont);
                btnEquals.setFont(btnFont);

                    // Adding Buttons to Panel
                    panel2.add(btn7);
                    panel2.add(btn8);
                    panel2.add(btn9);
                    panel2.add(btnAdd);
                    panel2.add(btn4);
                    panel2.add(btn5);
                    panel2.add(btn6);
                    panel2.add(btnSubtract);
                    panel2.add(btn1);
                    panel2.add(btn2);
                    panel2.add(btn3);
                    panel2.add(btnMultiply);
                    panel2.add(btnDelete);
                    panel2.add(btn0);
                    panel2.add(btnEquals);
                    panel2.add(btnDivide);

        // Panel Dedicated for Clear Button
        JPanel panel3 = new JPanel();
        JButton btnClear = new JButton("CLEAR");
        btnClear.setPreferredSize(new Dimension(350, 40));

            // Adding Button to Panel
            panel3.add(btnClear);


        // Main Frame
        JFrame mainFrame = new JFrame("CALCULATOR");
        mainFrame.setSize(400, 600);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setLayout(new FlowLayout());

            // Adding Panels to the Frame
            mainFrame.add(panel1);
            mainFrame.add(panel2);
            mainFrame.add(panel3);

        mainFrame.setVisible(true);

        // Numerical Buttons Action Listener
        btn7.addActionListener(e -> 
            updateDisplay("7")
        );

        btn8.addActionListener(e -> 
            updateDisplay("8")
        );

        btn9.addActionListener(e -> 
            updateDisplay("9")
        );

        btn4.addActionListener(e -> 
            updateDisplay("4")
        );

        btn5.addActionListener(e -> 
            updateDisplay("5")
        );

        btn6.addActionListener(e -> 
            updateDisplay("6")
        );

        btn1.addActionListener(e -> 
            updateDisplay("1")
        );

        btn2.addActionListener(e -> 
            updateDisplay("2")
        );

        btn3.addActionListener(e -> 
            updateDisplay("3")
        );

        btn0.addActionListener(e -> 
            updateDisplay("0")
        );

        // Arithmetic Operations Action Listener
        btnDelete.addActionListener(e -> {
            
            String currentText = displayScreen.getText();

            if (!currentText.isEmpty()) {
                String updatedText = currentText.substring(0, currentText.length() - 1);
                displayScreen.setText(updatedText);
            }

        });

        btnClear.addActionListener(e ->

            displayScreen.setText("")

        );

        btnAdd.addActionListener(e -> 
            updateDisplay("+")
        );

        btnSubtract.addActionListener(e -> 
            updateDisplay("-")
        );

        btnMultiply.addActionListener(e -> 
            updateDisplay("*")
        );

        btnDivide.addActionListener(e -> 
            updateDisplay("/")
        );

        btnEquals.addActionListener(e -> {
            String expression = displayScreen.getText();
            if (!expression.isEmpty()) {
                calculate(expression);
            }
        });

    } // Main Function ********************************

    // Method for updating action listener
    static void updateDisplay(String value) {
        String currentText = displayScreen.getText();
        String updatedText = currentText + value;
        displayScreen.setText(updatedText);
    }

    /// Method to calculate
    static void calculate(String expression) {
        String[] parts = expression.split("[-+*/]");
        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[1]);
        char operation = expression.charAt(parts[0].length());
        
        switch (operation) {
            case '+':
                sum = num1 + num2;
                displayScreen.setText(String.valueOf(sum));
                break;
            case '-':
                difference = num1 - num2;
                displayScreen.setText(String.valueOf(difference));
                break;
            case '*':
                product = num1 * num2;
                displayScreen.setText(String.valueOf(product));
                break;
            case '/':
                if (num2 != 0) {
                    quotient = num1 / num2;
                    displayScreen.setText(String.valueOf(quotient));
                } else {
                    displayScreen.setText("Error: Division by zero");
                }
                break;
        }
    }

} // Class 