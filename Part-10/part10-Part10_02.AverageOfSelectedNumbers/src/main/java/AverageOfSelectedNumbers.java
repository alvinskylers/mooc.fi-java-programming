
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne

        ArrayList<String> numbers = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            } else {
                numbers.add(input);
            }
        }

        double averageOfPositive = numbers.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(number -> number > 0)
            .average()
            .getAsDouble();

        double averageOfNegative = numbers.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(number -> number < 0)
            .average()
            .getAsDouble();    

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();
        
        if (input.equals("p")) {
            if (averageOfPositive == 0) {
                System.out.println("Average of the negative numbers: " + averageOfNegative);
            } else {
                System.out.println("Average of the positive numbers: " + averageOfPositive);
            }
            
        }

        if (input.equals("n")) {
            if (averageOfNegative == 0) {
                System.out.println("Average of the positive numbers: " + averageOfPositive);
            } else {
                System.out.println("Average of the negative numbers: " + averageOfNegative);
            }
        }

    }
}
