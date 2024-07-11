import java.util.Scanner;

public class Pattern15 {

    /**
     * In this pattern problem, we print alphabets in a right-angled triangle,
     * but in reverse order, making the rows decrease in length.
     * The outer loop will run for N rows, and the inner loop will loop 
     * for decreasing number of alphabets in each row.
     * Alphabets in each row will start from 'A' each time we enter a new row 
     * and will loop till the (A + (n - i - 1))th alphabet in that row.
     *
     * Example for n = 6:
     * A B C D E F 
     * A B C D E 
     * A B C D 
     * A B C 
     * A B 
     * A 
     */
    public static void printPattern(int n) {
        // Outer loop for the number of rows.
        for (int i = 0; i < n; i++) {
            // Inner loop will loop for decreasing number of times and print alphabets.
            for (char j = 'A'; j <= 'A' + (n - i - 1); j++) {
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
        
        // Call the printPattern method to display the reverse alphabet triangle pattern.
        printPattern(n);

        // Close the scanner to prevent resource leak.
        scanner.close();
    }
}
