

import java.lang.reflect.Array;
import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());

        searchIndex(array, searching);
        // Implement the search functionality here
    }


    public static void searchIndex(int[] numbers, int number) {
        boolean found = false;
        for (int i = 0; i < numbers.length;i++) {
            if (numbers[i] == number) {
                found = true;
                System.out.println(number + " is at index " + i + ".");
            }
        }
        if (found == false) {
            System.out.println(number + " was not found.");
        }

    }

}
