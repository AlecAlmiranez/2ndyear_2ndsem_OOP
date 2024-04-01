import java.util.Scanner;

public class Fibo {
    public static void fibonacci() {
        int i = 0;
        int j = 1;
        int k = 0;
        Scanner Uinput = new Scanner(System.in);
        System.out.println("Enter number of elements to be printed: ");
        int elem = Uinput.nextInt();
        System.out.println("Should the output be in numbers or words?");
        System.out.println("1 - Numbers");
        System.out.println("2 - Words");
        int NumOrWords = Uinput.nextInt();
        NumberRepresentation numberRepresentation;
        if (NumOrWords == 1) {
            numberRepresentation = new NumberOnly(); // Creating new instance
        } else {
            numberRepresentation = new NumberWords(); // Creating new instance
        }

        System.out.print(numberRepresentation.convertNumber(i) + ", ");
        System.out.print(numberRepresentation.convertNumber(j) + ", ");

        for (int counter = 1; counter < elem; counter++) {
            k = i + j;
            System.out.print(numberRepresentation.convertNumber(k) + ", ");
            i = j;
            j = k;
        }

        Uinput.close();
    }

    public static void main(String[] args) {
        Fibo.fibonacci();
    }
}
