
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNext()) {
                String row  = fileReader.nextLine();
                String[] data = row.split(",");
                System.out.print(data[0] + ", age" + ": ");
                if (1 == Integer.valueOf(data[1])) {
                    System.out.print(data[1] + " year \n");
                } else {
                    System.out.print(data[1] + " years \n");
                }
            }

        } catch (Exception e) {

        }
        
    }

}
