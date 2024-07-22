package Lect5;

// Recursion tree image for reference can be found here:
// https://static.takeuforward.org/wp/uploads/2023/02/image-2.png

/**
 * PrintNameNTimesUsingRecursion
 *
 * This class demonstrates the use of recursion to print a name a specified number of times.
 */
public class PrintNameNTimesUsingRecursion {

    /**
     * This method prints the name "Rahul Thakur" recursively until it has printed it 'n' times.
     *
     * @param i The current iteration count, starting from 1.
     * @param n The total number of times the name should be printed.
     */
    public static void printNameRecursively(int i, int n) {
        // Base condition: if i exceeds n, the recursion stops.
        if (i > n) {
            return;
        }

        // Print the name "Rahul Thakur".
        System.out.println("Rahul Thakur");

        // Recursive call to print the name again with incremented count.
        printNameRecursively(i + 1, n);
    }

    public static void main(String[] args) {
        // Number of times the name should be printed.
        int n = 4;

        // Initial call to the recursive method with starting count of 1.
        printNameRecursively(1, n);
    }
}
