// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;


// public class LogIn {

//     public static void main(String[] args) {

//     // PANEL 1
//     JPanel panel1 = new JPanel();
//     JLabel userLabel = new JLabel("User: ");
//         userLabel.setBounds(10, 20, 80, 25);
//         panel1.add(userLabel);

//         // TEXTFIELD
//         JTextField txtField1 = new JTextField(20);
//             txtField1.setBounds(100, 20, 165, 25);
//             panel1.add(txtField1);

//     // PANEL 2
//     JPanel panel2 = new JPanel();
//     JLabel passwordLabel = new JLabel("Password: ");
//         passwordLabel.setBounds(10, 50, 80, 25);
//         panel2.add(passwordLabel);

//         // TEXTFIELD
//         JPasswordField passwordText = new JPasswordField(20);
//             passwordText.setBounds(100, 50, 165, 25);
//             panel2.add(passwordText);

//         // PANEL 3 - BUTTON
//         JPanel panel3 = new JPanel();
//         JButton btn1 = new JButton("Log in");
//         btn1.setBounds(10, 80, 80, 25);
//             panel3.add(btn1);

//         JLabel success = new JLabel("");
//             success.setBounds(10, 110, 300, 25);
//             panel3.add(success);

          

//     // WINDOW
//     JFrame frmMain = new JFrame("Log In");
//     frmMain.setSize(400, 400);
//     frmMain.setLayout(new FlowLayout(FlowLayout.LEFT));
//     frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     frmMain.setLocationRelativeTo(null);
//         frmMain.add(panel1);
//         frmMain.add(panel2);
//         frmMain.add(panel3);

//     frmMain.setVisible(true);

//     } // Main Program
// } // LogIn Class