package JAVA.GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AguinaldoQno1 implements ActionListener {
    JLabel drink, brewingstyle, amountphp;
    JRadioButton drip, pourover, cold, espresso, ristretto;
    JCheckBox hot, bread, toastbread;
    JButton calculate, clear;
    JTextField amounttxt;
    JComboBox<String> drinkBox;
    ButtonGroup style;

    int totalamount = 0, brew = 0, drinkamt = 0, others = 0;
    AguinaldoQno1(){
        JFrame coffee = new JFrame();
        coffee.setTitle("OOP Coffee Shop");
        coffee.setLayout(new GridLayout(6,1));
        coffee.setSize(400,500);
        coffee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        coffee.setVisible(true);

        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
            drink = new JLabel("Drink");
            String[] options = {"Espresso", "Red Eye", "Black Eye", "Americano", "Macchiato", "Cappuccino", "Cafe Latte"};
            drinkBox = new JComboBox<>(options);

            p1.add(drink);
            p1.add(drinkBox);
        coffee.add(p1);

        JPanel p2 = new JPanel(new GridLayout(6,1));
            brewingstyle = new JLabel("Brewing Style");
            drip = new JRadioButton ("Drip");
            pourover = new JRadioButton ("Pour Over");
            cold = new JRadioButton ("Cold");
            espresso = new JRadioButton ("Espresso");
            ristretto = new JRadioButton ("Ristretto");

            style = new ButtonGroup();

            style.add(drip);
            style.add(pourover);
            style.add(cold);
            style.add(espresso);
            style.add(ristretto);

            p2.add(brewingstyle);
            p2.add(drip);
            p2.add(pourover);
            p2.add(cold);
            p2.add(espresso);
            p2.add(ristretto);
        coffee.add(p2);

        drip.setSelected(true);

        JPanel p3 = new JPanel(new GridLayout(3,1));
        hot = new JCheckBox("Hot");
        bread = new JCheckBox("Bread");
        toastbread = new JCheckBox("Toasted Bread");

        p3.add(hot);
        p3.add(bread);
        p3.add(toastbread);

        coffee.add(p3);

        JPanel p4 = new JPanel(new FlowLayout());
        calculate = new JButton("Calculate");
        clear = new JButton("Clear");

        p4.add(calculate);
        p4.add(clear);
        coffee.add(p4);

        JPanel p5 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        amountphp = new JLabel("Amount PHP");
        amounttxt = new JTextField(totalamount + "", 10);

        p5.add(amountphp);
        p5.add(amounttxt);
        coffee.add(p5);

        calculate.addActionListener(this);
        clear.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
            if (e.getSource() == calculate){

                
                if (drinkBox.getSelectedIndex() == 0){
                    drinkamt += 120; 
                } else if (drinkBox.getSelectedIndex() == 1){
                    drinkamt += 115; 
                } else if (drinkBox.getSelectedIndex() == 2){
                   drinkamt += 115; 
                } else if (drinkBox.getSelectedIndex() == 3){
                    drinkamt += 117; 
                } else if (drinkBox.getSelectedIndex() == 4){
                    drinkamt += 125; 
                } else if (drinkBox.getSelectedIndex() == 5){
                    drinkamt += 126; 
                } else if (drinkBox.getSelectedIndex() == 6){
                    drinkamt += 128; 
                }
                

                if (drip.isSelected()){
                    brew += 15;
                } else if (pourover.isSelected()){
                    brew += 17;
                } else if (cold.isSelected()){
                    brew += 12;
                } else if (espresso.isSelected()){
                    brew += 10;
                } else if (ristretto.isSelected()){
                    brew += 12;
                } 

                if (hot.isSelected()){
                    others += 5;
                }

                if (bread.isSelected()){
                    others += 15;
                }

                if (toastbread.isSelected()){
                    others += 23;
                }

                totalamount = drinkamt + brew + others;
                amounttxt.setText(totalamount + "");
            } 
            
            if (e.getSource() == clear){

                drip.setSelected(true);
                pourover.setSelected(false);
                cold.setSelected(false);
                espresso.setSelected(false);
                ristretto.setSelected(false);

                hot.setSelected(false);
                bread.setSelected(false);
                toastbread.setSelected(false);
                
                drinkBox.setSelectedIndex(0);
                
                drinkamt = 0;
                brew = 0;
                others = 0;
                totalamount = 0;
                amounttxt.setText(totalamount + "");
            }
    }

    public static void main(String[] args){
         SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                new AguinaldoQno1();
            }  

        });    
     }

}