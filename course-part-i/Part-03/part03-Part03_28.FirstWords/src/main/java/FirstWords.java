
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.isEmpty()) {
                break;
            }
            
            firstWord(sentence);
        }

    }

    public static void firstWord(String sentence) {
        String[] words = sentence.split(" ");
        System.out.println(words[0]);
    }
}
