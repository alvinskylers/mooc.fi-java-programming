
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = 0;
        while (true) {

            System.out.println("Give a number:");
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("Number of numbers: " + numbers);
                break;

            } else {
                numbers++;
                
            }

        }
    }

}
