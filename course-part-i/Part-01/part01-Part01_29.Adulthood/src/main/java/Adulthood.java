
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("How old are you?");
        int age = scan.nextInt();

        if (age >= 18) {
            System.out.println("you are an adult");
        } else {
            System.out.print("you are not an adult");
        }
    }
}
