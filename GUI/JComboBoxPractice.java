// import javax.swing.*;    // Container-Component Elements
// import java.awt.*;       // GUI Functionality ToolKit
// import java.awt.event.*; // BackEnd Functionality

// public class JComboBoxPractice {
    
//     // JComboBox is a Swing component that provides a drop-down list of items from which the user can make a selection

//     public static void main(String[] args) {

//         // Panel
//         JPanel panel1 = new JPanel();
//         panel1.setLayout(new FlowLayout());

//         // 1. Create an array of items you wanted to display in the drop-down
//         String[] names = {"Jaekhyung", "Seungho", "Alex", "Heesoo", "Beomjoon", "Jaehyuk"};

//             // 2. Install the array for drop-down (ComboBox)
//             JComboBox<String> myHusbands = new JComboBox<>(names);
//             myHusbands.setSelectedIndex(-1);
//             myHusbands.setPreferredSize(new Dimension(100, 20));


//                 JLabel label1 = new JLabel ("myHusbands ___________");

//                 panel1.add(label1);
//                 panel1.add(myHusbands);

//                     // ActionListener for Drop-down (ComboBox)
//                     myHusbands.addActionListener(e -> { 
//                         String selectedHusbands = myHusbands.getSelectedItem().toString();
//                         label1.setText("None other than " + selectedHusbands + "         ");
//                         myHusbands.setSelectedIndex(-1);
//                         JOptionPane.showMessageDialog(panel1, "None Other than " + selectedHusbands, "OK!", JOptionPane.PLAIN_MESSAGE);
//                     });

//         // Main Frame
//         JFrame mainFrame = new JFrame();
//         mainFrame.setSize(300, 200);
//         mainFrame.setLayout(new FlowLayout());
//         mainFrame.setLocationRelativeTo(null);
//         mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//             // Components
//             mainFrame.add(panel1);

//         mainFrame.setVisible(true);
//     } // Main Program
// } // JComboBox Main Class
