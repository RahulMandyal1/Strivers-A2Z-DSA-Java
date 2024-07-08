import java.util.Scanner;

/**
 * HalfDiamondStarPattern
 * This class prints a half diamond star pattern based on user input.
 */
public class HalfDiamondStarPattern {

    /**
     * Prints the half diamond star pattern.
     * @param n The number of rows for half of the diamond.
     */
    public static void printPattern(int n) {
        // Iterate through rows
        for (int i = 0; i <= 2 * n - 1; i++) {
            // Calculate the number of stars for the current row
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }

            // Print stars for the current row
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Move to the next line after printing stars for the current row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        
        // Call the printPattern method to display the half diamond
        printPattern(n);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}