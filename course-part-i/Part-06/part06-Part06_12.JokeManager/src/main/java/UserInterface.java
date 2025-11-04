import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    private JokeManager manager;


    public UserInterface(JokeManager manager, Scanner scanner){
        this.manager = manager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            String input = getInput();
          
            if (input.equals("X")) {
                break;
            } else if (input.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                manager.addJoke(joke);
            } else if (input.equals("2")) {
                System.out.println(manager.drawJoke());
            } else if (input.equals("3")) {
                manager.printJokes();
            } else {
                System.out.println("Unknown command.");
            }
        }
    }

   private String getInput() {
        System.out.println("Commands: \n1 - add joke \n2 - draw joke \n3 - list jokes \nX - exit");
        String input = scanner.nextLine();
        return input;
    }


}
 