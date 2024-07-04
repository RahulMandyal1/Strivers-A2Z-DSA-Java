/**
 * InvertedStarPyramid
 */
public class InvertedStarPyramid {
     /**
     * Prints a star inverted pyramid pattern.
     * @param n The number of rows in the pyramid.
     */
    public static void printPattern(int n) {
        // Outer loop to iterate through rows
        for (int i = n; i >= 0; i--) {
            // Loop to print spaces before the stars
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Loop to print the stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            // Loop to print spaces after the stars (for symmetry)
            for (int l = 0; l < n - i - 1; l++) {
                System.out.print(" ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int n = 7;
        printPattern(n);
    }

}