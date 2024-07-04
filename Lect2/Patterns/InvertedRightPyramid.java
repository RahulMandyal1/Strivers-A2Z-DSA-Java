/*
            *********
            ********
            *******
            ******
            *****
            ****
            ***
            **
            *
*/


public class InvertedRightPyramid{

   /**
     * Prints a right-angled * pyramid pattern.
     * @param n The number of rows in the pyramid.
     */
    public static void printPattern(int n) {
        // Outer loop for rows
        for (int i = n; i >0; i--) {
            // Inner loop for columns
            for (int j = 0; j <= i; j++) {
                // Print numbers starting from 1
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Set the number of rows for the pyramid
        int n = 8;
        // Call the printPattern method
        printPattern(n);
    }
}