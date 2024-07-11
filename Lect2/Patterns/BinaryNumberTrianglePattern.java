import java.util.Scanner;

public class BinaryNumberTrianglePattern {

    /**
     * Prints a binary number triangle pattern.
     * @param n The number of rows for the pattern.
     */
    public static void printPattern(int n) {
        // Iterate through each row
        for (int i = 0; i <= n; i++) {

            // Print binary numbers for the current row
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }

            // Move to the next line after printing numbers for the current row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        
        // Call the printPattern method to display the binary number triangle pattern
        printPattern(n);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
