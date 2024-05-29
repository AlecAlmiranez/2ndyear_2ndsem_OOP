package com.mycompany.puzzle;

import javax.swing.*;
import java.awt.event.*;

public class Puzzle {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("ALMIRAÑEZ_PUZZLE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);
        
        //Houses
        String[] houseColor = {"Select Item", "Yellow", "Blue", "Red", "Green", "White"};
        JLabel HouseLabel = new JLabel("House Color:");
        HouseLabel.setBounds(50, 30, 300, 25);
        frame.add(HouseLabel);
        
        //HouseBox1
        JComboBox<String> comboBox1 = new JComboBox<>(houseColor);
        comboBox1.setBounds(50, 70, 100, 25);
        frame.add(comboBox1);
        
        //HouseBox2
        JComboBox<String> comboBox2 = new JComboBox<>(houseColor);
        comboBox2.setBounds(170, 70, 100, 25);
        frame.add(comboBox2);
            
        //HouseBox3
        JComboBox<String> comboBox3 = new JComboBox<>(houseColor);
        comboBox3.setBounds(290, 70, 100, 25);
        frame.add(comboBox3);
        
        //comboBox4
        JComboBox<String> comboBox4 = new JComboBox<>(houseColor);
        comboBox4.setBounds(410, 70, 100, 25);
        frame.add(comboBox4);
        
        //comboBox5
        JComboBox<String> comboBox5 = new JComboBox<>(houseColor);
        comboBox5.setBounds(530, 70, 100, 25);
        frame.add(comboBox5);
        
        
        //ComboBox6
        JLabel label1 = new JLabel("Nationality:");
        label1.setBounds(50, 110, 300, 25);
        frame.add(label1);

        String[] items1 = { "Select item","American", "Indian", "Filipino", "German", "Korean" };
        JComboBox<String> comboBox6 = new JComboBox<>(items1);
        comboBox6.setBounds(50, 150, 100, 25);
        frame.add(comboBox6);
        
        //ComboBox7
        JComboBox<String> comboBox7 = new JComboBox<>(items1);
        comboBox7.setBounds(170, 150, 100, 25);
        frame.add(comboBox7);
        
        //ComboBox8
        JComboBox<String> comboBox8 = new JComboBox<>(items1);
        comboBox8.setBounds(290, 150, 100, 25);
        frame.add(comboBox8);
        
        //ComboBox9
        JComboBox<String> comboBox9 = new JComboBox<>(items1);
        comboBox9.setBounds(410, 150, 100, 25);
        frame.add(comboBox9);
        
        //ComboBox5
        JComboBox<String> comboBox10 = new JComboBox<>(items1);
        comboBox10.setBounds(530, 150, 100, 25);
        frame.add(comboBox10);
        
        //Line 2
        String[] items2 = { "Select Item" , "Water", "Tea", "Milk", "Coffee" , "Rootbeer"};
        JLabel label2 = new JLabel("Drink: ");
        label2.setBounds(50, 190, 300, 25);
        frame.add(label2);
        
        //ComboBox11
        JComboBox<String> comboBox11 = new JComboBox<>(items2);
        comboBox11.setBounds(50, 230, 100, 25);
        frame.add(comboBox11);
        
        //ComboBox7
        JComboBox<String> comboBox12 = new JComboBox<>(items2);
        comboBox12.setBounds(170, 230, 100, 25);
        frame.add(comboBox12);
        
        //ComboBox8
        JComboBox<String> comboBox13 = new JComboBox<>(items2);
        comboBox13.setBounds(290, 230, 100, 25);
        frame.add(comboBox13);
        
        //ComboBox9
        JComboBox<String> comboBox14 = new JComboBox<>(items2);
        comboBox14.setBounds(410, 230, 100, 25);
        frame.add(comboBox14);
        
        //ComboBox10
        JComboBox<String> comboBox15 = new JComboBox<>(items2);
        comboBox15.setBounds(530, 230, 100, 25);
        frame.add(comboBox15);
        
        //Line 3
        String[] items3 = { "Select Item" , "Oppo", "Desktop", "Laptop", "Tablet" , "Iphone"};
        JLabel label3 = new JLabel("Gadget: ");
        label3.setBounds(50, 270, 300, 25);
        frame.add(label3);
        
        //ComboBox16
        JComboBox<String> comboBox16 = new JComboBox<>(items3);
        comboBox16.setBounds(50, 310, 100, 25);
        frame.add(comboBox16);
        
        //ComboBox17
        JComboBox<String> comboBox17 = new JComboBox<>(items3);
        comboBox17.setBounds(170, 310, 100, 25);
        frame.add(comboBox17);
        
        //ComboBox18
        JComboBox<String> comboBox18 = new JComboBox<>(items3);
        comboBox18.setBounds(290, 310, 100, 25);
        frame.add(comboBox18);
        
        //ComboBox19
        JComboBox<String> comboBox19 = new JComboBox<>(items3);
        comboBox19.setBounds(410, 310, 100, 25);
        frame.add(comboBox19);
        
        //ComboBox20
        JComboBox<String> comboBox20 = new JComboBox<>(items3);
        comboBox20.setBounds(530, 310, 100, 25);
        frame.add(comboBox20);
        
         //Line 4
        String[] items4 = { "Select Item" , "Cat", "Horse", "Bird", "Fish" , "Dogs"};
        JLabel label4 = new JLabel("Pet: ");
        label4.setBounds(50, 350, 300, 25);
        frame.add(label4);
        
        //ComboBox21
        JComboBox<String> comboBox21 = new JComboBox<>(items4);
        comboBox21.setBounds(50, 390, 100, 25);
        frame.add(comboBox21);
        
        //ComboBox22
        JComboBox<String> comboBox22 = new JComboBox<>(items4);
        comboBox22.setBounds(170, 390, 100, 25);
        frame.add(comboBox22);
        
        //ComboBox23
        JComboBox<String> comboBox23 = new JComboBox<>(items4);
        comboBox23.setBounds(290, 390, 100, 25);
        frame.add(comboBox23);
        
        //ComboBox24
        JComboBox<String> comboBox24 = new JComboBox<>(items4);
        comboBox24.setBounds(410, 390, 100, 25);
        frame.add(comboBox24);
        
        //ComboBox25
        JComboBox<String> comboBox25 = new JComboBox<>(items4);
        comboBox25.setBounds(530, 390, 100, 25);
        frame.add(comboBox25);
        
        JButton congratsButton = new JButton("Check Selections");
        congratsButton.setBounds(50, 430, 300, 40);
        frame.add(congratsButton);
        
    congratsButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox<String>[] comboBoxes = new JComboBox[] { 
            comboBox1, comboBox2, comboBox3, comboBox4, comboBox5,
            comboBox6, comboBox7, comboBox8, comboBox9, comboBox10,
            comboBox11, comboBox12, comboBox13, comboBox14, comboBox15,
            comboBox16, comboBox17, comboBox18, comboBox19, comboBox20,
            comboBox21, comboBox22, comboBox23, comboBox24, comboBox25
        };

        
        String[] expectedHouseColors = { "Yellow", "Blue", "Red", "Green", "White" };
        String[] expectedNationalities = { "American", "Indian", "Filipino", "German", "Korean" };
        String[] expectedDrinks = { "Water", "Tea", "Milk", "Coffee", "Rootbeer" };
        String[] expectedGadgets = { "Oppo", "Desktop", "Laptop", "Tablet", "Iphone" };
        String[] expectedPets = { "Cat", "Horse", "Bird", "Fish", "Dogs" };

        boolean allCorrect = true;
        for (int j = 0; j < comboBoxes.length; j++) {
            String selectedItem = (String) comboBoxes[j].getSelectedItem();
            String expectedValue = "";

            
            if (j < 5) {
                expectedValue = expectedHouseColors[j];
            } else if (j < 10) {
                expectedValue = expectedNationalities[j - 5];
            } else if (j < 15) {
                expectedValue = expectedDrinks[j - 10];
            } else if (j < 20) {
                expectedValue = expectedGadgets[j - 15];
            } else {
                expectedValue = expectedPets[j - 20];
            }

            if (!selectedItem.equals(expectedValue)) {
                allCorrect = false;
                break;
            }
        }

        if (allCorrect) {
            JOptionPane.showMessageDialog(frame, "Congratulations! All selections are correct.");
        } else {
            JOptionPane.showMessageDialog(frame, "Not all selections are correct.");
        }
    }
});


        frame.setVisible(true);
    }
}
