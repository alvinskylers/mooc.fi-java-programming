
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.print("First: " + firstContainer + "\nSecond: " + secondContainer + "\n");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] command = input.split(" ");
            String type = command[0];
            int amount = Integer.valueOf(command[1]);

            if (type.equals("add")) {
                firstContainer.add(amount);
            } else if (type.equals("move")) {
                if (firstContainer.contains() != 0) {

                    if (firstContainer.contains() < amount) {
                        secondContainer.add(firstContainer.contains());
                        firstContainer.remove(amount);
                    }
                    
                    if (firstContainer.contains() >= amount){
                         secondContainer.add(amount);
                        firstContainer.remove(amount);
                       
                    }
                }
            } else if (type.equals("remove")) {
                secondContainer.remove(amount);
            } else {
                System.out.println("unidentified command...");
            }
        }
    }

}
