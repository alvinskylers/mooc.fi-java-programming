
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int max = scanner.nextInt();

        while (count <= max) {
            System.out.println(count);
            count++;
        }

    }

}
