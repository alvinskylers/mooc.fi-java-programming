
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first + "\n" + "Second: "+ second);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] extract = input.split(" "); 
            String command = extract[0];
            int amount = Integer.valueOf(extract[1]);

            if (command.equals("add")) {
                first.add(amount);
            } 

            if (command.equals("move")) {
                int current = first.contains();

                if (current < amount) {
                    first.remove(amount);
                    second.add(current);
                } else {
                    first.remove(amount);
                    second.add(amount);
                } 
            }

            if (command.equals("remove")) {
                second.remove(amount);
            }

        }
    }
}
