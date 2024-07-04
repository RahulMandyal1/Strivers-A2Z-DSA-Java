
import java.util.Scanner;


/*
            123456
            12345
            1234
            123
            12
            1
*/

public class InvertedRightNumberedPyramid {
    /**
     * Prints a right-angled * pyramid pattern.
     * @param n The number of rows in the pyramid.
     */

    public static void printPattern(int n) {
        // Outer loop for rows
        for (int i = n; i >=50; i--) {
            // Inner loop for columns
            for (int j = 0; j <= i; j++) {
                // Print numbers starting from 
                System.out.print(j+1);
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {

       // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);


      // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows for the pyramid: ");
        int n = scanner.nextInt();


        // Call the printPattern method
        printPattern(n);
    }

}
