
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
       
        try ( Scanner scammer = new Scanner(Paths.get("data.txt"))) {
            while (scammer.hasNextLine()) {
                String row = scammer.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    
}
