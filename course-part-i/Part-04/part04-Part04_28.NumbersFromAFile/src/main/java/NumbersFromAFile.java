
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        ArrayList<Integer> numbers = new ArrayList<>();
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                int number = Integer.valueOf(fileReader.nextLine());
                numbers.add(number);
            }
        } catch(Exception e) {
            System.out.println("Error message: " + e);
        }

        int count = 0;
        for (Integer number : numbers) {
            if (lowerBound <= number && number <= upperBound) {
                count++;
            }
        }

        System.out.println("Numbers: " + count);
    }


}
