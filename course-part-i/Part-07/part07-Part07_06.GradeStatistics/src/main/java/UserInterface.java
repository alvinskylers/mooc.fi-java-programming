import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    private Points points;

    public UserInterface  (Scanner scanner, Points points) {
        this.scanner = scanner;
        this.points = points;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                System.out.println("Point average (all): " + this.points.average());
                System.out.println("Point average (passing): " + this.points.averagePassed());
                System.out.println("Pass percentage: " + this.points.passedPercentage());
                System.out.println("Grade Distribution: \n" + this.points.printGrade());
                break;
            } else {
                this.points.addPoint(input);
            }
            
        }
    }



}


