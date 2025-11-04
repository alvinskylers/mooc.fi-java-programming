
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int negativeNumbers = 0;
        
        while (true) {

            System.out.println("Give a number:");
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("Number of negative numbers: " + negativeNumbers);
                break;

            }  else if (number < 0) {
                negativeNumbers++;

            } else {
                continue;
                
            }
        } 
    }
}
