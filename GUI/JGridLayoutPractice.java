// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// public class JGridLayoutPractice {

//     public static void main(String[] args) {

//         // PANEL 1
//         JPanel panel1 = new JPanel();
//         panel1.setLayout(new GridLayout(4,2));

//             JLabel label1 = new JLabel("NAME");
//             JLabel label2 = new JLabel("CODE");
//             JLabel label3 = new JLabel("DESIGNATION");
//             JLabel label4 = new JLabel("SALARY");

//             JTextField txtField1 = new JTextField(20);
//             JTextField txtField2 = new JTextField(20);
//             JTextField txtField3 = new JTextField(20);
//             JTextField txtField4 = new JTextField(20);

//                 panel1.add(label1);
//                 panel1.add(txtField1);
//                 panel1.add(label2);
//                 panel1.add(txtField2);
//                 panel1.add(label3);
//                 panel1.add(txtField3);
//                 panel1.add(label4);
//                 panel1.add(txtField4);

//         // PANEL 2
//         JPanel panel2 = new JPanel();
//             JButton button1 = new JButton("SAVE");
//             JButton button2 = new JButton("EXIT");

//                 panel2.add(button1);
//                 panel2.add(button2);

//         // Main Frame
//         JFrame mainFrame = new JFrame("GridLayout");
//         mainFrame.setSize(400,400);
//         mainFrame.setLayout(new GridLayout(4,2,10,10));
//         mainFrame.setLocationRelativeTo(null);
//         mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//             mainFrame.add(panel1);
//             mainFrame.add(panel2);

//         mainFrame.setVisible(true);
    
//     } // Main Program
// } // Main Class