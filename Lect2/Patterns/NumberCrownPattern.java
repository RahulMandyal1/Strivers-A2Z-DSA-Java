import java.util.Scanner;

public class NumberCrownPattern {
    
    /**
     * Prints a combination of a numbered pyramid and a reverse-numbered pyramid pattern.
     * In each row, numbers are printed from 1 to the row number, followed by spaces, 
     * and then numbers from the row number back to 1. 
     * The outer loop runs from 1 to N, and there are three inner loops for printing numbers, 
     * spaces, and reverse numbers respectively.
     * Initially, the spaces are calculated as 2*(N-1) for the first row, 
     * and then the spaces decrease by 2 in each subsequent iteration.
     * @param n The number of rows for the pattern.
     */
    public static void printPattern(int n) {

        int spaces = 2 * (n - 1);

        // Iterate through each row
        for (int i = 1; i <= n; i++) {

            // Print numbers from 1 to the current row number
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print spaces
            for (int k = 0; k <= spaces; k++) {
                System.out.print(" ");
            }

            // Print numbers from the current row number to 1 in reverse
            for (int l = i; l >= 1; l--) {
                System.out.print(l);
            }

            // Decrease the number of spaces by 2 for the next row
            spaces -= 2;

            // Move to the next line after printing numbers and spaces for the current row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        
        // Call the printPattern method to display the number crown pattern
        printPattern(n);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
