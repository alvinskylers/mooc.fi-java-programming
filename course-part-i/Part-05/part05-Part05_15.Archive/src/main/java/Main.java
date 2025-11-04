
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    printItems(spawnList(scanner));

    }

    public static ArrayList<Item> spawnList(Scanner scanner) {
        ArrayList<Item> items = new ArrayList<>();
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)" );
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            items.add(new Item(identifier, name));
        }

        return items;
    }

    public static void printItems(ArrayList<Item> items) {
        ArrayList<Item> noDupes = new ArrayList<>();
        for (Item item : items) {
            if (!(noDupes.contains(item))) {
                noDupes.add(item);
            }
        }
        System.out.println("==Items==");
        for (Item item : noDupes) {
            System.out.println(item.getIdentifier() + ": " + item.getName());
        }
    }

}
