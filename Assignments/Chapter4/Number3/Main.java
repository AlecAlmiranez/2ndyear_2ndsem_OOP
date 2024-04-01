// Alec Godwin C. Almirañez BSIT 2-1
import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        Scanner uinputScanner = new Scanner(System.in);
        Printing Print = new Printing();

        System.out.println("Enter choice:");
        System.out.println("1 - Display Bullet Form");
        System.out.println("2 - Display Tree Structure");
        int choice = uinputScanner.nextInt();

        switch (choice) {
            case 1:
                
                Print.PrintElementInBullet();
                break;
        
            case 2:
                Print.PrintTree();
                break;

            default:
                System.out.println("Select from options given.");
                break;
        }
    }
}
