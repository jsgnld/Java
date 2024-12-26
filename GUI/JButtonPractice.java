// import javax.swing.*;    // Container-Component Elements
// import java.awt.*;       // GUI Functionality ToolKit
// import java.awt.event.*; // BackEnd Functionality 

// public class JButtonPractice {
    
//     public static void main(String[] args) {

// // JButtons is a swing component in java that renders a button on a screen and responds to user's clicking event
// // for performing a specific task. 

//         // Panel1 = Buttons
//         JPanel panel1 = new JPanel();
//         panel1.setLayout(new FlowLayout());

//             // JButton Components
//             JButton button1 = new JButton("BUTTON 1");
//             JButton button2 = new JButton("BUTTON 2");
//             JButton button3 = new JButton("BUTTON 3");
//             JButton button4 = new JButton("BUTTON 4");
            
//                 panel1.add(button1);
//                 panel1.add(button2);
//                 panel1.add(button3);
//                 panel1.add(button4);

// // JCheckBox is a swing component in java that creates an initially unselected check box with no text or icon.

//         // Panel2 = Checkboxes
//         JPanel panel2 = new JPanel();
//         panel2.setLayout(new FlowLayout());

//             // JCheckBox Components
//             JCheckBox checkBox1 = new JCheckBox("Checkbox 1");
//             JCheckBox checkBox2 = new JCheckBox("Checkbox 2");
//             JCheckBox checkBox3 = new JCheckBox("Checkbox 3");
//             JCheckBox checkBox4 = new JCheckBox("Checkbox 4");
            
//                 panel2.add(checkBox1);
//                 panel2.add(checkBox2);
//                 panel2.add(checkBox3);
//                 panel2.add(checkBox4);

// // 

//         // Panel3 = RadioButtons
//         JPanel panel3 = new JPanel();
//         panel3.setLayout(new FlowLayout());

//             // JRadioButtons Components
//             JRadioButton radioButton1 = new JRadioButton("Radio Button 1");
//             JRadioButton radioButton2 = new JRadioButton("Radio Button 2");
//             JRadioButton radioButton3 = new JRadioButton("Radio Button 3");
//             JRadioButton radioButton4 = new JRadioButton("Radio Button 4");
            
//                 ButtonGroup buttonGroup1 = new ButtonGroup();
                
//                     buttonGroup1.add(radioButton1);
//                     buttonGroup1.add(radioButton2);
//                     buttonGroup1.add(radioButton3);
//                     buttonGroup1.add(radioButton4);

//                 panel3.add(radioButton1);
//                 panel3.add(radioButton2);
//                 panel3.add(radioButton3);
//                 panel3.add(radioButton4);

//         // Panel4 = JToggleButton
//         JPanel panel4 = new JPanel();
//         panel4.setLayout(new FlowLayout());

//             // JToggleButton Components
//             JToggleButton toggleButton1 = new JToggleButton("Toggle Button 1");
//             JToggleButton toggleButton2 = new JToggleButton("Toggle Button 2");
//             JToggleButton toggleButton3 = new JToggleButton("Toggle Button 3");
//             JToggleButton toggleButton4 = new JToggleButton("Toggle Button 4");
            
//                 panel4.add(toggleButton1);
//                 panel4.add(toggleButton2);
//                 panel4.add(toggleButton3);
//                 panel4.add(toggleButton4);
        
//         // Panel5 = JTextField
//         JPanel panel5 = new JPanel();
//         panel5.setLayout(new FlowLayout());

//             // JTextField Components
//             JTextField textField = new JTextField(20);

//                 panel5.add(textField);

//         // Main Frame
//         JFrame mainFrame = new JFrame();
//         mainFrame.setSize(400, 500);
//         mainFrame.setLayout(new GridLayout(3,1));
//         mainFrame.setLocationRelativeTo(null);
//         mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//             //Components
//             mainFrame.add(panel1);
//             mainFrame.add(panel2);
//             mainFrame.add(panel3);
//             mainFrame.add(panel4);
//             mainFrame.add(panel5);

//         mainFrame.setVisible(true);

//         } // Main Program
// } // Jbutton Class
