
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>(); 

        fillNumberList(scanner, numbers);
        averageOfList(numbers);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }

    public static void fillNumberList(Scanner scanner, ArrayList<Integer> numbers) {
        while (true) {
            int number = scanner.nextInt();
            
            if (number == -1) {
                break;
            }
            numbers.add(number);
        }
    }

    public static void averageOfList(ArrayList<Integer> numbers) {
        int sum = 0;
        int total = numbers.size();

        for (Integer number : numbers) {
            sum += number;
        }

        System.out.println("Average: " + 1.0 * sum / total);
    }
}
