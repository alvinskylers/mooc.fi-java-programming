import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        filterProgram(scanner, start(scanner, programs));

    }

    public static ArrayList<TelevisionProgram> start(Scanner scanner, ArrayList<TelevisionProgram> tvProgram) {

        while (true) {
            System.out.print("Name: ");
            String programName = scanner.nextLine();

            if (programName.isEmpty()) {
                break;
            }

            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());

            tvProgram.add(new TelevisionProgram(programName, duration));
        }

        return tvProgram ;
    }

    public static void filterProgram( Scanner scanner, ArrayList<TelevisionProgram> televisionPrograms) {
        
        System.out.println("Program's maximum duration? ");
        int maxDuration = scanner.nextInt();

        for (TelevisionProgram program : televisionPrograms) {
            if (program.getDuration() <= maxDuration) {
                System.out.println(program);
            }
        }

    }


}
