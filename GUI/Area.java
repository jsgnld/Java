package JAVA.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Area extends JFrame implements ActionListener {
    
    // BUTTON SETTING
    JButton BUTTON3 = new JButton("CLEAR");
    JButton BUTTON2 = new JButton("PERIMETER");
    JButton BUTTON1 = new JButton("AREA");
    
    // RADIO BUTTON 
    JRadioButton RADIOBUTTON3 = new JRadioButton("Triangle");
    JRadioButton RADIOBUTTON2 = new JRadioButton("Rectangle");
    JRadioButton RADIOBUTTON1 = new JRadioButton("Square");
    
    // TEXTFIELD SETTING
    JTextField TEXTFIELD7 = new JTextField();
    JTextField TEXTFIELD6 = new JTextField();
    JTextField TEXTFIELD5 = new JTextField();
    JTextField TEXTFIELD4 = new JTextField();
    JTextField TEXTFIELD3 = new JTextField();
    JTextField TEXTFIELD2 = new JTextField();
    JTextField TEXTFIELD1 = new JTextField();
    
    // LABEL SETTING
    JLabel LABEL8 = new JLabel("Perimeter: ");
    JLabel LABEL7 = new JLabel("Area: ");
    JLabel LABEL6 = new JLabel("Base (Side 3): ");
    JLabel LABEL5 = new JLabel("Height (Side 2): ");
    JLabel LABEL4 = new JLabel("Side (Side 1): ");
    JLabel LABEL3 = new JLabel("Width: ");
    JLabel LABEL2 = new JLabel("Length: ");
    JLabel LABEL1 = new JLabel("Shape: ");
    
    // PANEL SETTING
    JPanel PANEL1 = new JPanel();
    JPanel PANEL2 = new JPanel();
    JPanel PANEL3 = new JPanel();

    Area() {

        super("AREA");
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setResizable(false);
        setLocationRelativeTo(null);
        add(PANEL1);
        add(PANEL2);
        add(PANEL3);

        RADIOBUTTON1.setFocusable(false);
        RADIOBUTTON1.addActionListener(this);
        RADIOBUTTON2.setFocusable(false);
        RADIOBUTTON2.addActionListener(this);
        RADIOBUTTON3.setFocusable(false);
        RADIOBUTTON3.addActionListener(this);

        BUTTON1.setFocusable(false);
        BUTTON2.setFocusable(false);
        BUTTON3.setFocusable(false);

        PANEL3.setPreferredSize(new Dimension(400, 400));
        PANEL3.add(BUTTON1);
        PANEL3.add(BUTTON2);
        PANEL3.add(BUTTON3);

        BUTTON1.addActionListener(this);
        BUTTON2.addActionListener(this);
        BUTTON3.addActionListener(this);

        PANEL2.setPreferredSize(new Dimension(400, 400));
        PANEL2.setLayout(new GridLayout(7, 1, 2, 2));
        PANEL2.add(LABEL2);
        PANEL2.add(TEXTFIELD1);
        PANEL2.add(LABEL3);
        PANEL2.add(TEXTFIELD2);
        PANEL2.add(LABEL4);
        PANEL2.add(TEXTFIELD3);
        PANEL2.add(LABEL5);
        PANEL2.add(TEXTFIELD4);
        PANEL2.add(LABEL6);
        PANEL2.add(TEXTFIELD5);
        PANEL2.add(LABEL7);
        PANEL2.add(TEXTFIELD6);
        PANEL2.add(LABEL8);
        PANEL2.add(TEXTFIELD7);
        TEXTFIELD1.setPreferredSize(new Dimension(50, 30));
        TEXTFIELD2.setPreferredSize(new Dimension(50, 30));
        TEXTFIELD3.setPreferredSize(new Dimension(50, 30));
        TEXTFIELD4.setPreferredSize(new Dimension(50, 30));
        TEXTFIELD5.setPreferredSize(new Dimension(50, 30));
        TEXTFIELD6.setPreferredSize(new Dimension(50, 30));
        TEXTFIELD7.setPreferredSize(new Dimension(50, 30));

        PANEL1.setPreferredSize(new Dimension(400, 50));
        PANEL1.add(LABEL1);
        PANEL1.add(RADIOBUTTON1);
        PANEL1.add(RADIOBUTTON2);
        PANEL1.add(RADIOBUTTON3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (RADIOBUTTON1.isSelected()) {
            TEXTFIELD1.setEditable(false);
            TEXTFIELD2.setEditable(false);
            TEXTFIELD3.setEditable(true);
            TEXTFIELD4.setEditable(false);
            TEXTFIELD5.setEditable(false);
            TEXTFIELD6.setEditable(false);
            TEXTFIELD7.setEditable(false);
        } else if (RADIOBUTTON2.isSelected()) {
            TEXTFIELD1.setEditable(true);
            TEXTFIELD2.setEditable(true);
            TEXTFIELD3.setEditable(false);
            TEXTFIELD4.setEditable(false);
            TEXTFIELD5.setEditable(false);
            TEXTFIELD6.setEditable(false);
            TEXTFIELD7.setEditable(false);
        } else if (RADIOBUTTON3.isSelected()) {
            TEXTFIELD1.setEditable(false);
            TEXTFIELD2.setEditable(false);
            TEXTFIELD3.setEditable(true);
            TEXTFIELD4.setEditable(true);
            TEXTFIELD5.setEditable(true);
            TEXTFIELD6.setEditable(false);
            TEXTFIELD7.setEditable(false);
        }

        if (e.getSource() == BUTTON1) {
            try {
                if (RADIOBUTTON1.isSelected()) {
                    TEXTFIELD6.setText(Double.toString(getSquareArea()));
                } else if (RADIOBUTTON2.isSelected()) {
                    TEXTFIELD6.setText(Double.toString(getRectangleArea()));
                } else if (RADIOBUTTON3.isSelected()) {
                    TEXTFIELD6.setText(Double.toString(getTriangleArea()));
                }
            } catch (Exception objEx) {
                JOptionPane.showMessageDialog(null, "Only numbers can be accepted by the text fields.", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }

        if (e.getSource() == BUTTON2) {
            try {
                if (RADIOBUTTON1.isSelected()) {
                    TEXTFIELD7.setText(Double.toString(getSquarePerimeter()));
                } else if (RADIOBUTTON2.isSelected()) {
                    TEXTFIELD7.setText(Double.toString(getRectanglePerimeter()));
                } else if (RADIOBUTTON3.isSelected()) {
                    TEXTFIELD7.setText(Double.toString(getTrianglePerimeter()));
                }
            } catch (Exception objEx) {
                JOptionPane.showMessageDialog(null, "Only numbers can be accepted by the text fields.", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }

        if (e.getSource() == BUTTON3) {
            clearFields();
        }
    }

    public void clearFields() {
        RADIOBUTTON1.setSelected(false);
        RADIOBUTTON2.setSelected(false);
        RADIOBUTTON3.setSelected(false);
        TEXTFIELD1.setText("");
        TEXTFIELD2.setText("");
        TEXTFIELD3.setText("");
        TEXTFIELD4.setText("");
        TEXTFIELD5.setText("");
        TEXTFIELD6.setText("");
        TEXTFIELD7.setText("");
    }
    
    public double getSquareArea() {
        double dblSide = Double.parseDouble(TEXTFIELD3.getText());
        return dblSide * dblSide;
    } 

    public double getRectangleArea() {
        double dblLength = Double.parseDouble(TEXTFIELD1.getText());
        double dblWidth = Double.parseDouble(TEXTFIELD2.getText());
        return dblLength * dblWidth;
    }
            
    public double getTriangleArea() {
        double dblBase = Double.parseDouble(TEXTFIELD5.getText());
        double dblHeight = Double.parseDouble(TEXTFIELD4.getText());
        return 0.5 * (dblBase * dblHeight);
    }

    public double getSquarePerimeter() {
        double dblSide = Double.parseDouble(TEXTFIELD3.getText());
        return 4 * dblSide;
    }

    public double getRectanglePerimeter() {
        double dblLength = Double.parseDouble(TEXTFIELD2.getText());
        double dblWidth = Double.parseDouble(TEXTFIELD3.getText());
        return (2 * dblLength) + (2 * dblWidth);
    }

    public double getTrianglePerimeter() {
        double dblBase = Double.parseDouble(TEXTFIELD3.getText());
        double dblHeight = Double.parseDouble(TEXTFIELD4.getText());
        double dblSide = Double.parseDouble(TEXTFIELD5.getText());
        return dblSide + dblHeight + dblBase;
    }

    public static void main(String[] args) {
        new Area().setVisible(true);
    }
}
