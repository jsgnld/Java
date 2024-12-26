// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// public class Practice {

//     public static void main(String[] args) {

//         // PANEL 1
//         JPanel panel1 = new JPanel();
//         JLabel lbl1 = new JLabel("Student Name: ");
//         lbl1.setLayout(new FlowLayout(FlowLayout.LEFT));
//             panel1.add(lbl1);

//             // TEXTFIELD
//             JTextField txtField1 = new JTextField(20);
//                 panel1.add(txtField1);
        
//         // PANEL 2
//         JPanel panel2 = new JPanel();
//         JLabel lbl2 = new JLabel("Units Enrolled: ");
//         lbl2.setLayout(new FlowLayout(FlowLayout.LEFT));
//             panel2.add(lbl2);

//             // TEXTFIELD
//             JTextField txtField2 = new JTextField(20);
//                 panel2.add(txtField2);

//         // PANEL 3
//         JPanel panel3 = new JPanel();
//         JLabel lbl3 = new JLabel("Year Level:        ");
//         lbl2.setLayout(new FlowLayout(FlowLayout.LEFT));

//         String[] years= {"1st Year", "2nd Year", "3rd Year", "4th Year", "5th year"};

//             JComboBox<String> yearLevel = new JComboBox<>(years);
//             yearLevel.setSelectedIndex(-1);
//             yearLevel.setPreferredSize(new Dimension(200,20));

//                 panel3.add(lbl3);
//                 panel3.add(yearLevel);

//         // PANEL 4
//         JPanel panel4 = new JPanel();
//         JLabel lbl4 = new JLabel("Other Fees:");
//         panel4.setLayout(new FlowLayout());
//             panel4.add(lbl4);

//         // PANEL 5
//         JPanel panel5 = new JPanel();
//         panel5.setLayout(new GridLayout(3,2));
//         JCheckBox  chkBox1 = new JCheckBox("Laboratory Fee      P200");
//         JCheckBox  chkBox2 = new JCheckBox("Registration Card   P50");
//         JCheckBox  chkBox3 = new JCheckBox("Catalyst            P50");
//         JCheckBox  chkBox4 = new JCheckBox("Student Council     P50");
//         JCheckBox  chkBox5 = new JCheckBox("Student ID          P50");
//         JCheckBox  chkBox6 = new JCheckBox("Other Miscellaneous P100");

//             panel5.add(chkBox1);
//             panel5.add(chkBox2);
//             panel5.add(chkBox3);
//             panel5.add(chkBox4);
//             panel5.add(chkBox5);
//             panel5.add(chkBox6);

//         // PANEL 6
//         JPanel panel6 = new JPanel();
//         JLabel lbl6 = new JLabel("Scholarship Grants:  ");
//         panel6.setLayout(new GridLayout(3,1));
//             panel6.add(lbl6);
//         JRadioButton rdButton1 = new JRadioButton("Non-Scholar");
//         JRadioButton rdButton2 = new JRadioButton("Full Scholar");
//         JRadioButton rdButton3 = new JRadioButton("Partial Scholar");

//             panel6.add(rdButton1);
//             panel6.add(rdButton2);
//             panel6.add(rdButton3);

//         // WINDOW
//         JFrame frmMain = new JFrame();
//         frmMain.setSize(500,600);
//         frmMain.setLayout(new GridLayout(8,1));
//         frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frmMain.setLocationRelativeTo(null);
//             frmMain.add(panel1);
//             frmMain.add(panel2);
//             frmMain.add(panel3);
//             frmMain.add(panel4);
//             frmMain.add(panel5);
//             frmMain.add(panel6);

//         frmMain.setVisible(true);

//     } // Main Program
// } // Main Class