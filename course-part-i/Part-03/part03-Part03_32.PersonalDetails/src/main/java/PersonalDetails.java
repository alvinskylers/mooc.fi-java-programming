
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years = 0;
        int yearSum = 0;
        int longest = 0;
        String longestName = "";

        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }

            String[] data = line.split(",");
            int currentLetters = lettersInName(data[0]);
            years++;
            yearSum += Integer.parseInt(data[1]);

            if (longest < currentLetters) {
                longest = currentLetters;
                longestName = data[0];
            }


        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + 1.0 * yearSum / years);

    }


    public static int lettersInName (String name) {
        String[] letters = name.split("");
        return letters.length + 1;
    }

}
