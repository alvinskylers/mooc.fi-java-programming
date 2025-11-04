import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    
    private Scanner scanner;
    private ArrayList<Bird> birds;


    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birds = new ArrayList<>();
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            if (command.equals("Quit")) {
                break;
            } 

            if (command.equals("Add")) {
                addBird();
            }

            if (command.equals("Observation")) {
                addObservation();
            }

            if (command.equals("All")) {
                printBirds();
            }

            if (command.equals("One")) {
                printBird();
            }
        }
    }

    private void addBird(){
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Name in Latin: ");
        String latin = scanner.nextLine();

        this.birds.add(new Bird(name, latin));
    }

    private Bird findBird(String birdName) {
        for (Bird bird:birds) {
            if (bird.getName().equals(birdName)) {
                return bird;
            }
        }
        return null;
    }

    private boolean doesHaveBird(String birdName) {
        for (Bird bird:birds) {
            if (bird.getName().equals(birdName)) {
                return true;
            }
        }
        return false;
    }

    private void addObservation() {
        System.out.print("Bird? ");
        String bird = scanner.nextLine();

        if (!doesHaveBird(bird)) {
            System.out.println("Not a bird!");
        } else {
            Bird observed = findBird(bird);
            observed.addObservation();
        }
    }

    private void printBirds() {
        for (Bird bird:birds) {
            System.out.println(bird);
        }
    }

    private void printBird() {
        System.out.print("Bird: ");
        String bird = scanner.nextLine();

        if (!doesHaveBird(bird)) {
            System.out.println("Not a bird!");
        } else {
            System.out.print(findBird(bird));
        }
    }



}
