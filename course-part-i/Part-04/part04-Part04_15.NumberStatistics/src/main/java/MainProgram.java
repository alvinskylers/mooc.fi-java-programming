
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        
        
        
        Statistics object = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        System.out.println("Enter numbers: ");

        while (true) {
            int number = scanner.nextInt();
            
            if (number == -1) {
                System.out.println("Count: " + object.getCount());
                System.out.println("Sum: " + object.sum());
                System.out.println("Average: " + object.average());
                System.out.println("Sum of even numbers: " + even.sum());
                System.out.println("Sum of odd numbers: " + odd.sum());
                scanner.close();
                break;
            } 

            object.addNumber(number);

            if (number % 2 == 0) {
                even.addNumber(number);;
            } else {
                odd.addNumber(number);;
            }
        }
    }
}
