
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second =0;

        while (true) {
            System.out.println("First: " + first + "/100\nSecond: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] extract = input.split(" ");
            String command = extract[0];
            int amount = Integer.valueOf(extract[1]);

            if (command.equals("add")) {
                if (0 < amount) {
                    first += amount;
                    if (first > 100) {
                        first = 100;
                    }
                }
                
            }

            if (command.equals("move")) {
                int currentAmount = first;
                
                if (currentAmount < amount) {
                    second += currentAmount;
                    first -= currentAmount;
                } else {
                    second += amount;
                    first -= amount;
                }

                if (second > 100) {
                    second = 100;
                }
            }

            if (command.equals("remove")) {
                second -= amount;
                
                if (second < 0) {
                    second = 0;
                }

                
            }

        }
    }

}
