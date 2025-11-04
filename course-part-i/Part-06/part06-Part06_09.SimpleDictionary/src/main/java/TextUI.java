import java.util.Scanner;

public class TextUI {
    
    private SimpleDictionary dictionary;
    private Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
        
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            
            }  else if (command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);

            } else if (command.equals("search")) {
                System.out.print("To be translated: ");  
                String query = scanner.nextLine();
                String result = dictionary.translate(query);
                if (result == null) {
                    System.out.println("Word " + query + " was not found");
                } else {
                    System.out.println("Translation: " + result);
                }
                
            } else {
                System.out.println("Unknown command");
            }
        }
    }


}
