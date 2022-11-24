package my.laptop;

public class Sorting {
    private static final int LENGTH = 1000;

    public static void main(String[] args) {
        // Check the correctness of initial value
        if (LENGTH < 0) {
            System.out.println("Type a positive value of LENGTH");
            System.exit(1);
        }

        int[] arr = new int[LENGTH];

        randomlyFillArray(arr);
        bubbleSort(arr);
    }

    /**
     * Fills an array with random values from 0 to 100.
     * @param arr the one-dimensional array
     */
    private static void randomlyFillArray (int[] arr) {
        for (int i = 0; i < LENGTH; i++) {
            arr[i] = (int) (Math.random() * 101);
        }
    }

    /**
     * Sorts an array from the lowest number to the greatest using Bubble sort.
     * @param arr the one-dimensional array
     */
    private static void bubbleSort(int[] arr) {
        int temp;
        boolean isChanged;

        for (int i = 0; i < LENGTH; i++) {
            isChanged = false;

            for (int j = 0; j < LENGTH - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isChanged = true;
                }
            }

            /*
             Check whether the array has been modified
             in full iteration by "i"
             */
            if (!isChanged) {
                return;
            }
        }
    }
}