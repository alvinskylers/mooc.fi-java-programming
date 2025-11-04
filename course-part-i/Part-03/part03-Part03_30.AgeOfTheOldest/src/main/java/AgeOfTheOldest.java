
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = 0;

        while (true) {
            String data = scanner.nextLine();
            if (data.isEmpty()) {
                break;
            }

            String[] line = data.split(",");
            int currentAge = Integer.parseInt(line[1]);
            if (oldestAge < currentAge) {
                oldestAge = currentAge;
            }
            
        }

        System.out.println("Age of the oldest: " + oldestAge);
    }

}
