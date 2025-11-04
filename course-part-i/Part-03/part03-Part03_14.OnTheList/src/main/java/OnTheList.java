
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } 

            list.add(input);
        }

        System.out.println("Search for? ");
        String keyword = scanner.nextLine();

        findItemOnList(list, keyword );

    }


    public static void findItemOnList(ArrayList<String> list, String keyword) {
        int foundWords = 0;
        for (String word : list) {
            if (word.equals(keyword)) {
                System.out.println(keyword + " was found!");
                foundWords++;
                break;
            }
        }
        
        if (foundWords == 0) {
            System.out.println( keyword + " was not found!");
        }

    }
}
