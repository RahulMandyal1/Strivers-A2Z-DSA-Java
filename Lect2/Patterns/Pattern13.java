import java.util.Scanner;

/**
 * Pattern13
 */
public class Pattern13 {

    /**
     * In this problem, we just have to print a right-angled number pyramid.
     * Here, we also have to increase the number each time we print it.
     * For printing the right-angled pyramid, the outer loop runs for N times 
     * and the inner loop runs for i times. To print an increasing number 
     * pyramid, we just have to increment the number inside the inner loop 
     * so that after printing the number each time, it increases by 1.
     */
    public static void printPattern(int n) {
        // Starting number.
        int num = 1;
      
        // Outer loop for the number of rows.
        for (int i = 1; i <= n; i++) {
          
            // Inner loop will loop for i times and
            // print numbers increasing by 1 each time.
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
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
        
        // Call the printPattern method to display the number pyramid pattern.
        printPattern(n);

        // Close the scanner to prevent resource leak.
        scanner.close();
    }
}
