
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfTheOldest = "";
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
                nameOfTheOldest = line[0];
            }
        }

        System.out.println("Name of the oldest: " + nameOfTheOldest);
    }
}
