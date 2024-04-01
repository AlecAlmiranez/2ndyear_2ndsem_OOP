import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    private String name;
    private String password;

    public Account(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void createAccount() {
        try {
            Scanner scanner = new Scanner(System.in);

            //Employee Name
            System.out.println("Enter Employee Name:");
            String name = scanner.nextLine();

            //Employee Number
            System.out.println("Enter Employee Number:");
            int employeeNumber = scanner.nextInt();

            // Employee Password
            System.out.println("Enter Password:");
            scanner.nextLine();
            String password = scanner.nextLine();

            //Team Leader Or Not
            System.out.println("Is the account a team leader? (yes/no)");
            String teamLeaderInput = scanner.nextLine().toLowerCase();
            boolean isTeamLeader = teamLeaderInput.equals("yes");

            //Gathering what projects employee is involved in
            System.out.println("Enter Projects Involved (one per line, type 'done' to finish):");
            ArrayList<String> projects = new ArrayList<>();
            String project = "";
            while (!project.equalsIgnoreCase("done")) {
                project = scanner.nextLine();
                if (!project.equalsIgnoreCase("done")) {
                    projects.add(project);
                }
            }

            // Create Account object
            Account account = new Account(name, password);

            // Write account details to file
            FileWriter accountWriter = new FileWriter(employeeNumber + ".txt");
            accountWriter.write(account.getName() + "\n");
            accountWriter.write(Integer.toString(employeeNumber) + "\n");
            accountWriter.write(account.getPassword() + "\n");
            accountWriter.write(isTeamLeader + "\n");
            for (String proj : projects) {
                accountWriter.write(proj + "\n");
            }
            accountWriter.close();
            System.out.println("Account created successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred while creating account.");
            e.printStackTrace();
        }
    }

    public void deleteAccount() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Deleting Account");
            System.out.println("Enter Employee Number:");
            int employeeNumber = scanner.nextInt();

            File fileToDelete = new File(employeeNumber + ".txt");
            if (fileToDelete.exists()) {
                System.out.println("Delete " + employeeNumber + ".txt?");
                String confirm = scanner.next().toLowerCase();
                if (confirm.equals("yes")) {
                    if (fileToDelete.delete()) {
                        System.out.println("Account deleted successfully.");
                    } else {
                        System.out.println("Failed to delete account.");
                    }
                } else {
                    System.out.println("Account deletion canceled.");
                }
            } else {
                System.out.println("No account with that number exists.");
            }
        } catch (Exception e) {
            System.out.println("Error occurred while deleting account.");
            e.printStackTrace();
        }
    }
}
