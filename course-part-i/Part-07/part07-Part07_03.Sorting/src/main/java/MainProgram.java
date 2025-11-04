import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array= {5, 4, 3, 2, 1, 0};
        int[] numbers = {10, 20, 30, 40, 50, 60};
        int[] boxes = {-1, 3, 1, 2};

        indexOfSmallestFrom(boxes, 1);
    }

   public static int smallest(int[] array) {
        int smallest = array[0];
        for (int number:array) {
            if (number < smallest)
                smallest = number; 
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int smallestIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int arrayLength = array.length;
        int smallestIndex = startIndex;
        int smallest = array[smallestIndex];

        for (int i = startIndex; i < arrayLength; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap (int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {          
            int indexOfSmallest = indexOfSmallestFrom(array, i);
            swap(array, i, indexOfSmallest);
        }
    }

}
