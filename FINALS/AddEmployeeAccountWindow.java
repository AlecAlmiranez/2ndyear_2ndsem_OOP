package com.mycompany.employeedeliverables;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Alec
 */
public class AddEmployeeAccountWindow extends JFrame {
    private JTextField nameField;
    private JTextField employeeNumberField;
    private JTextField passwordField;
    private JTextField emailField;
    private JTextField recoveryField;
    private Connection connection;
    private AdminDashboard adminDashboard;

    /**
     * Popup window for when adding a new employee
     * Inherits connection from admin dashboard
     * @param connection
     * @param adminDashboard
     */
    public  AddEmployeeAccountWindow(Connection connection, AdminDashboard adminDashboard) {
        this.connection = connection;
        this.adminDashboard = adminDashboard;

        setTitle("Add Employee Account");
        setSize(300, 250);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2, 10, 10));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JLabel nameLabel = new JLabel("Name:");
        add(nameLabel);
        nameField = new JTextField();
        add(nameField);
        
        JLabel employeeNumLabel = new JLabel("Employee Number:");
        add(employeeNumLabel);
        employeeNumberField = new JTextField();
        add(employeeNumberField);
        
        JLabel passwordLabel = new JLabel("Password:");
        add(passwordLabel);
        passwordField = new JTextField();
        add(passwordField);
        
        JLabel emailLabel = new JLabel("Email:");
        add(emailLabel);
        emailField = new JTextField();
        add(emailField);
        
        JLabel recoveryLabel = new JLabel("Recovery:");
        add(recoveryLabel);
        recoveryField = new JTextField();
        add(recoveryField);

        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (isValidEmail(emailField.getText())) {
                        addEmployeeAccount();
                        adminDashboard.loadEmployeeData(); // Reload employee data in AdminDashboard
                        dispose(); // Close the window after adding
                    } else {
                        JOptionPane.showMessageDialog(AddEmployeeAccountWindow.this, "Invalid email address.");
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(AddEmployeeAccountWindow.this, "Failed to add employee account.");
                }
            }
        });
        add(addButton);
    }

    private void addEmployeeAccount() throws SQLException {
        String query = "INSERT INTO employee (EmployeeNum, Name, Password, Email, Recovery) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, Integer.parseInt(employeeNumberField.getText()));
            statement.setString(2, nameField.getText());
            statement.setString(3, passwordField.getText());
            statement.setString(4, emailField.getText());
            statement.setInt(5, Integer.parseInt(recoveryField.getText()));
            statement.executeUpdate();
        }
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
