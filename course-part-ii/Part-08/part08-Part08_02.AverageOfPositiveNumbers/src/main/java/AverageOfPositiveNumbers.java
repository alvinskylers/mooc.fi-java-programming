
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        while (true) {
            String input = scanner.nextLine();
            int number = Integer.valueOf(input);

            if (0 < number ) {
                sum += number;
                count++;
            } 

            if (number == 0) {
                if (count == 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                } else {
                    System.out.println(1.0 * sum / count);
                    break;
                }
            }
        }
    }
}
