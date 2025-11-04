
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startCount = scanner.nextInt();

        while (startCount <= 100) {
            System.out.println(startCount);
            startCount++;
        }
    }
}
