// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// public class Restaurant {

    
//     // Global Variables
//     static JCheckBox chbSoup, chbCoffee, chbSiopao;
//     static JTextField numOfSoup, numOfCoffee, numOfSiopao, totalBill, change, amountGiven;


//     public static void main(String[] args){

//         // Panel 1
//         JPanel panel1 = new JPanel();
//         panel1.setLayout(new FlowLayout(FlowLayout.LEFT));

//             chbSoup = new JCheckBox("Soup   ");
//             chbCoffee = new JCheckBox("Coffee ");
//             chbSiopao = new JCheckBox("Siopao");

//             numOfSoup = new JTextField(20);
//             numOfCoffee = new JTextField(20);
//             numOfSiopao = new JTextField(20);

//                     panel1.add(chbSoup);
//                     panel1.add(numOfSoup);
//                     panel1.add(chbCoffee);
//                     panel1.add(numOfCoffee);
//                     panel1.add(chbSiopao);
//                     panel1.add(numOfSiopao);

//                         JButton btnComputeBill = new JButton("Compute Bill");
//                             btnComputeBill.setPreferredSize(new Dimension(153,26));
//                         JButton btnClearAll = new JButton("Clear All");
//                             btnClearAll.setPreferredSize(new Dimension(153,26));

//                                 panel1.add(btnComputeBill);
//                                 panel1.add(btnClearAll);

//                                     JLabel totalBillLabel = new JLabel("Total Bill is:");
//                                     totalBill = new JTextField(21);
//                                     totalBill.setEditable(true);

//                                         panel1.add(totalBillLabel);
//                                         panel1.add(totalBill);

//                                             JLabel amountGivenLabel = new JLabel("Amount Given is:");
//                                             amountGiven = new JTextField(18);

//                                                 panel1.add(amountGivenLabel);
//                                                 panel1.add(amountGiven);

//                                                     JLabel changeLabel = new JLabel("Change:  ");
//                                                     change = new JTextField(22);
//                                                     change.setEditable(false);

//                                                         panel1.add(changeLabel);
//                                                         panel1.add(change);

//                                                             JButton btnComputeChange = new JButton("Compute Change");
//                                                                 btnComputeChange.setPreferredSize(new Dimension(153,26));
//                                                             JButton btnClose = new JButton("Close");
//                                                                 btnClose.setPreferredSize(new Dimension(153,26));

//                                                                     panel1.add(btnComputeChange);
//                                                                     panel1.add(btnClose);
//         // Compute bill button functionility
//         btnComputeBill.addActionListener(e -> {
//             int bill = computedBill();
//             totalBill.setText(Integer.toString(bill));
//         });


//         // Compute change button functionility
//         btnComputeChange.addActionListener(e -> {
//             int calculatedChange = computedChange();
//             change.setText(Integer.toString(calculatedChange));
//         });


//         // Clear button functionility
//         btnClearAll.addActionListener(e -> {
//             chbSoup.setSelected(false);
//             chbCoffee.setSelected(false);
//             chbSiopao.setSelected(false);
//             numOfSoup.setText("");
//             numOfCoffee.setText("");
//             numOfSiopao.setText("");
//             totalBill.setText("");
//             amountGiven.setText("");
//             change.setText("");
//         });

//         // Close button functionility
//         btnClose.addActionListener(e ->{
//             int result = JOptionPane.showConfirmDialog(null,"Are you sure you want to exit?", "",JOptionPane.WARNING_MESSAGE,JOptionPane.YES_NO_OPTION);
//             if(result == JOptionPane.YES_OPTION){
//                 System.exit(0);
//             }
//         });


//         // Main Frame
//         JFrame frmMain = new JFrame();
//         frmMain.setSize(340,270);
//         //frmMain.setLayout(new FlowLayout());
//         frmMain.setLocationRelativeTo(null);
        
//             frmMain.add(panel1);

//         frmMain.setVisible(true);


//     } // Main -------------------------------------------

//     public static int computedBill(){

//     int totalBill = 0;

//         if(chbSoup.isSelected()) totalBill += (25 * Integer.parseInt(numOfSoup.getText()));
//         if(chbCoffee.isSelected()) totalBill += (20 * Integer.parseInt(numOfSoup.getText()));
//         if(chbSiopao.isSelected()) totalBill += (15 * Integer.parseInt(numOfSoup.getText()));

//         return totalBill;
//     }

//     public static int computedChange(){
//         try {
//             int change = 0;
//             int givenAmount = Integer.parseInt(amountGiven.getText());
//             if (givenAmount > Integer.parseInt(totalBill.getText())){
//                 change = givenAmount - Integer.parseInt(totalBill.getText());
//             } else {
//                 JOptionPane.showMessageDialog(null,"KULANG YA!", "", JOptionPane.WARNING_MESSAGE);
//             }
//             return change;
//         } catch(Exception e) {
//             JOptionPane.showMessageDialog(null,"KULANG YA!", "", JOptionPane.WARNING_MESSAGE);
//             return 0;
//         }
//     }

// } // MJRCR ----------------------------------------------


// /*
//  * NOTES
//  * String to Int = Integer.parseInt();  
//  * Int to String = Integer.toString();
//  */