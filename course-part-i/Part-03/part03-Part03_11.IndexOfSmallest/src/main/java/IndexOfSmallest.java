
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

       fillNumberList(numbers, scanner);
       findNumbersAtIndex(numbers, findLowestNumber(numbers));

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

    }

     public static void fillNumberList(ArrayList<Integer> numberList, Scanner scanner) {
         while (true) {
            int number = scanner.nextInt();
            
            if (number == 9999) {
                break;
            }

            numberList.add(number);
        }

    }

    public static int findLowestNumber(ArrayList<Integer> numberList) {
        int lowest = numberList.get(0);
        for (Integer number: numberList) {
            if (number < lowest) {
                lowest = number;
            }
        }
        System.out.println("Smallest number: " + lowest);
        
        return lowest; 
    }

    public static void findNumbersAtIndex(ArrayList<Integer> numberList, int number) {
        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i) == number) {
                System.out.println("Found at index: " + i);
            }
        }
    }


}
