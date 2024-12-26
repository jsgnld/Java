// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// public class Portal {

//     // Global Variables
//     static JTextField unitsEnrolled, amountTotal;
//     static JComboBox<String> cbYearLevel;
//     static JRadioButton btnPartialScholar, btnFullScholar, btnNonScholar;
//     static JButton btnCompute, btnClear;
//     static JCheckBox chbLaboratoryFee, chbRegistrationCard, chbCatalyst, chbStudentCouncil, chbStudentID, chbOtherMisc;
//     static ButtonGroup scholarshipTypes;
//     static int yearLevelFee, computedAmount, otherFee;

//     public static void main(String[] args){

//         // Panel1
//         JPanel panel1 = new JPanel();
//         panel1.setLayout(new FlowLayout(FlowLayout.LEFT));

//             JTextField studentName = new JTextField(20);
//             unitsEnrolled = new JTextField(20);

//                 String[] years = {"First Year", "Second Year", "Third Year", "Fourth Year", "Fifth Year"};
//                 cbYearLevel = new JComboBox<>(years);
//                 cbYearLevel.setPreferredSize(new Dimension(243,20));
//                 cbYearLevel.setSelectedIndex(-1);
        
//                     panel1.add(new JLabel("Student Name:"));
//                     panel1.add(studentName);
//                     panel1.add(new JLabel("Units Enrolled: "));
//                     panel1.add(unitsEnrolled);
//                     panel1.add(new JLabel("Year Level:"));
//                     panel1.add(cbYearLevel);




//         // Panel 2
//         JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT,10,0));

//             chbLaboratoryFee = new JCheckBox("Laboratory Fee  ₱200");
//             chbRegistrationCard= new JCheckBox("Registration Card  ₱50");
//             chbCatalyst = new JCheckBox("Catalyst  ₱50");
//             chbStudentCouncil = new JCheckBox("Student Council  ₱50");
//             chbStudentID = new JCheckBox("Student ID  ₱50");
//             chbOtherMisc = new JCheckBox("Other Miscellaneous  ₱100");

//                 panel2.add(new JLabel("Other Fees:"));
//                 panel2.add(chbLaboratoryFee);;
//                 panel2.add(chbStudentCouncil);
//                 panel2.add(chbRegistrationCard);;
//                 panel2.add(chbStudentID);;
//                 panel2.add(chbCatalyst);
//                 panel2.add(chbOtherMisc);




//         // Panel 3
//         JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT,10,0));

//             btnNonScholar = new JRadioButton("Non-Scholar");
//             btnFullScholar = new JRadioButton("Full Scholar");
//             btnPartialScholar = new JRadioButton("Partial Scholar");
//             scholarshipTypes = new ButtonGroup();
//             amountTotal = new JTextField(20);
//             btnCompute = new JButton("COMPUTE");
//             btnClear = new JButton("CLEAR");

//                 scholarshipTypes.add(btnNonScholar);
//                 scholarshipTypes.add(btnFullScholar);
//                 scholarshipTypes.add(btnPartialScholar);
//                 amountTotal.setEditable(false);

//                     panel3.add(new JLabel("Scholarship Grants:"));
//                     panel3.add(btnNonScholar);
//                     panel3.add(btnFullScholar);
//                     panel3.add(btnPartialScholar);

//                         panel3.add(new JLabel("|    Total Amount: "));
//                         panel3.add(amountTotal);
//                         panel3.add(btnCompute);
//                         panel3.add(btnClear);




//         // Clear Button Function
//         btnClear.addActionListener(e -> {
//             amountTotal.setText("");
//             unitsEnrolled.setText("");
//             studentName.setText("");
//             cbYearLevel.setSelectedIndex(-1);
//             scholarshipTypes.clearSelection();
//             chbOtherMisc.setSelected(false);
//             chbStudentID.setSelected(false);
//             chbStudentCouncil.setSelected(false);
//             chbCatalyst.setSelected(false);
//             chbRegistrationCard.setSelected(false);
//             chbLaboratoryFee.setSelected(false);
//         });




//         try { 
//             // Compute Button Function
//             btnCompute.addActionListener( e-> {
//                 int fee = getOtherFee();
//                 int scholarship = scholarShipAmount();
//                 int yearFee = getYearLevelFee();

//                     int total = fee + scholarship + yearFee;

//                         amountTotal.setText(Integer.toString(total));
                
//             });
//         } catch (ArithmeticException e) {

//         }


//         // WINDOW
//         JFrame frmMain = new JFrame("Student Enrollment System");
//         frmMain.setSize(1000,160);
//         frmMain.setLayout(new FlowLayout(FlowLayout.LEFT));
//         frmMain.setLocationRelativeTo(null);

//             // COMPONENTS
//             frmMain.add(panel1);
//             frmMain.add(panel2);
//             frmMain.add(panel3);

//         frmMain.setVisible(true);

//     } // Main




//     private static int scholarShipAmount(){

//             if (btnNonScholar.isSelected()){
//                 computedAmount = (Integer.parseInt(unitsEnrolled.getText()) * 10);
//             } else if (btnFullScholar.isSelected()){
//                 computedAmount = 0;
//             } else if (btnPartialScholar.isSelected()){
//                 computedAmount = ((Integer.parseInt(unitsEnrolled.getText()) * 10)) / 2;
//             }

//                 return computedAmount;
//     }


//     // Other fee
//     private static int getOtherFee(){

//         otherFee = 0;

//         if(chbLaboratoryFee.isSelected()) ++ otherFee;
//         if(chbRegistrationCard.isSelected()) ++ otherFee;
//         if(chbCatalyst.isSelected()) ++ otherFee;
//         if(chbStudentCouncil.isSelected()) ++ otherFee;
//         if(chbStudentID.isSelected()) ++ otherFee;
//         if(chbOtherMisc.isSelected()) ++ otherFee;
        
//             return otherFee;
//     }


//     // Year Level Fee
//     private static int getYearLevelFee(){

//         yearLevelFee = 0;

//         String year = (String) cbYearLevel.getSelectedItem();

//         switch(year){
//             case "First Year":
//             return yearLevelFee += 100;

//             case "Second Year":
//             return yearLevelFee += 200;

//             case "Third Year":
//             return yearLevelFee += 300;


//             case "Fourth Year":
//             return yearLevelFee += 400;

//             case "Fifth Year":
//             return yearLevelFee += 500;

//             default:
//             return yearLevelFee += 0;
//         }
//     }

// }