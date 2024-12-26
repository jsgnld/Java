package JAVA.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

public class AguinaldoQno2 {

    // Student data global variables
    private static JTextField studentID, lastName, firstName, middleName, ccyy, mm, dd, hh, mm2;

    public static void main(String[] args) {

        // Panel1
        JPanel panel1 = new JPanel();
        JLabel modeLabel = new JLabel("Mode");
        JTextField mode = new JTextField(20);
        panel1.setLayout(new FlowLayout());
        panel1.add(modeLabel);
        panel1.add(mode);

        // Panel2
        JPanel panel2 = new JPanel();
        JLabel codeLabel = new JLabel("Code");
        studentID = createPlaceholderTextField(20, "Enter Student ID");
        panel2.setLayout(new FlowLayout());
        panel2.add(codeLabel);
        panel2.add(studentID);

        // Panel3
        JPanel panel3 = new JPanel();
        JLabel lastLabel = new JLabel("Last Name");
        lastName = createPlaceholderTextField(20, "Enter Last Name");
        panel3.setLayout(new FlowLayout());
        panel3.add(lastLabel);
        panel3.add(lastName);

        // Panel4
        JPanel panel4 = new JPanel();
        JLabel firstLabel = new JLabel("First Name");
        firstName = createPlaceholderTextField(20, "Enter First Name");
        panel4.setLayout(new FlowLayout());
        panel4.add(firstLabel);
        panel4.add(firstName);

        // Panel5
        JPanel panel5 = new JPanel();
        JLabel middleLabel = new JLabel("Middle Name");
        middleName = createPlaceholderTextField(20, "Enter Middle Name");
        panel5.setLayout(new FlowLayout());
        panel5.add(middleLabel);
        panel5.add(middleName);

        // Panel6
        JPanel panel6 = new JPanel();
        JLabel DOBLabel = new JLabel("DOB");
        ccyy = createPlaceholderTextField(7, "YYYY");
        mm = createPlaceholderTextField(4, "MM");
        dd = createPlaceholderTextField(4, "DD");
        hh = createPlaceholderTextField(4, "HH");
        mm2 = createPlaceholderTextField(4, "MM");
        panel6.setLayout(new FlowLayout());
        panel6.add(DOBLabel);
        panel6.add(ccyy);
        panel6.add(mm);
        panel6.add(dd);
        panel6.add(hh);
        panel6.add(mm2);

        // Panel 7 = Buttons
        JPanel panel7 = new JPanel();
        panel7.setLayout(new FlowLayout());
        JButton newButton = new JButton("New");
        JButton editButton = new JButton("Edit");
        JButton saveButton = new JButton("Save");
        JButton cancelButton = new JButton("Cancel");
        panel7.add(newButton);
        panel7.add(editButton);
        panel7.add(saveButton);
        panel7.add(cancelButton);

        // Main Frame
        JFrame mainFrame = new JFrame("Student Data Entry");
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setSize(600, 400);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new GridLayout(7, 0));
        mainFrame.setResizable(false);

            mainFrame.add(panel1);
            mainFrame.add(panel2);
            mainFrame.add(panel3);
            mainFrame.add(panel4);
            mainFrame.add(panel5);
            mainFrame.add(panel6);
            mainFrame.add(panel7);

        mainFrame.setVisible(true);

        // new Button Function
        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mode.setText("New student");
                clearFields();
            }
        });


        // Edit button function
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mode.setText("Edit student info");
                String targetStudentID = studentID.getText();
                String existingData = searchStudentData(targetStudentID);
        
                if (existingData != null) {
                    // Populate the fields with existing data
                    String[] dataParts = existingData.split(",");
                    lastName.setText(dataParts[1]);
                    firstName.setText(dataParts[2]);
                    middleName.setText(dataParts[3]);
                    ccyy.setText(dataParts[4]);
                    mm.setText(dataParts[5]);
                    dd.setText(dataParts[6]);
                    hh.setText(dataParts[7]);
                    mm2.setText(dataParts[8]);
                } else {
                    showMessageDialog("Student not found.");
                    clearFields();
                }
            }
        });

        // cancekl button function
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mode.setText("");
                clearFields();
                showMessageDialog("Student info not saved.");
            }
        });

    } // Main Frame

    // clear text fields
    private static void clearFields() {
        studentID.setText("");
        lastName.setText("");
        firstName.setText("");
        middleName.setText("");
        ccyy.setText("");
        mm.setText("");
        dd.setText("");
        hh.setText("");
        mm2.setText("");
    }
    // message notif
    private static void showMessageDialog(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    // edit function
    private static String searchStudentData(String targetStudentID) {
        try (Scanner scanner = new Scanner(new File("C:/Users/MSI/eclipse-workspace/GUISwing/src/PracticalApplications/student.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length > 0 && parts[0].equals(targetStudentID)) {
                    return line;
                }
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    private static JTextField createPlaceholderTextField(int columns, String placeholder) {
        JTextField textField = new JTextField(columns);
        textField.setForeground(Color.GRAY);
        textField.setText(placeholder);
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setForeground(Color.GRAY);
                    textField.setText(placeholder);
                    }
                }
            });
            return textField;
        }
    }