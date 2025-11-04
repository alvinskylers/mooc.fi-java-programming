
import java.util.ArrayList;
import java.util.Scanner;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        insertIntoList(numbers, scanner);
        printNumbersInRange(numbers, 0, 69);
    }


    public static void insertIntoList(ArrayList<Integer> list, Scanner scanner) {
        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            } 

            list.add(number);
            
        }
    }

    public static void printNumbersInRange(ArrayList<Integer> list, int lowerLimit, int upperLimit) {
        for (Integer number : list) {
            if (lowerLimit <= number && number <= upperLimit) {
                System.out.println(number);
            }
        }

    }
    
    
}
