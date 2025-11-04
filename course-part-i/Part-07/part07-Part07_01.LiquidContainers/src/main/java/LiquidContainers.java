
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.print("First: " + firstContainer + "/100 \nSecond: " + secondContainer + "/100 \n");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;  
            } 

            String[] command = input.split(" ");
            String type = command[0];
            int amount = Integer.valueOf(command[1]);

            if (type.equals("add")) {
                if (amount > 0) {
                    firstContainer += Integer.valueOf(command[1]);
                    if (firstContainer > 100) {
                        firstContainer = 100;
                    } 
                }

            } else if (type.equals("move")) {
                if (amount > 0) {                       
                    if (firstContainer <= amount) {
                        secondContainer += firstContainer;
                        firstContainer -= amount;
                    } else {
                        secondContainer += amount;
                        firstContainer -= amount;
                    }
                    
                }

                if (firstContainer < 0) 
                    firstContainer = 0;

                if (secondContainer > 100) 
                    secondContainer = 100;
    
            } else if (type.equals("remove")) {
                if (amount > 0) {
                    secondContainer -= amount;
                }

                if (secondContainer < 0) 
                    secondContainer = 0;

            } else {
                System.out.println("unidentified command.");
            }

        }
    }

}
