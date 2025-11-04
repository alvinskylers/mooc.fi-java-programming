
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.isEmpty()) {
                break;
            }
            printLineByLine(sentence);

        }
        
    }

    public static void printLineByLine(String sentence) {
        String[] words = sentence.split(" ");

        for (String word : words) {
            System.out.println(word);
        }

    }
    
}
