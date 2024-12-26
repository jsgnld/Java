// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// public class Ordering {

//     // Global Variables
//     static JRadioButton rbExtraRice, rbNoExtraRice;
//     static JCheckBox chbValueMeal1, chbValueMeal2, chbValueMeal3;
//     static JTextField totalBillField;

//     public static void main(String[] args) {

//         String shopPASSWORD = "JAMES REID";

//         // Panel 1 = UserName, Password
//         JPanel panel1 = new JPanel();
//         panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
//             JTextField userNameField = new JTextField(15);
//             JLabel userNameLabel = new JLabel("User Name:");
//             JPasswordField passwordField = new JPasswordField(15);
//             JLabel passwordLabel = new JLabel("Password: ");
//             JButton btnOK = new JButton("OK");

//                 btnOK.setFocusable(false);

//                     panel1.add(userNameLabel);
//                     panel1.add(userNameField);
//                     panel1.add(passwordLabel);
//                     panel1.add(passwordField);
//                     panel1.add(btnOK);


//         // Panel 2 = Choose Order Text
//         JPanel panel2 = new JPanel();
//         panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
//             panel2.add(new JLabel("Choose Your Order:"));
                


//         // Panel 3 = CheckBoxes and Dropdown
//         JPanel panel3 = new JPanel();
//         panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));

//             chbValueMeal1 = new JCheckBox("Value Meal #1: ₱25.00");
//             chbValueMeal2 = new JCheckBox("Value Meal #2 ₱30.00");
//             chbValueMeal3 = new JCheckBox("Value Meal #3 ₱35.00");
            
//                 String[] drinks = {"Coke", "Cobra", "Sting", "Sprite", "Bodily Fluids"};
//                 JComboBox<String> cbDrinks = new JComboBox<>(drinks);

//                         cbDrinks.setSelectedIndex(-1);
//                         cbDrinks.setPreferredSize(new Dimension(60,20));

//                             panel3.add(chbValueMeal1);
//                             panel3.add(chbValueMeal2);
//                             panel3.add(chbValueMeal3);
//                             panel3.add(cbDrinks);



//         // Panel 4 = Radio Buttons and Add Rice
//         JPanel panel4 = new JPanel();
//         panel4.setLayout(new FlowLayout());

//             rbExtraRice = new JRadioButton("Extra Rice");
//             rbNoExtraRice = new JRadioButton("No Extra Rice");
//             ButtonGroup buttonGroup = new ButtonGroup();
//             JButton btnCompute = new JButton("Compute");

//                 buttonGroup.add(rbExtraRice);
//                 buttonGroup.add(rbNoExtraRice);

//                     panel4.add(rbExtraRice);
//                     panel4.add(rbNoExtraRice);
//                     panel4.add(btnCompute);


        
//         // PaneL 5 = Total Bill 
//         JPanel panel5 = new JPanel();
//         panel5.setLayout(new FlowLayout());

//             JLabel totalBillLabel = new JLabel("Total Bill is: ");
//             totalBillField = new JTextField(10);
                
//                 totalBillField.setText("0.0");
//                 totalBillField.setEnabled(false);

//                     panel5.add(totalBillLabel);
//                     panel5.add(totalBillField);



//         // Panel 6 = Compute-Clear Buttons
//         JPanel panel6 = new JPanel();
//         panel6.setLayout(new FlowLayout(FlowLayout.RIGHT));

//             JButton btnClear = new JButton("Clear");
//             JButton btnClose = new JButton("Close");

//                 panel6.add(btnClear);
//                 panel6.add(btnClose);



//                     // Disable all upon laod
//                     disableComponents(chbValueMeal1, chbValueMeal2, chbValueMeal3, cbDrinks, rbExtraRice, rbNoExtraRice, btnCompute, btnClear, btnClose);
        
//                     try {
                        
//                         btnOK.addActionListener(e -> {

//                             char[] getUserPass = passwordField.getPassword();
//                             String userPassword = new String(getUserPass);
                            
//                             if (userPassword.equals(shopPASSWORD) && !userNameField.getText().equals("")){
//                                 enableComponents(chbValueMeal1, chbValueMeal2, chbValueMeal3, cbDrinks, rbExtraRice, rbNoExtraRice, btnCompute, btnClear, btnClose);
//                             } else if(!userPassword.equals("") && userNameField.getText().equals("")) {
//                                 JOptionPane.showMessageDialog(null, "BOY WALA KANG USERNAME", "No Username", JOptionPane.ERROR_MESSAGE);
//                                 passwordField.setText("");
//                             } else {
//                                 JOptionPane.showMessageDialog(null, "MALI ANG PASSWORD MO BAI\nHINT: p0gi", "Invalid Password", JOptionPane.ERROR_MESSAGE);
//                                 passwordField.setText("");
//                             }
//                         });     
//                     } 
//                     catch (Exception e)
//                     {
//                         e.printStackTrace();
//                         JOptionPane.showMessageDialog(null, "An error occurred. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
//                     }
                    

                    



//                     // Compute Button 
//                     btnCompute.addActionListener(e -> {
//                         int computedTotalAmount = computeTotal();
//                         totalBillField.setText(Integer.toString(computedTotalAmount));
//                     });



//                     // Clear Button
//                     btnClear.addActionListener(e -> {

//                         int result = JOptionPane.showConfirmDialog(null,"Are you sure you want to clear?", "CONFIRM", JOptionPane.YES_NO_OPTION);

//                         if (result == JOptionPane.YES_OPTION){
                            
//                             cbDrinks.setSelectedIndex(-1);
//                             rbExtraRice.setSelected(false);
//                             buttonGroup.clearSelection();
//                             chbValueMeal1.setSelected(false);
//                             chbValueMeal2.setSelected(false);
//                             chbValueMeal3.setSelected(false);
//                             totalBillField.setText("");
//                         }

//                     });


//                     // Close Button
//                     btnClose.addActionListener(e -> {
//                         int result = JOptionPane.showConfirmDialog(null,"Are you sure you want to close?", "CONFIRM", JOptionPane.YES_NO_OPTION);
//                         if (result == JOptionPane.YES_NO_OPTION){
//                             System.exit(0);
//                         }
//                     });


//         // Main Frame
//         JFrame mainFrame = new JFrame("Jolly McKing");
//         mainFrame.setSize(320,600);
//         mainFrame.setLayout(new GridLayout(6,1));
//         mainFrame.setLocationRelativeTo(null);

//             // Components
//             mainFrame.add(panel1);
//             mainFrame.add(panel2);
//             mainFrame.add(panel3);
//             mainFrame.add(panel4);
//             mainFrame.add(panel5);
//             mainFrame.add(panel6);

//         mainFrame.setVisible(true);


//     } // Main ------------------------------

//     // Compute Total
//     private static int computeTotal(){

//         int totalBill = 0;

//         if(chbValueMeal1.isSelected()) totalBill += 25;
//         if(chbValueMeal2.isSelected()) totalBill += 30;
//         if(chbValueMeal3.isSelected()) totalBill += 35;

//         if (rbExtraRice.isSelected()){
//             totalBill += 25;
//         } 

//         return totalBill;
//     }

//     // Disabling Components
//     private static void disableComponents(Component... components) {
//         for (Component component : components) {
//             if (component instanceof Container) {
//                 disableComponents(((Container) component).getComponents());
//             }
//             component.setEnabled(false);
//         }
//     }

//     // Enable Components
//     private static void enableComponents(Component... components) {
//         for (Component component : components) {
//             if (component instanceof Container) {
//                 enableComponents(((Container) component).getComponents());
//             }
//             component.setEnabled(true);
//         }
//     }
// }