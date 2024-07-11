import java.util.Scanner;

public class Pattern14 {

    /**
     * In this pattern problem, we print alphabets instead of numbers,
     * making the pattern look like a right-angled triangle.
     * The outer loop will run for N rows and the inner loop will loop 
     * for i alphabets in each row where i is the row number.
     * Alphabets in each row will start from 'A' each time we enter a new row 
     * and will loop till the (A + i)th alphabet in that row.
     *
     * Example for n = 6:
     * A 
     * A B 
     * A B C 
     * A B C D 
     * A B C D E 
     * A B C D E F 
     */
    public static void printPattern(int n) {
        // Outer loop for the number of rows.
        for (int i = 0; i < n; i++) {
            // Inner loop will loop for i times and print alphabets.
            for (char j = 'A'; j <= 'A' + i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next row and give a line break.
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows.
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        
        // Call the printPattern method to display the alphabet pyramid pattern.
        printPattern(n);

        // Close the scanner to prevent resource leak.
        scanner.close();
    }
}
