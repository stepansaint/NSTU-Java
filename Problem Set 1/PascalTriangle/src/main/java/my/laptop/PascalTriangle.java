package my.laptop;

public class PascalTriangle {
    private static final int SIZE = 10;

    public static void main(String[] args) {
        // Check the correctness of initial value
        if (SIZE < 0) {
            System.out.println("Type a positive value of SIZE");
            System.exit(1);
        }

        int[][] arr = new int[SIZE][];

        createPascalTriangle(arr);
        printTriangle(arr);
    }

    /**
     * Creates a Pascal's triangle based on array column size.
     * @param arr the two-dimensional array
     */
    private static void createPascalTriangle(int[][] arr) {
        // Create a triangle
        for (int i = 0; i < SIZE; i++) {
            arr[i] = new int[i + 1];

            // Fill the entire array
            for (int j = 0; j < i + 1; j++) {
                /* Set a value to one for each
                   first and each last element */
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                } else { // Add values of top and left elements
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }
    }

    /**
     * Prints a triangle array to command prompt.
     * @param arr the triangle two-dimensional array
     */
    private static void printTriangle(int[][] arr) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Create a new line
        }
    }
}