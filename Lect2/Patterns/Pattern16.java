import java.util.Scanner;

public class Pattern16 {
    
    /**
     * In this pattern problem, we print a right-angled pyramid where each row 
     * contains the same character repeated multiple times. The character is 
     * determined by the row number, and the number of repetitions is equal to 
     * the row number.
     * 
     * For example, the 1st row will print 1 'A', the 2nd row will print 2 'B's, 
     * and so on. Similar to previous patterns, the outer loop runs N times, and 
     * the inner loop runs i times with the character value incrementing each 
     * time we enter a new row.
     *
     * Example for n = 6:
     * A 
     * B B 
     * C C C 
     * D D D D 
     * E E E E E 
     * F F F F F F
     */
    public static void printPattern(int n) {
        // Outer loop for the number of rows.
        for (int i = 0; i < n; i++) {
            // Inner loop will loop for i times and print the same alphabet.
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + i) + " ");
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
