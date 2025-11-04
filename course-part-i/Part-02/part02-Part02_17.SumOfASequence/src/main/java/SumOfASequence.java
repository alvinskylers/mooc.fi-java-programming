
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("The last number? ");
        int number = scanner.nextInt();
        int start = 0;

        for (int i = 1; i <= number; i++ ){
            start += i;
        }

        System.out.println("The sum is " + start);

    }
}
