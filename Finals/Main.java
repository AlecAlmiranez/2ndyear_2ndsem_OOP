import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter username: ");
        Scanner Uinput = new Scanner(System.in);
        String UserName = Uinput.nextLine();
        System.out.println("Enter password:");
        Scanner PasswordInput = new Scanner(System.in);
        String Password = PasswordInput.nextLine();
        if (UserName.equals("admin") && Password.equals("pass")) {
            System.out.println("ADMIN CONTROL MENU");
            System.out.println("1 - Create an Account");
            System.out.println("2 - Delete an Account");
            Scanner choice = new Scanner(System.in);
            int Adminchoice = choice.nextInt();

            Account account = new Account("admin", "pass");

            switch (Adminchoice) {
                case 1: // Account Creation
                    account.createAccount();
                    break;
                case 2: // Account Deletion
                    account.deleteAccount();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            choice.close();
        } else {
            System.out.println("Error: Incorrect username or password");
        }
        Uinput.close();
    }
}
