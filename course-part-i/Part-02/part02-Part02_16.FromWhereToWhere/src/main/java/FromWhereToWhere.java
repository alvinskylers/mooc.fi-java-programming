
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to? ");
        int limit = scanner.nextInt();
        System.out.println("Where from? ");
        int start = scanner.nextInt();

        while (start <= limit) {
            System.out.println(start);
            start++;
        }
    }
}
