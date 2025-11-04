
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("First number? ");
        int start = scanner.nextInt();

        System.out.print("Last number? ");
        int last = scanner.nextInt();

        int count = 0;

        for (int i=start;i<=last;i++) {
            count += i;
        }

        System.out.println("The sum is " + count);
    }
}
