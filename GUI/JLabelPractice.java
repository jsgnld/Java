// import javax.swing.*; // sineselect lahat ng swing na available
// import java.awt.*; // GUI Functionality ToolKit
// import java.awt.event.*; // GUI Backend Functionality

// public class JLabelPractice {
    
//     // JLabel is a Swing component in Java used to Display text or an image on a graphica; user interface (GUI)

//     public static void main (String[] args) {
 
//         // Panel | Display Area
//         JPanel panel1 = new JPanel();
//         panel1.setLayout(new FlowLayout());

//             // Panel Components
//             JLabel label1 = new JLabel("CHOCOLATE");
//             JLabel label2 = new JLabel("CHOCOLATE");
            
//             panel1.add(label1);
//             panel1.add(label2);

//                 JPanel miniPanel1 = new JPanel();
//                 miniPanel1.setLayout(new BorderLayout());
//                 miniPanel1.add(new JLabel("CREAM"), BorderLayout.CENTER);

//                 panel1.add(miniPanel1);

//             JPanel panel2 = new JPanel();
//             panel2.setLayout(new FlowLayout());
    
//                 JLabel label4 = new JLabel("VANILLA");
//                 JLabel label5 = new JLabel("VANILLA");
                
//                 panel2.add(label4);
//                 panel2.add(label5);

//                 JPanel miniPanel2 = new JPanel();
//                 miniPanel2.setLayout(new BorderLayout());
//                 miniPanel2.add(new JLabel("SODA SKY"), BorderLayout.CENTER);

//                 panel2.add(miniPanel2);

//         // Main Frame | Window
//         JFrame mainFrame = new JFrame(); 
//         mainFrame.setSize(300,400);
//         mainFrame.setLayout(new GridLayout(2,2)); 
//         mainFrame.setLocationRelativeTo(null); // Referent to which component it will center. (Optional)
//         mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Function for closing the frame (Optional)
//         mainFrame.setResizable(true); // function for resizing of the window (Optional)      
//             mainFrame.add(panel1);
//             mainFrame.add(panel2);

//         mainFrame.setVisible(true);

//     } // Main class
// } // Label Practice Class