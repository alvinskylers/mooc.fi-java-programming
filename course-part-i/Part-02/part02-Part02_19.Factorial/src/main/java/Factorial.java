
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int number = scanner.nextInt();
        int currentValue = 1;

        if (number == 0) {
            System.out.println("Factorial: 1");
        } else {
            for (int i=1;i<=number;i++) {
                currentValue *= i;
            }
            System.out.println("Factorial: " + currentValue);

        }
    }
}
